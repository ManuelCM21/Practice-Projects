package implementacion;

import conexion.ConexionDB;
import entidades.Producto;
import interfaceDao.IProductosDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import utils.Generator;

public class ImplProducto implements IProductosDao{

    ConexionDB cn = new ConexionDB();
    Connection con;
    ArrayList<Producto> listaProductos = new ArrayList<>();
    String sql = "";
    String query = "";
    PreparedStatement ps;
    Statement stmt = null;
    ResultSet rset = null;

    Generator gn = new Generator();
    Producto pr = new Producto();

    public int registrarProducto(Producto p) {
        int i = 0;
        if (pr != null) {
            String idproducto = gn.generatorId();
            try {
                query = " insert into producto (producto_id, producto_nombre,producto_marca,producto_modelo,producto_talla,producto_precio,producto_stock) "
                        + " values('" + idproducto + "','" + p.getNombre() + "','" + p.getMarca() + "','" + p.getModelo() + "','" + p.getTalla() + "','" + p.getPrecio() + "','" + p.getStock()+ "') ";
                stmt = cn.conectaMysql().createStatement();
                i = stmt.executeUpdate(query);
            } catch (SQLException ex) {
                ex.getMessage();
            }
        }
        return i;
    }

    public ArrayList<Producto> reporteProductos() {
        ArrayList<Producto> listaProducto = new ArrayList();
        try {
            sql = " select * from producto ";
            stmt = cn.conectaMysql().createStatement();
            rset = stmt.executeQuery(sql);
            while (rset.next()) {
                Producto pr = new Producto();
                pr.setId(rset.getString("producto_id"));
                pr.setNombre(rset.getString("producto_nombre"));
                pr.setMarca(rset.getString("producto_marca"));
                pr.setModelo(rset.getString("producto_modelo"));
                pr.setTalla(rset.getString("producto_talla"));
                pr.setPrecio(Double.parseDouble(rset.getString("producto_precio")));
                pr.setStock(Integer.parseInt(rset.getString("producto_stock")));
                listaProducto.add(pr);
            }
        } catch (SQLException ex) {
            ex.getMessage();
        }
        return listaProducto;
    }

    public int eliminarRegistroProducto(String id) {
        int i = 0;
        try {
            sql = " delete from producto where producto_id='" + id + "' ";
            stmt = cn.conectaMysql().createStatement();
            i = stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            ex.getMessage();
        }
        return i;
    }

    public int actualizarRegistroProducto(Producto pro) {
        int i = 0;
        try {
            sql = " update  producto "
                    + " set producto_nombre='" + pro.getNombre() + "', producto_marca='" + pro.getMarca() + "', producto_modelo='" + pro.getModelo() + "', producto_talla='" + pro.getTalla() + "', producto_precio='" + pro.getPrecio() + "', producto_stock='" + pro.getStock()+ "' "
                    + " where producto_id  ='" + pro.getId()+ "' ";
            stmt = cn.conectaMysql().createStatement();
            i = stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            ex.getMessage();
        }
        return i;
    }
    
    public Producto BuscarId(String id){
        Producto pro = new Producto();
        String sql = "SELECT * FROM producto WHERE producto_id = '"+pro.getId()+"' ";
        try {
            con = cn.conectaMysql();
            ps = con.prepareStatement(sql);
            ps.setString(1, id);
            rset = ps.executeQuery();
            if (rset.next()) {
                pro.setId(rset.getString("producto_id"));
                pro.setNombre(rset.getString("producto_nombre"));
                pro.setStock(rset.getInt("producto_stock"));
                pro.setPrecio(rset.getDouble("producto_precio"));
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return pro;
    }
}
