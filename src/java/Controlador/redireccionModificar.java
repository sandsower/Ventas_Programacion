/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import Modelo.Clases.Clientes;
import Modelo.Queries.BusquedaClientes;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author sands
 */
public class redireccionModificar extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id =Integer.parseInt(req.getParameter("clienteSeleccionado"));
        BusquedaClientes mov = new BusquedaClientes();
        Clientes elCliente = mov.obtenerCliente(id);
        req.setAttribute("Cliente", elCliente);
        RequestDispatcher view = req.getRequestDispatcher("modificacion.jsp");
        view.forward(req, resp);
    }
    
}
