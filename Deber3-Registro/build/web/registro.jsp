<%-- 
    Document   : registro
    Created on : 20/11/2017, 11:51:52
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
        <h1>REGISTRO DE SESIÓN</h1>
        
        <form method="POST" action="datosRegistro.jsp">
              <center>
                <table border="5" width="15%" callpadding="15%">
                    <thead>
                        <tr>
                            <th colspan="2">
                                Registro de Usuarios:
                            </th>
                        </tr>
                        <tr>
                            <td>NOMBRES:</td>
                            <td>
                                <input type="text" name="nombre">
                            </td>
                        </tr>
                        <tr>
                            <td>APELLIDOS:</td>
                            <td>
                                <input type="text" name="apellido">
                            </td>
                        </tr>
                        <tr>
                            <td>USUARIO:</td>
                            <td>
                                <input type="text" name="user_r">
                            </td>
                        </tr>
                         <tr>
                            <td>PASSWORD</td>
                            <td>
                                <input type="password" name="pass_r">
                            </td>
                        </tr>
                        <tr>
                            <td><center>
                                <a href="login.jsp" >REGRESAR</a>
                            </td></center>
                            <td><center>
                                <input type="submit" value="REGISTRARSE">
                            </td></center>
                        </tr>
                    </thead>
                </table>
            </center>
        </form>
    </body>
</html>
