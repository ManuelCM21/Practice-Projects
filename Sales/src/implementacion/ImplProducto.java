package implementacion;

import conexion.ConexionDB;
import entidades.Producto;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import utils.Generator;

public class ImplProducto {

    ConexionDB cx = new ConexionDB();
    ArrayList<Producto> listaProductos = new ArrayList<>();
    String sql = "";
    String query = "";
    Statement stmt = null;
    ResultSet rset = null;
    Generator gn = new Generator();
    Producto pr = new Producto();

    public int registrarProducto(Producto p) {
        int i = 0;
        if (pr != null) {
            String idproducto = gn.generatorId();
            try {
                query = " insert into producto (producto_id,tipo, producto_nombre,producto_marca,producto_modelo,producto_talla,producto_precio) "
                        + " values('" + idproducto + "','" + p.getNombre() + "','" + p.getMarca() + "','" + p.getModelo() + "','" + p.getTalla() + "','" + p.getPrecio() + "') ";
                stmt = cx.conectaMysql().createStatement();
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
            stmt = cx.conectaMysql().createStatement();
            rset = stmt.executeQuery(sql);
            while (rset.next()) {
                Producto pr = new Producto();
                pr.setId(rset.getString("producto_id"));
                pr.setNombre(rset.getString("producto_nombre"));
                pr.setMarca(rset.getString("producto_marca"));
                pr.setModelo(rset.getString("producto_modelo"));
                pr.setTalla(rset.getString("producto_talla"));
                pr.setPrecio(Double.parseDouble(rset.getString("producto_precio")));
                listaProducto.add(pr);
            }
        } catch (SQLException ex) {
            ex.getMessage();
        }
        return listaProducto;
    }
}
