/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import database.Db_Conexion;
import java.sql.Connection;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.SQLDataException;

/**
 *
 * @author paul
 */
public class registroproveedores {
    
    private String nombre, ruc, direccion, telefono, email, ciudad, sitioweb;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setSitioweb(String sitioweb) {
        this.sitioweb = sitioweb;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRuc() {
        return ruc;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getSitioweb() {
        return sitioweb;
    }
    
    public void RegistroEstudiante(){
    
        try {
            //conexion a la base de datos y luego una instancia a la base de datos
            Db_Conexion dbconn = new Db_Conexion();
            Connection myconnection = dbconn.Connection();
            //Sentencia SQL para insetar a la base 
            String sqlString = "INSERT INTO datosproveedores (nombre,ruc,direccion,telefono,email,ciudad,sitioweb) VALUES ('" + nombre + "','" + ruc + "','" + direccion + "','" + telefono + "','" + email + "','" + ciudad + "','" + sitioweb + "')";
            
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
                Logger.getLogger(registroproveedores.class.getName()).log(Level.SEVERE, null, e);    
            }    
            
        } catch (Exception e) {
            Logger.getLogger(registroproveedores.class.getName()).log(Level.SEVERE, null, e);
        }
    
    }
    
    
}
