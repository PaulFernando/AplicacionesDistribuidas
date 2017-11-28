<%-- 
    Document   : loginPrincipal
    Created on : 27/11/2017, 17:29:13
    Author     : paul
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login-Registro</title>
        <link rel="stylesheet" href="css/style.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">


        <%-- 
    Imprimir los datos en la misma pagina
        --%> 

        <%!
            String usuario;
            String pass;
        %>


    </head>
    <body>

        <div class="container">
            <div class="row">
                <div class="col-sm">

                </div>

                <div class="col-sm">
                    <form>
                        <br><br><br>
                        <div class="img">
                            <img src="img/user-security.png" width="150px" length="150px" >
                        </div>

                        <div class="form-group"><br>

                            <input type="text" class="form-control" id="txt_usuario" placeholder="Usuario" name="txt_usuario" required>
                        </div>

                        <div class="form-group">
                            <input type="password" class="form-control" id="txt_pass" placeholder="Password" name="txt_pass" required>
                        </div><br>

                        <button type="submit" class="btn btn-primary btn-lg btn-block">Entrar</button>

                        <div>
                            <a href="#" class="forgot-password">Olvidaste tu contraseña?</a>
                        </div>
                        <div><br>
                            No tienes Cuenta? <a href="registro.jsp" class="forgot-password">Crear Ahora!!</a>
                        </div>

                        <div style="border-top: 1px solid #999; padding-top:20px"  class="form-group"></div>

                    </form>
                </div>

                <div class="col-sm">

                </div>
            </div>
        </div>


        <%-- capturar datos--%>

        <div class="container">
            <div class="row">
                <div class="col-sm">

                </div>
                <div class="col-sm">
                    <table class="table">
                        <thead class="thead-dark">
                            <tr>
                                <th scope="col">Usuario</th>
                                <th scope="col">Contraseña</th>
                              
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <th scope="row">
                                    <%
                                        usuario = request.getParameter("txt_usuario");
                                        out.println(usuario);
                                    %>
                                </th>
                                <td>
                                     <%
                                        pass = request.getParameter("txt_pass");
                                        out.println(pass);
                                    %>
                                </td>
                                
                            </tr>
                          
                        </tbody>
                    </table>

                </div>

                <div class="col-sm"> </div>

            </div>
        </div>


        <%-- scripts--%>
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js" integrity="sha384-vFJXuSJphROIrBnz7yo7oB41mKfc8JzQZiCq4NCceLEaO4IHwicKwpJf9c9IpFgh" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js" integrity="sha384-alpBpkh1PFOepccYVYDB4do5UnbKysX5WZXm3XxPqe5iKTfUKjNkCk9SaVuEZflJ" crossorigin="anonymous"></script>
    </body>
</html>
