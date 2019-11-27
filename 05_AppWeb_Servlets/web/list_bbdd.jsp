<%-- 
    Document   : list_bbdd
    Created on : 22-nov-2019, 11:24:53
    Author     : Equipo 5
--%>

<%@page import="java.util.List"%>
<%@page import="com.vn.appweb.modelo.ConsultaSQL"%>
<%@page import="com.vn.appweb.modelo.DatosPersona"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listado JSP con DerbyDB</title>
    </head>
    <body>
        <h1>Listado JSP con DerbyDB</h1>
        <% out.println("<p>Hola desde Java "+request.getContextPath()+"</p>"); %>
        </br>
        <ul>
        <% for(int i=0;i<10;i++){ %>
        <li> Número <%= i %></li>
        <%}%>
         </ul>
         <form name="formBusq" method="GET" action="./list_bbdd.jsp">
             <input name="busca" type="text" placeholder="Introduzca la busqueda">
             <input type="submit" value="Buscar">
         </form>
         <table>
             <thead><th>Nombre</th><th>email</th></thead>
         <%
            ConsultaSQL conSQL = new ConsultaSQL();
            String busqueda=request.getParameter("busca");
            List<DatosPersona> listaPer = conSQL.leerTabla(busqueda);
            for(DatosPersona dp : listaPer){%>
        <tr><td><%= dp.getNombre()%></td><td><%= dp.getEmail()%></td></tr>
        <%}%>
       </table>
       
    </body>
</html>
