<%-- 
    Document   : header
    Created on : 21-feb-2019, 20:43:31
    Author     : IEUser
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="com.vn.appusuarios.modelo.Usuario"%>
// Usuario usuario = (Usuario) session.getAttribute("usuario");%>
<c:catch var="excepcionUsuario">
<jsp:useBean id="usuario" type="com.vn.appusuarios.modelo.Usuario" scope="session">
<jsp:getProperty property="*" name="usuario"></jsp:getProperty>
</jsp:useBean>
</c:catch>
<header>
    <h2>Aplicación Gestión MVC JSP</h2>
    <nav>
        <a href="index.jsp">Inicio</a>
        <% if(usuario!=null && usuario.getId()>=0){ %>
        <a href="listar.jsp">Listar</a>   
        <a href="eliminar.jsp">Eliminar</a>
        <% } else{ %>
        <a href="login.jsp">Login</a>
        <a href="registrarse.jsp">Registrarse</a>
         <% }%>
    </nav>
    <h3 style="color: red"> </h3>
</header>