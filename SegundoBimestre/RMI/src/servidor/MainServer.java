/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author paul
 */
public class MainServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try {
            //inicializar al servidor
            Registry miregistro = LocateRegistry.createRegistry(1234);
            miregistro.rebind("ejemplo", new ServerImplements());
            System.out.println("servidor encendido");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    
}
