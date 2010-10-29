<%-- 
    Document   : modificacion
    Created on : Oct 29, 2010, 1:41:56 AM
    Author     : sands
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="modificarCliente.do" method="post">
            <input type="hidden" value="${Cliente.idClientes}" name="ID"/><br>
            Nombre:<input type="text" name="Nombre" value="${Cliente.nombre}"/><br>
            Direccion:<input type="text" name="Direccion" value="${Cliente.direccion}"/><br>
            Fax:<input type="text" name="Fax" value="${Cliente.fax}"/><br>
            Saldo:<input type="text" name="Saldo" value="${Cliente.saldo}"/><br>
            <input type="submit" value="Modificar"/>
        </form>
    </body>
</html>
