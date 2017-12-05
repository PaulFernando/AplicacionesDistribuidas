/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.SQLDataException;
import java.sql.*;
import database.Db_Conexion;
import java.util.logging.Level; 
import java.util.logging.Logger;

/**
 *
 * @author paul
 */
public class registroEstudiante {
    
    private String nombre, apellido, email, genero, archivo;
    private String codigo, telefono;

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEmail() {
        return email;
    }

    public String getGenero() {
        return genero;
    }

    public String getArchivo() {
        return archivo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }

    
    
    public void RegistroEstudiante(){
    
        try {
            //conexion a la base de datos y luego una instancia a la base de datos
            Db_Conexion dbconn = new Db_Conexion();
            Connection myconnection = dbconn.Connection();
            //Sentencia SQL para insetar a la base 
            String sqlString = "INSERT INTO datos (nombre,apellido,codigo,email,telefono,genero,archivo) VALUES ('" + nombre + "','" + apellido + "','" + codigo + "','" + email + "','" + telefono + "','" + genero + "','" + archivo + "')";
            
            //Validar la sentencia
            Statement myStatement = myconnection.createStatement();
            
            try {
                //insercion de la sentencia SQL
                //Ejecuta Insert
                myStatement.executeUpdate(sqlString);
                //cierra la cadena
                myStatement.close();
                //termina la conexion
                myconnection.close();
                
            } catch (Exception e) {
                Logger.getLogger(registroEstudiante.class.getName()).log(Level.SEVERE, null, e);    
            }    
            
        } catch (Exception e) {
            Logger.getLogger(registroEstudiante.class.getName()).log(Level.SEVERE, null, e);
        }
    
    }
    
    
    
}
