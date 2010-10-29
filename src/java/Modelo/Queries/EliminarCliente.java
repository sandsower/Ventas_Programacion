/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo.Queries;
import Modelo.ConexionBD;
import java.sql.*;

/**
 *
 * @author sands
 */
public class EliminarCliente {
     private ConexionBD connect = new ConexionBD();

    public int eliminarCliente(int id) {
        Connection con = connect.getConnect();
        ResultSet rs = null;
        Statement stmt = null;
        try{
            String query = "DELETE FROM clientes WHERE Id_Cliente="+id;
            stmt = con.createStatement();
            int i = stmt.executeUpdate(query);
            return i;
        }catch(Exception ex){
            System.out.println("Se presento la excepcion:"+ex.toString());
        }
        return 0;
    }
}
