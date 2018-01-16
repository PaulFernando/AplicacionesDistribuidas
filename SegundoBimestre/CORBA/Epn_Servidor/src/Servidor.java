/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author paul
 */

import org.omg.CORBA.ORB;
import org.omg.CosNaming.NameComponent;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;
import org.omg.PortableServer.POA;
import org.omg.PortableServer.POAHelper;



public class Servidor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Iniciando");
        try {
            // crear e inicializar ORB
            //AQUI SE ALMACENA LA LOCALIZACIÓN DE LA TIENDA
            ORB orb = ORB.init(args, null);
            // crear un objeto remoto
            //POSER UTILIZAR LA FUNCIÓN SALUDAR DELA CLASE CLIENTREMIMPL
            //Y POSER RETORNAR EL VALOR
            //PROCESAR EL PEDIDO DEL CLIENTE
            //INVOCA A LA FUNCIÓN SALUDAR 
            ClienteRemimpl impl = new ClienteRemimpl();
            // obtener referencia rootpoa y activar el POAManager
            //VA A NECESITAR RECURSOS PARA REALIZAR LA ACCIÓN 
            //INICIALIZAR CORBA DENTRO DEL SERVIDOR 
            POA rootpoa = POAHelper.narrow(orb
                    .resolve_initial_references("RootPOA"));
            //ACTIVAR EL RECURSO
            rootpoa.the_POAManager().activate();
            // obtener una referencia al objeto remoto
            //A LO QUE TU QUIERES SON NARANAJAS 
            org.omg.CORBA.Object ref = rootpoa.servant_to_reference(impl);
            //SI TENGO NARANJAS ENTONCES LE VOY A DAR NARANJAS
            //EJECUTAR LA FUCNIÓN
            EpnRemoto.EpnRem href = EpnRemoto.EpnRemHelper .narrow(ref);
            // las siguientes lineas me permiten publicar un obj remoto
            //TENGA LAS NARANJAS
            
            org.omg.CORBA.Object objRef = orb
                    .resolve_initial_references("NameService");
            //SELECCIONAR A VER QUIEN ENTREGO LAS NARANJAES 
            NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);
            // nombre con el cual voy a publicar mi objeto
            //USTED FUE LA QUE ME SOLICITO LAS NARANJAS
            String nombre = "EpnRemoto";
            //SELECCIONA A LA PERSONA ADECUADA
            NameComponent path[] = ncRef.to_name(nombre);
            // publicar el objeto
            //LO LOCALIZA
            ncRef.rebind(path, href);
            // ejecutar el orb
            //EJECUTA EL PROCESO
            orb.run();
        } catch (Exception e) {
            System.err.println("ERROR: " + e);
        }
    }
    
}
