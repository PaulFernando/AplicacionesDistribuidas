/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;


import java.sql.Connection;
import java.sql.SQLDataException;
import java.sql.*;
import database.Db_Connextion;
import static java.lang.System.out;
import java.util.logging.Level; 
import java.util.logging.Logger;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author paul
 */
public class suma {
    
    private String numero1, numero2;

    public void setNumero1(String numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(String numero2) {
        this.numero2 = numero2;
    }

    public void setConexion(Connection conexion) {
        this.conexion = conexion;
    }

    public String getNumero1() {
        return numero1;
    }

    public String getNumero2() {
        return numero2;
    }

    public Connection getConexion() {
        return conexion;
    }

    

        Connection conexion = null; //objeto para la bd
        Statement sentencia1 = null; //onjeto para ejecutar 1
        Statement sentencia2 = null; //objeto para ejecutar 2
        ResultSet resultados = null; //objeto para guardar los resultados

    public void setSentencia1(Statement sentencia1) {
        this.sentencia1 = sentencia1;
    }

    public void setSentencia2(Statement sentencia2) {
        this.sentencia2 = sentencia2;
    }

    public void setResultados(ResultSet resultados) {
        this.resultados = resultados;
    }

    public Statement getSentencia1() {
        return sentencia1;
    }

    public Statement getSentencia2() {
        return sentencia2;
    }

    public ResultSet getResultados() {
        return resultados;
    }
    
    public String total = numero1+numero2;

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

   
    
    
    public void RegistroSuma(){
    
          try {
              
            Db_Connextion dbconn = new Db_Connextion();
            Connection myconnection = dbconn.Connection();
            //Sentencia SQL para insetar a la base 
              
          
            //INSERTAR
            sentencia1 = conexion.createStatement();
            //visualizar o traer 
            sentencia2 = conexion.createStatement();

            sentencia1.execute("INSERT INTO total_suma(total, numero1, numero2)"
                    + "VALUES('" + total + "','" + numero1 + "','" + numero2 + "');");
            //conexion a la base de datos y luego una instancia a la base de datos
            
             resultados = sentencia2.executeQuery("SELECT * FROM total_suma");
             
             total = numero1+numero2;
             
          } catch (SQLException e2) 
        {
            out.println("ERROR: fallo en sql" + e2.getMessage());
        } 
        finally 
        {
            try 
            {
                if (conexion != null) 
                {
                    conexion.close();
                }
            } 
            catch (Exception e3) 
            {
                out.println("descanectra la base de datos" + e3.getMessage());
            }
        }
            
 
    }

   
       
}

      
        
      
            
            

      
             
    
    

