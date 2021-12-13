
package implementacion;

import conexion.ConexionDB;
import entidades.Detalle;
import entidades.Producto;
import entidades.Ventas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ImplVentas {
    
    ConexionDB cn = new ConexionDB();
    Connection con;
    String sql = "";
    String query = "";
    PreparedStatement stmt = null;
    ResultSet rset = null;
    int r;
    
    public Producto BuscarPro(String nombre){
        Producto producto = new Producto();
        String sql = "SELECT * FROM producto WHERE producto_nombre = ?";
        try {
            con = cn.conectaMysql();
            stmt = con.prepareStatement(sql);
            stmt.setString(1, nombre);
            rset = stmt.executeQuery();
            if (rset.next()) {
                producto.setId(rset.getString("producto_id"));
                producto.setNombre(rset.getString("producto_nombre"));
                producto.setPrecio(rset.getDouble("producto_precio"));
                producto.setStock(rset.getInt("producto_stock"));
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return producto;
    }
    
    public int IdVenta() {
        int id = 0;
        String sql = "SELECT MAX(venta_id) FROM ventas";
        try {
            con = cn.conectaMysql();
            stmt = con.prepareStatement(sql);
            rset = stmt.executeQuery();
            if (rset.next()) {
                id = rset.getInt(1);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return id;
    }
    
    public int RegistrarVenta(Ventas v) {
        String sql = "INSERT INTO ventas (venta_nombrecli, venta_total, venta_fecha) VALUES (?,?,?)";
        try {
            con = cn.conectaMysql();
            stmt = con.prepareStatement(sql);
            stmt.setString(1, v.getNombre_cli());
            stmt.setDouble(2, v.getTotal());
            stmt.setString(3, v.getFecha());
            stmt.execute();
        } catch (SQLException e) {
            System.out.println(e.toString());
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
        return r;
    }
    
    public int RegistrarDetalle(Detalle Dv) {
        String sql = "INSERT INTO detalle (producto_id, cantidad, producto_precio, venta_id) VALUES (?,?,?,?)";
        try {
            con = cn.conectaMysql();
            stmt = con.prepareStatement(sql);
            stmt.setString(1, Dv.getId_pro());
            stmt.setInt(2, Dv.getCantidad());
            stmt.setDouble(3, Dv.getPrecio());
            stmt.setInt(4, Dv.getId());
            stmt.execute();
        } catch (SQLException e) {
            System.out.println(e.toString());
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
        return r;
    }
    public List Listarventas() {
        List<Ventas> ListaVenta = new ArrayList();
        String sql = "SELECT * FROM ventas";
        try {
            con = cn.conectaMysql();
            stmt = con.prepareStatement(sql);
            rset = stmt.executeQuery();
            while (rset.next()) {
                Ventas vent = new Ventas();
                vent.setId(rset.getInt("venta_id"));
                vent.setNombre_cli(rset.getString("venta_nombrecli"));
                vent.setTotal(rset.getDouble("venta_total"));
                vent.setFecha(rset.getString("venta_fecha"));
                ListaVenta.add(vent);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return ListaVenta;
    }
    
    public boolean ActualizarStock(int cant, String id) {
        String sql = "UPDATE producto SET producto_stock = ? WHERE producto_id = ?";
        try {
            con = cn.conectaMysql();
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, cant);
            stmt.setString(2, id);
            stmt.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }
    }
}
