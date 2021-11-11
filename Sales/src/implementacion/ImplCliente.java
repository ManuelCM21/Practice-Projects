package implementacion;

import conexion.ConexionDB;
import entidades.Cliente;
import entidades.Persona;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ImplCliente {
    
    ConexionDB cx= new ConexionDB();
    ArrayList<Cliente> listaClientes= new ArrayList<>();
    String sql="";
    String query="";
    Statement stmt= null;
    ResultSet rset=null;
    Persona ps = new Persona();
    public int  registrarCliente(Cliente c){
        int i=0;
        if(ps!=null){
            //codigo registre cliente
            try {
            query=" insert into cliente (cliente_id,tipo, cliente_persona_id) "+
                  " values('"+c.getCliente_id()+"','"+c.getCliente_tipo()+"','"+c.getCliente_persona_id()+"') ";            
            stmt= cx.conectaMysql().createStatement();
            i   = stmt.executeUpdate(query);
            } catch (SQLException ex) {
                ex.getMessage();
            }
        }  
        return i;
    }
    
}
