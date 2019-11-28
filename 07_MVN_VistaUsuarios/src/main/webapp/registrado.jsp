<%-- 
    Document   : registrado
    Created on : 21-feb-2019, 23:21:10
    Author     : IEUser
--%>
<%@include file="head.jsp" %>
<%@page import="com.vn.appusuarios.modelo.logica.ServicioUsuarioImpl"%>
<%@page import="com.vn.appusuarios.modelo.Usuario"%>
<% ServicioUsuarioImpl servicioU=(ServicioUsuarioImpl)request.getAttribute("servicioUsu");
%>
<html>
<%= head() %>
    <body>
    <%@include file="header.jsp" %>
        <h1>Registrado correctamente</h1>
        <h2 style="color:green">

        	ID: <%= servicioU.obtenerPorEmail(usuario.getEmail()).getId() %>
        	Nombre: <%= servicioU.obtenerPorEmail(usuario.getEmail()).getNombre() %>
        	Email: <%= servicioU.obtenerPorEmail(usuario.getEmail()).getEmail() %>
        	Edad: <%= servicioU.obtenerPorEmail(usuario.getEmail()).getEdad() %>
         </h2>
    </body>
</html>
