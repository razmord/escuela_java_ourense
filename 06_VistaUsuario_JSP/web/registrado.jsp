﻿<%-- 
    Document   : registrado
    Created on : 21-feb-2019, 23:21:10
    Author     : IEUser
--%>
<%@page import="com.appusuarios.modelo.logica.ServicioUsuarioImpl"%>
<html>
    <body>
        <h1>Registrado correctamente</h1>
        <h2 style="color:green">
            ID: <%= (new ServicioUsuarioImpl().obtenerPorEmail(session.getAttribute("emailUsuario").toString()).getId())%>
            </br>
            Nombre: <%= (new ServicioUsuarioImpl().obtenerPorEmail(session.getAttribute("emailUsuario").toString()).getNombre())%>
        </h2>
    </body>
</html>
