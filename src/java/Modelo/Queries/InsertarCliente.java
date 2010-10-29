/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo.Queries;

import Modelo.Clases.Clientes;
import Modelo.ConexionBD;
import java.sql.*;

/**
 *
 * @author sands
 */
public class InsertarCliente {
    public int agregarCliente(Clientes c){
        try {

            ConexionBD connect = new ConexionBD();
            Connection con = connect.getConnect();
            PreparedStatement pstmt = (PreparedStatement) con.prepareStatement
                    ("Insert into clientes(Nombre,Direccion,Fax,Saldo)"
                            +  "VALUES(?,?,?,?)");
            pstmt.setString(1, c.getNombre());
            pstmt.setString(1, c.getDireccion());
            pstmt.setInt(3, c.getFax());
            pstmt.setInt(4, c.getSaldo());
            int  rows_updated = pstmt.executeUpdate();
            con.close();
            return rows_updated;
        } catch (SQLException ex) {
            System.out.println("SQL Exception: "+ ex.toString());
        }
        return 0;
    }

}
