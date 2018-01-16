/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author paul
 */
public class ClienteRemimpl extends EpnRemoto.EpnRemPOA{
    
    public ClienteRemimpl(){
        
    }
    public String Saludar(String nombre){
        return "Hola "+nombre;
    }
    
}
