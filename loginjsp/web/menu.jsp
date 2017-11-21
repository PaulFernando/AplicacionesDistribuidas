<%-- 
    Document   : menu
    Created on : 20/11/2017, 20:23:40
    Author     : paul
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<% 
    HttpSession objsesion = request.getSession(false);
    String usuario = (String)objsesion.getAttribute("usuario");
    if (usuario.equals("")) {
            response.sendRedirect("index.jsp");
        }
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hola Usuario <% out.println(usuario); %>......  Acceso Correcto</h1>
    </body>
</html>
