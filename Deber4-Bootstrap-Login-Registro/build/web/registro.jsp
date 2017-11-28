<%-- 
    Document   : registro
    Created on : 27/11/2017, 18:42:22
    Author     : paul
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/style.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">
        <title>Regsitro</title>
              <%-- 
    Imprimir los datos en la misma pagina
        --%> 

        <%!
            String nombre;
            String apellido;
            String usuario_re;
            String pass_re;
        %>
        
    </head>
    <body>

        <div class="container">
            <div class="row">
                <div class="col-sm">

                </div>
                <div class="col-sm">
                    <form id="signupform" class="form-horizontal" role="form">

                        <div id="signupalert" style="display:none" class="alert alert-danger">
                            <p>Error:</p>
                            <span></span>
                        </div>
                        
                        <br>
                        <div class="img">
                            <img src="img/Users-icon.png" width="200px" length="200px" >
                        </div>
                        <div class="form-group row">
                            <label class="col-md-3 control-label">Nombre</label>
                            <div class="col-md-9">
                                <input type="text" class="form-control" name="txt_nombre" id="txt_nombre" placeholder="Ingrese Nombre" required>
                            </div>
                        </div>
                        <div class="form-group row">
                            <label class="col-md-3 control-label">Apellido</label>
                            <div class="col-md-9">
                                <input type="text" class="form-control" name="txt_apellido" id="txt_apellido" placeholder="Ingrese Apellido" required>
                            </div>
                        </div>
                        <div class="form-group row">
                            <label class="col-md-3 control-label">Usuario</label>
                            <div class="col-md-9">
                                <input type="text" class="form-control" name="txt_usuario" id="txt_usuario" placeholder="Ingrese Usuario" required>
                            </div>
                        </div>  
                        <div class="form-group row">
                            <label for="password" class="col-md-3 control-label">Password</label>
                            <div class="col-md-9">
                                <input type="password" class="form-control" name="passwd" id="passwd" placeholder="Password" required>
                            </div>
                        </div>

                        <div class="form-group">
                            <!-- Button -->                                        
                            <div class="col-md-offset-3 col-md-9">
                                <button type="submit" class="btn btn-info"><i class="icon-hand-right"></i> &nbsp Registrarse</button>
                            </div>
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
                                <th scope="col">Nombre</th>
                                <th scope="col">Apellido</th>
                                <th scope="col">Usuario</th>
                                <th scope="col">Contraseña</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <th scope="row">
                                    <% 
                                        nombre = request.getParameter("txt_nombre");
                                        out.println(nombre);
                                    %>
                                </th>
                                <td> <% 
                                        apellido = request.getParameter("txt_apellido");
                                        out.println(apellido);
                                    %></td>
                                <td> <% 
                                        usuario_re = request.getParameter("txt_usuario");
                                        out.println(usuario_re);
                                    %></td>
                                <td> <% 
                                        pass_re = request.getParameter("passwd");
                                        out.println(pass_re);
                                    %></td>
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
