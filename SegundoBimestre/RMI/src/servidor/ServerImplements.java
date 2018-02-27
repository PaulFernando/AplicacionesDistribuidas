/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor;

//librerias 

import rmi.RemoteInterface;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author paul
 */
//clase hija ke hereda de objetos rmi. Clase ke usa esta interfaz
public class ServerImplements extends UnicastRemoteObject implements RemoteInterface {
    
    public ServerImplements() throws Exception{
    
        super();
    
    }
    
    //desarrollo de la funcion a ser distribuida
    @Override
    public int sumacliente (int x, int y){
    
        return (x+y);
    
    }
    
}
