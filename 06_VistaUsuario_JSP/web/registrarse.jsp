<%-- 
    Document   : index
    Created on : 21-feb-2019, 20:42:40
    Author     : IEUser
--%>
<%@include file="head.jsp" %>
<html>
    <%= head() %>
    <body>
        <%@include file="header.jsp" %>
        <h1>Formulario JSP de registro</h1> 
        <%
        Object mensajeDeError = request.getSession().getAttribute("MensajeError");
        %>
        <form name="form1" action="usuarios.do" method="post">

            <table border="1">
                <tr><td>Nombre:</td><td>
                        <input type="text" name="nombre" id="nombre" size="25" value="" required="required"/>  </td></tr>
                <tr><td>Edad:</td><td>
                        <input type="number" name="edad" id="edad" value="" min="12" required="required"/>  </td></tr> 
               <tr><td>Email</td><td>
                        <input type="email" name="email" id="email" value="" required="required"/>  </td></tr> 
                <tr><td>Contraseña</td><td>
                    <input type="password" name="password" id="password" value="" required="required"/>  </td></tr> 
            </table>
            <input type="submit" value="registrar"/>
        </form>
    </body>
</html>