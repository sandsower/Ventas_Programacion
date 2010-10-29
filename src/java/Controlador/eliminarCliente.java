/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import Modelo.Queries.BusquedaClientes;
import Modelo.Queries.EliminarCliente;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author sands
 */
public class eliminarCliente extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        EliminarCliente mov = new EliminarCliente();
        int id =Integer.parseInt(req.getParameter("ID"));
        int modificado = mov.eliminar(id);
        RequestDispatcher view = null;
        if(modificado > 0){
            view = req.getRequestDispatcher("obtenerClientesE.do");
            view.forward(req, resp);
        }else{
            view = req.getRequestDispatcher("Error.jsp");
            view.forward(req, resp);
        }
    }
}
