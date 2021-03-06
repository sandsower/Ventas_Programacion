/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import Modelo.Clases.Clientes;
import Modelo.Queries.ModificarCliente;
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
public class modificarCliente extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ModificarCliente mov = new ModificarCliente();
        int modificado = mov.updateCliente(new Clientes(Integer.parseInt(req.getParameter("ID")), req.getParameter("Nombre"), req.getParameter("Direccion")
                , Integer.parseInt(req.getParameter("Fax")), Integer.parseInt(req.getParameter("Saldo"))));
        RequestDispatcher view = null;
        if(modificado > 0){
            view = req.getRequestDispatcher("index.html");
            view.forward(req, resp);
        }else{
            view = req.getRequestDispatcher("Error.jsp");
            view.forward(req, resp);
        }
    }
    
}
