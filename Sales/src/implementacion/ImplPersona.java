package implementacion;

import conexion.ConexionDB;
import entidades.Cliente;
import entidades.Persona;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import utils.Generator;

public class ImplPersona {

    ConexionDB cx = new ConexionDB();
    ArrayList<Persona> listaPersonas = new ArrayList();
    String sql = "";
    String query = "";
    Statement stmt = null;
    ResultSet rset = null;

    Generator gn = new Generator();
    ImplCliente ic = new ImplCliente();
    Cliente cl = new Cliente();

    public int registrarPersona(Persona p) {
        int i = 0;
        String idpersona = gn.generatorId();
        try {
            query = " insert into persona (persona_id,persona_nombre,persona_ap_paterno,persona_ap_materno, persona_codigo, persona_sexo,persona_usuario, persona_password ) "
                    + " values('" + idpersona + "','" + p.getNombre() + "','" + p.getAp_paterno() + "','" + p.getAp_materno() + "','" + p.getCodigo() + "','" + p.getSexo() + "','" + p.getUsuario() + "','" + p.getPassword() + "') ";

            stmt = cx.conectaMysql().createStatement();
            i = stmt.executeUpdate(query);
        } catch (SQLException ex) {
            System.out.println("" + ex.getMessage());
        }
        String idcliente = gn.generatorId();
        cl.setCliente_id(idcliente);
        cl.setCliente_tipo("M");
        cl.setCliente_persona_id(idpersona);
        ic.registrarCliente(cl);
        return i;
    }

    public ArrayList<Persona> reportePersonas() {
        ArrayList<Persona> listaPersona = new ArrayList();
        try {
            sql = " select * from persona ";
            stmt = cx.conectaMysql().createStatement();
            rset = stmt.executeQuery(sql);
            while (rset.next()) {
                Persona ps = new Persona();
                ps.setId(rset.getString("persona_id"));
                ps.setNombre(rset.getString("persona_nombre"));
                ps.setAp_paterno(rset.getString("persona_ap_paterno"));
                ps.setAp_materno(rset.getString("persona_ap_materno"));
                ps.setCodigo(rset.getString("persona_codigo"));
                listaPersona.add(ps);
            }
        } catch (SQLException ex) {
            ex.getMessage();
        }
        return listaPersona;
    }

    public int eliminarRegistroPersona(String sid) {

        int i = 0;
        try {
            sql = " delete from persona where persona_id='" + sid + "' ";
            stmt = cx.conectaMysql().createStatement();
            i = stmt.executeUpdate(sql);
            System.out.println("Se elimino el registro");
        } catch (SQLException ex) {
            ex.getMessage();
        }
        return i;
    }

    public int actualizarRegistroPersona(Persona p) {

        int i = 0;
        try {
            sql = " update  persona "
                    + " set persona_nombre='" + p.getNombre() + "', persona_ap_paterno='" + p.getAp_paterno() + "', persona_ap_materno='" + p.getAp_materno() + "', persona_codigo='" + p.getCodigo() + "' "
                    + " where persona_id  ='" + p.getId() + "' ";
            stmt = cx.conectaMysql().createStatement();
            i = stmt.executeUpdate(sql);

        } catch (SQLException ex) {
            ex.getMessage();
        }
        return i;

    }

    public Persona reportePersonaUnico(String sid) {
        Persona ps = new Persona();
        try {
            sql = " select * from persona where persona_id='" + sid + "' ";
            stmt = cx.conectaMysql().createStatement();
            rset = stmt.executeQuery(sql);
            if (rset.next()) {

                ps.setId(rset.getString("persona_id"));
                ps.setNombre(rset.getString(2));
                ps.setAp_paterno(rset.getString(3));
                ps.setAp_materno(rset.getString(4));
                ps.setCodigo(rset.getString(5));
            }
        } catch (SQLException ex) {
            ex.getMessage();
        }
        return ps;
    }

    public Persona reportePersonaUnico(String scodigo, String a) {
        Persona ps = new Persona();
        try {
            sql = " select * from persona where persona_codigo='" + scodigo + "' ";
            stmt = cx.conectaMysql().createStatement();
            rset = stmt.executeQuery(sql);
            if (rset.next()) {

                ps.setId(rset.getString("persona_id"));
                ps.setNombre(rset.getString(2));
                ps.setAp_paterno(rset.getString(3));
                ps.setAp_materno(rset.getString(4));
                ps.setCodigo(rset.getString(5));
            }
        } catch (SQLException ex) {
            ex.getMessage();
        }
        return ps;
    }

    public Persona LoginReportePersonaUnico(String slogin, String spassword) {
        Persona ps = new Persona();
        try {
            sql = " select * from persona where persona_usuario='" + slogin + "' and  persona_password='" + spassword + "' ";
            System.out.println("consulta:" + sql);
            stmt = cx.conectaMysql().createStatement();
            rset = stmt.executeQuery(sql);
            ps.setAcceso(false);
            if (rset.next()) {
                System.out.println("dentro del ifff de la consulta:");
                ps.setId(rset.getString("persona_id"));
                ps.setSexo(rset.getString("persona_sexo"));
                ps.setNombre(rset.getString("persona_nombre"));
                ps.setAp_paterno(rset.getString("persona_ap_paterno"));
                ps.setAp_materno(rset.getString("persona_ap_materno"));
                ps.setCodigo(rset.getString("persona_codigo"));
                ps.setUsuario(rset.getString("persona_usuario"));
                ps.setPassword(rset.getString("persona_password"));
                ps.setAcceso(true);
            }
        } catch (SQLException ex) {
            ex.getMessage();
            System.out.println("errrorrrrr:" + ex.getMessage());
        }
        return ps;
    }

}
