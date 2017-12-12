<%-- 
    Document   : registroProveedores
    Created on : 11/12/2017, 17:15:00
    Author     : paul
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">
        <title>RegistroProveedores</title>
        <style>
            h1{
                text-align: center;
            }
        </style>
    </head>
    <body>
        
        <h1>Registro de Proveedores</h1>

        <div class="container">
            <div class="row">
                <div class="col-sm">

                </div>
                <div class="col-sm">

                    <form action="controladorProveedores" method="post">
                        <br>
                        <div class="form-group row">
                            <label class="col-md-3 control-label">Nombre</label>
                            <div class="col-md-9">
                                <input type="text" class="form-control" name="txt_nombre" id="txt_nombre" placeholder="Ingrese Nombre" required>
                            </div>
                        </div>

                        <div class="form-group row">
                            <label class="col-md-3 control-label">RUC</label>
                            <div class="col-md-9">
                                <input type="number" class="form-control" name="ruc" id="ruc" placeholder="Ingrese RUC" required>
                            </div>
                        </div>

                        <div class="form-group row">
                            <label class="col-md-3 control-label">Dirección</label>
                            <div class="col-md-9">
                                <input type="text" class="form-control" name="txt_direccion" id="txt_direccion" placeholder="Ingrese Direccion" required>
                            </div>
                        </div>

                        <div class="form-group row">
                            <label class="col-md-3 control-label">Teléfono</label>
                            <div class="col-md-9">
                                <input type="number" class="form-control" name="telefono" id="telefono" placeholder="Ingrese Telefono" required>
                            </div>
                        </div>

                        <div class="form-group row">
                            <label class="col-md-3 control-label">Email</label>
                            <div class="col-md-9">
                                <input type="email" class="form-control" name="email" id="email" placeholder="Ingrese email" required>
                            </div>
                        </div>

                        <div class="form-group row">
                            <label class="col-md-3 control-label">Ciudad</label>
                            <div class="col-md-9">
                                <input type="text" class="form-control" name="txt_ciudad" id="txt_ciudad" placeholder="Ingrese Ciudad" required>
                            </div>
                        </div>

                        <div class="form-group row">
                            <label class="col-md-3 control-label">Sitio-web</label>
                            <div class="col-md-9">
                                <input type="text" class="form-control" name="txt_web" id="txt_web" placeholder="Ingrese Sitio-Web" required>
                            </div>
                        </div>

                        <div class="form-group"> 
                            <!-- Button -->                                        
                            <div class="form-group text-center">
                               
                                <button type="submit" class="btn btn-primary">REGISTRAR</button>
                            </div><br>

                        </div>

                        <div style="border-top: 1px solid #999; padding-top:20px"  class="form-group"></div>
                    </form>
                </div>
                <div class="col-sm">

                </div>
            </div>
        </div>

        <%--scripts--%>
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js" integrity="sha384-vFJXuSJphROIrBnz7yo7oB41mKfc8JzQZiCq4NCceLEaO4IHwicKwpJf9c9IpFgh" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js" integrity="sha384-alpBpkh1PFOepccYVYDB4do5UnbKysX5WZXm3XxPqe5iKTfUKjNkCk9SaVuEZflJ" crossorigin="anonymous"></script>
    </body>
</html>
