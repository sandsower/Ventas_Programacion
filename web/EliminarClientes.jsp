<%-- 
    Document   : eliminarClientes
    Created on : Oct 29, 2010, 12:07:42 AM
    Author     : sands
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Eliminar Clientes</title>
    </head>
    <body>
        <h1>Seleccione el cliente que desee eliminar</h1>
        <form action="eliminarClientes.do" method="post">
            <table>
                <tr>
                    <td>
                        Nombre
                    </td>
                    <td>
                        Direccion
                    </td>
                    <td>
                        Fax
                    </td>
                    <td>
                        Saldo
                    </td>
                </tr>
                <c:forEach var="cliente" items="${Clientes}">
                    <tr>
                        <td>
                            ${cliente.nombre}
                        </td>
                        <td>
                            ${cliente.direccion}
                        </td>
                        <td>
                            ${cliente.fax}
                        </td>
                        <td>
                            ${cliente.telefono}
                        </td>
                    </tr>
                </c:forEach>
            </table>
        </form>
    </body>
</html>
