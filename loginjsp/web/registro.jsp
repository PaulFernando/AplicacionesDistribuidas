<%-- 
    Document   : registro
    Created on : 20/11/2017, 19:44:27
    Author     : paul
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrarme</title>
    </head>
    <body>
        <h1>Formulario de Registro</h1>
        
        <form action="nuevousuario" method="POST">
            
            <center>
                <table border="5" width="15%" callpadding="15%">
                    <thead>
                        <tr>
                            <th colspan="2">
                                Registro de Usuarios:
                            </th>
                        </tr>
                        <tr>
                            <td>NOMBRE:</td>
                            <td>
                                <input type="text" name="nombre">
                            </td>
                        </tr>
                        <tr>
                            <td>APELLIDO:</td>
                            <td>
                                <input type="text" name="apellido">
                            </td>
                        </tr>
                        <tr>
                            <td>USUARIO:</td>
                            <td>
                                <input type="text" name="usuario">
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
                                <a href="index.jsp" >REGRESAR</a>
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
