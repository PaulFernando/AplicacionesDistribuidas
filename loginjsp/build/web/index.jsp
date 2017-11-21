<%-- 
    Document   : index
    Created on : 20/11/2017, 19:38:59
    Author     : paul
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Iniciar sesion</title>
        <script src="js/main.js"></script>
    </head>
    <body>
        <h1>Iniciar Sesion</h1>
        
        <form action="iniciar" method="POST" id="formInicio">
            
             <center>
                <table border="5" width="15%" callpadding="15">
                    
                    <thead>
                        <tr>
                            <th colspan="2">Inicio de Sesion</th>
                        </tr>
                    </thead>
                    
                    <tr>
                        <td>USUARIO:</td>
                        <td>
                            <input type="text" name="usuario" id="txtusuario">
                        </td>
                    </tr>
                    <tr>
                        <td>PASSWORD</td>
                        <td>
                            <input type="password" name="pass" id="txtpass">
                        </td>
                    </tr>
                    
                    <tr>
                        <td><center><a href="registro.jsp">REGISTRARSE</a></center></td>
                <td><center><input type="button" value="INICIAR SESION" id="btnIniciar"></center></td>
                    </tr>
                    
                   
                    
                </table>
            </center>
            
        </form>
        
    </body>
</html>
