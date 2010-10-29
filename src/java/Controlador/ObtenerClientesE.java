/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Queries.BusquedaClientes;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author sands
 */
public class ObtenerClientesE extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        BusquedaClientes clientes = new BusquedaClientes();
        ArrayList lista = clientes.obtenerClientes();
        req.setAttribute("Clientes", lista);
        RequestDispatcher view = req.getRequestDispatcher("EliminarClientes.jsp");
        view.forward(req, resp);
    }
}
