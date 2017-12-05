/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import database.Db_Conexion;
import java.sql.Connection;

/**
 *
 * @author paul
 */
public class probarConexion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
          // Objeto de la clase 
        Db_Conexion c = new Db_Conexion();
        if (c.Connection()!= null) {
            System.err.println("conexion realizada");
        }else{
            System.err.println("conexion NO realizada");
        }
    }
    
}
