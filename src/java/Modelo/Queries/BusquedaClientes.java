/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Queries;

import Modelo.Clases.Clientes;
import Modelo.ConexionBD;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author sands
 */
public class BusquedaClientes {

    private ConexionBD connect = new ConexionBD();

    public ArrayList obtenerClientes() {
        Connection con = connect.getConnect();
        ArrayList listaClientes = new ArrayList();
        ResultSet rs = null;
        Statement stmt = null;
        try{
            String query = "SELECT * FROM clientes";
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);
            while(rs.next()){
                listaClientes.add(new Clientes(rs.getInt("Id_Cliente"), rs.getString("Nombre"), rs.getString("Direccion") , rs.getInt("Fax"), rs.getInt("Saldo")));
            }
            return listaClientes;
        }catch(Exception ex){
            System.out.println("Se presento la excepcion:"+ex.toString());
        }
        return null;
    }
    
    public Clientes obtenerCliente(int id) {
        Connection con = connect.getConnect();
        ResultSet rs = null;
        Statement stmt = null;
        Clientes elCliente = null;
        try{
            String query = "SELECT * FROM clientes WHERE Id_Cliente="+id;
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);
            while(rs.next()){
                elCliente = new Clientes(rs.getInt("Id_Cliente"), rs.getString("Nombre"), rs.getString("Direccion") , rs.getInt("Fax"), rs.getInt("Saldo"));
            }
            return elCliente;
        }catch(Exception ex){
            System.out.println("Se presento la excepcion:"+ex.toString());
        }
        return null;
    }
//     public int agregarPersona(Persona p){
//        try {
//
//            ConexionBD connect = new ConexionBD();
//            Connection con = connect.getConnect();
//
//                    PreparedStatement stmt1 = (PreparedStatement) con.prepareStatement
//                            ("Insert into persona(Nombre,Apellido_Paterno,Apellido_Materno,Calle,Num_Calle,Colonia,Estado,Municipio,Edad,Telefono)"
//                            +  "VALUES(?,?,?,?,?,?,?,?,?,?)");
//                    stmt1.setString(1, p.getNombre());
//                    stmt1.setString(2, p.getApellidoPaterno());
//                    stmt1.setString(3, p.getApellidoMaterno());
//                    stmt1.setString(4, p.getCalle());
//                    stmt1.setInt(5,p.getNumeroCalle());
//                    stmt1.setString(6,p.getColonia() );
//                    stmt1.setString(7,p.getEstado() );
//                    stmt1.setString(8,p.getMunicipio() );
//                    stmt1.setInt(9,p.getEdad() );
//                    stmt1.setInt(10, p.getTelefono());
//                   int  rows_updated = stmt1.executeUpdate();
//
//            con.close();
//            return rows_updated;
//        } catch (SQLException ex) {
//            System.out.println("SQL Exception: "+ ex.toString());
//        }
//        return 0;
//    }
}
