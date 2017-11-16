<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>recuperacion</title>
    <div>
        <fieldset>
            <div>
                <h1>Datos Actualizados: </h1>

                <?php
                    include ("conexion.php");
                    $Con = new conexion();
                    $Con->recuperarDatos();
                ?>
            </div>
        </fieldset>
    </div>
    <br><br>
    <div>
        <a href="index.html"><img src="img/FLECHA.png" height="100px" width="200px"></a>
    </div>

</head>
<body>

</body>
</html>