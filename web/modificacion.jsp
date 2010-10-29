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
            Nombre:<input type="text" name="Nombre" value="${Cliente.nombre}"/>
            Direccion:<input type="text" name="Direccion" value="${Cliente.direccion}"/>
            Fax:<input type="text" name="Fax" value="${Cliente.fax}"/>
            Saldo:<input type="text" name="Saldo" value="${Cliente.saldo}"/>
            <input type="submit" value="Insertar"/>
        </form>
    </body>
</html>
