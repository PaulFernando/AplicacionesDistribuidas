<%-- 
    Document   : registroEstudiante
    Created on : 04/12/2017, 19:37:24
    Author     : paul
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">
        <title>registroEstudiantes</title>
    </head>
    <body>
        <h1>Registro Estudiantes</h1>


        <div class="container">
            <div class="row">
                <div class="col-sm">

                </div>
                <div class="col-sm">
                    <form action="ControladorEstudiante" method="post">

                        <div class="form-group">
                            <label>Nombre del Estudiante</label>
                            <input type="text" class="form-control" id="txt_nombre" placeholder="Enter nombre" name="txt_nombre" required>
                        </div>
                        <div class="form-group">
                            <label>Apellido del Estudiante</label>
                            <input type="text" class="form-control" id="txt_apellido" placeholder="Enter apellido" name="txt_apellido" required>
                        </div>
                        <div class="form-group">
                            <label>Codigo del Estudiante</label>
                            <input type="text" class="form-control" id="txt_codigo" placeholder="Enter codigo" name="txt_codigo" required>
                        </div>

                        <div class="container">
                            <div class="row">
                                <div class="col-sm">
                                    <div class="form-group">
                                        <label >Email address</label>
                                        <input type="email" class="form-control" id="txt_email" placeholder="Enter email" name="txt_email" required>

                                    </div>
                                </div>
                                <div class="col-sm">
                                    <div class="form-group">
                                        <label>Telefono:</label>
                                        <input type="text" class="form-control" id="txt_telefono" placeholder="Enter telefono" name="txt_telefono" required>

                                    </div>
                                </div>

                            </div>
                        </div>

                        <div class="form-group">
                            <label>Genero:</label>
                            <select class="form-control" id="txt_genero" name="txt_genero" required>                               
                                <option>Masculino</option>
                                <option>Femenino</option>
                            </select>
                        </div>

                        <div class="form-group">
                            <label>Seleccionar Foto:</label>
                            <input type="file" class="form-control-file" id="txt_file" name="txt_file" required>
                        </div>


                        <div class="form-check">
                            <label class="form-check-label">
                                <input type="checkbox" class="form-check-input" id="txt_estudia" name="txt_estudia" required>
                                Estudia Actualmente
                            </label>
                        </div>

                        <div class="form-group text-center">
                            <button type="submit" class="btn btn-primary">Guardar Datos</button>
                        </div>
                    </form>
                </div>
                <div class="col-sm">

                </div>
            </div>
        </div>

        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js" integrity="sha384-vFJXuSJphROIrBnz7yo7oB41mKfc8JzQZiCq4NCceLEaO4IHwicKwpJf9c9IpFgh" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js" integrity="sha384-alpBpkh1PFOepccYVYDB4do5UnbKysX5WZXm3XxPqe5iKTfUKjNkCk9SaVuEZflJ" crossorigin="anonymous"></script>
    </body>
</html>
