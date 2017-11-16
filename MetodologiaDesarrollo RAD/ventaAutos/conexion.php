

<?php
/**
 * Created by PhpStorm.
 * User: paul
 * Date: 13/11/2017
 * Time: 20:29
 */

class conexion{
    function recuperarDatos(){
        $link = mysql_connect("localhost","root","") or die("<h2>No se encuentra el servidor</h2>");
        $db = mysql_select_db("venta_autos",$link) or die("<h2>Error de Conexion</h2>");

        $query = "SELECT * FROM autos";
        $resultados = mysql_query($query);

        while ($row = mysql_fetch_array($resultados))
        {
            echo "<table border = '3'> \n";
            echo "<tr>
            <td><b>Placa</b></td>
            <td><b>Marca</b></td>
            <td><b>Tipo</b></td>
            <td><b>año de Fabricacion</b></td>
            <td><b>Precio del Pedido</b></td>
            <td><b>Mensaje</b></td>
                </tr> \n";

            do{
                echo "<tr>
            <td>".$row["placa"]."</td>
            <td>".$row["marca"]."</td>
            <td>".$row["tipo"]."</td>
            <td>".$row["anio"]."</td>
            <td>".$row["precioPedido"]."</td>
            <td>".$row["mensaje"]."</td>
                </tr> \n";

            }while($row = mysql_fetch_array($resultados));

            echo "</table> \n";
        }
    }
}
?>

