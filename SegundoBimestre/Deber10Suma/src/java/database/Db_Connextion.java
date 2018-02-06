/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.*; 
import java.util.logging.Level; 
import java.util.logging.Logger; 

/**
 *
 * @author paul
 */
public class Db_Connextion {
    
      public Connection Connection(){
        try {
            
            //llamar al archivo jar para la conexion
            Class.forName("com.mysql.jdbc.Driver");
            //definir la cadena de conexion
            String cadena ="jdbc:mysql://localhost:3306/suma?user=root";
            //pasamos como parametro para establecer la conexion
            Connection myConnection = DriverManager.getConnection(cadena);
            //retornamos un valor
            return myConnection;
            
        } catch ( ClassNotFoundException |  SQLException ex) {
            Logger.getLogger(Db_Connextion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}
