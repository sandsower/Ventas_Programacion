<%-- 
    Document   : ModificarCliente
    Created on : Oct 29, 2010, 1:24:46 AM
    Author     : sands
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Selecciona el cliente a modificar</h1>
        <form action="redireccionModificar.do" method="post">
            <select id="clienteSeleccionado">
                <c:forEach var="cliente" items="${Clientes}">
                    <option id="${cliente.idClientes}">${cliente.nombre}</option>
                </c:forEach>
            </select>
            <input type="submit" value="Aceptar"/>
        </form>
    </body>
</html>
