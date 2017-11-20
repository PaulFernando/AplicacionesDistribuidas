<%-- 
    Captura de los datos del login

    Document   : datosInicio
    Created on : 20/11/2017, 11:56:50
    Author     : paul
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body bgcolor="C7DDD9">
        <h1>Datos del LOGIN:</h1>
        
        <%! 
            String usuario;
            String password;
        %>
        
        <% 
            usuario = request.getParameter("user");
            password = request.getParameter("pass");
            
           out.println("<b>EL USUARIO ES =>   </b>" + usuario);
           out.println("<b><br><br>LA CONTRASEÑA ES =>    </b>" + password);
            
        %>
           
        <br><br>
        
        <a href="login.jsp">
            <center>
                <img src="img/flechaizq.png" height="100px" width="200px">
            </center>
        </a>
                
    </body>
</html>
