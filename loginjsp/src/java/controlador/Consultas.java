/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author paul
 * autenticacion para un login e ingreso de datos
 */
public class Consultas extends conexion{
    
    public boolean autenticacion(String usuario, String contraseña){
        
        PreparedStatement pst = null;
        ResultSet rs = null; //para guardar el resultado
        
        try {
            String consulta = "select * from usuariosjsp where usuario = ? and pass = ? ";
            pst = getconexion().prepareStatement(consulta);
            pst.setString(1, usuario);
            pst.setString(2, contraseña);  
            rs = pst.executeQuery(); //nos devuelve un resultado
            
            if (rs.absolute(1)) {
                return true;
            }
            
        } catch (Exception e) {
            System.err.println("Error" +e);
        }finally{
            
            try {
                if(getconexion() != null) getconexion().close();
                if(pst != null) pst.close();
                if(rs !=null) rs.close();
                
            } catch (Exception e) {
                System.err.println("Error" +e);
            }
            
        }
        
        return false;
    }
    //con este codigo comentado se puede ver la autenticacion con la base de datos
    /*public static void main(String[] args) {
        Consultas co = new Consultas();
        System.err.println(co.autenticacion("DemianMarley", "12345"));
    }*/
    
   //registrar
    public boolean registrar(String nombre, String apellido, String usuario, String pass){
        
        PreparedStatement pst = null;
        
        try {
            String consula = "insert into usuariosjsp(nombre, apellido,usuario,pass) values(?,?,?,?)";
            pst = getconexion().prepareStatement(consula);
            //pasarle los parametros
            pst.setString(1, nombre);
            pst.setString(2, apellido);
            pst.setString(3, usuario);
            pst.setString(4, pass);
            
            if (pst.executeUpdate() == 1) {
                return true;
            }
            
        } catch (Exception e) {
            System.err.println("Error"+e);
        }finally{
            
            try {
                if(getconexion() != null) getconexion().close();
                if(pst != null) pst.close();
                
            } catch (Exception e) {
                System.err.println("Error"+e);
            }
            
        }
         
        return false;
    }
    
    
    //para pobar que se ingresa los datos a la base 
   /* public static void main(String[] args) {
        Consultas co = new Consultas();
       
        System.err.println(co.registrar("Paul", "Guamani", "polfercho", "12365"));
        
        
    }*/
    
}
