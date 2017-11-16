<?php
/**
 * Created by PhpStorm.
 * User: paul
 * Date: 13/11/2017
 * Time: 19:28
 */

//conexion con la base de datos y el servidor
$link = mysql_connect("localhost","root","") or die("<h2>No se encuentra el servidor</h2>");
$db = mysql_select_db("venta_autos",$link) or die("<h2>Error de Conexion</h2>");

//obtenemos los valores del formulario

$placa = $_POST['placa'];
$marca = $_POST['marca'];
$tipo = $_POST['tipo'];
$anio = $_POST['anio'];
$precio= $_POST['precio'];
$mensaje = $_POST['mensaje'];

//Obtiene la longitus de un string
$req = (strlen($placa)*strlen($marca)*strlen($tipo)*strlen($anio)*strlen($precio)*strlen($mensaje)) or die("No se han llenado todos los campos");

//ingresamos la informacion a la base de datos
mysql_query("INSERT INTO autos VALUES('$placa','$marca','$tipo','$anio','$precio','$mensaje')",$link) or die("<h2>Error Guardando los datos</h2>");
echo '
        		<script>
        			alert("Registro Exitoso");
        			location.href="actualizacionDatos.php";
        		</script>
        	'
?>


