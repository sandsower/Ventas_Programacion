/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo.Queries;
import java.sql.*;
import Modelo.Clases.Clientes;
import Modelo.ConexionBD;

/**
 *
 * @author sands
 */
public class ModificarCliente {

    public int updateCliente(Clientes c){
        try {

            ConexionBD connect = new ConexionBD();
            Connection con = connect.getConnect();
            PreparedStatement pstmt = (PreparedStatement) con.prepareStatement
                    ("UPDATE clientes SET Nombre=?,Domicilio=?,Fax=?,Saldo=? WHERE Id_Cliente=?");
            pstmt.setString(1, c.getNombre());
            pstmt.setString(2, c.getDireccion());
            pstmt.setInt(3, c.getFax());
            pstmt.setInt(4, c.getSaldo());
            pstmt.setInt(5, c.getIdClientes());
            int  rows_updated = pstmt.executeUpdate();
            con.close();
            return rows_updated;
        } catch (SQLException ex) {
            System.out.println("SQL Exception: "+ ex.toString());
        }
        return 0;
    }

}
