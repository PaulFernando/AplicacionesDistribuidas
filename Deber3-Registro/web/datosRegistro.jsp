<%-- 
    Document   : datosRegistro
    Created on : 20/11/2017, 13:27:43
    Author     : paul
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body bgcolor="EFF59A">
        <h1>DATOS DEL REGISTRO:</h1>
        
        <br>
        
        <%! 
            String nombre;
            String apellido;
            String usuario;
            String password;
        %>
        
        <% 
            nombre = request.getParameter("nombre");
            apellido = request.getParameter("apellido");
            usuario = request.getParameter("user_r");
            password = request.getParameter("pass_r");
            
            out.println("<b>LOS NOMBRES SON => </b>" + nombre);
            out.println("<b><br/><br/>LOS APELLIDOS SON => </b>" + apellido);
            out.println("<b><br/><br/>EL USUARIO ES => </b>" + usuario);
            out.println("<b><br/><br/>LA CONTRASEÑA ES => </b>" + password);
        
        %>
        <br><br><br><br>
        
        <a href="registro.jsp">
            <center>
                <img src="img/regreso.png" height="100px" width="200px">
            </center>
        </a>
        
    </body>
</html>
