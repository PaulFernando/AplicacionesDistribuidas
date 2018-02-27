/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

//librerias para java rmi
import java.rmi.Remote;

/**
 *
 * @author paul
 */
// aqui se encuentran las funciones ke el cliente va a utilizar
// de la misma manera las funciones que el servidor va a proveer
public interface RemoteInterface extends Remote {
    
    public int sumacliente (int x, int y) throws Exception;
    
}
