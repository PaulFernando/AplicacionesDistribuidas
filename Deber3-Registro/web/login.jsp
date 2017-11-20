<%-- 
    Document   : login
    Created on : 20/11/2017, 11:30:02
    Author     : paul
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login-Registro</title>
    </head>
    <body bgcolor="C7DDD9">
        <h1>DATOS DE INGRESO:</h1>
        
        <form method="POST" action="datosInicio.jsp">
            <center>
                <table border="5" width="15%" callpadding="15%">
                    <thead>
                        <tr>
                            <th colspan="2">
                                Inicio de Sesión
                            </th>
                        </tr>
                        <tr>
                            <td>USUARIO:</td>
                            <td>
                                <input type="text" name="user">
                            </td>
                        </tr>
                         <tr>
                            <td>PASSWORD</td>
                            <td>
                                <input type="password" name="pass">
                            </td>
                        </tr>
                        <tr>
                            <td><center>
                                <a href="registro.jsp" >REGISTRO</a>
                            </td></center>
                            <td><center>
                                <input type="submit" value="INICIO">
                            </td></center>
                        </tr>
                    </thead>
                </table>
            </center>
        </form>
        
    </body>
</html>
