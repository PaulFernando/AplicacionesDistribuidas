
import org.omg.CORBA.*;
import org.omg.CosNaming.*;
import org.omg.CosNaming.NamingContextPackage.*;
public class Cliente {

    public static void main(String[] args) {
        // TODO code application logic here
        
         try{
            //instanciar a la libreria ORB de CORBA
            //pregunta donde queda --> ORB.init()
            //buscar informacion de lo que se quiere hace
            //el init inicia algo
            ORB orb = ORB.init(args, null);
            /*
            buscar el servidor
            con el fin de que el cliente sepa que es un servidor de corba
            luego me dicen saben la .. queda en tal direccion
            llega a la direccio y pregunra sis es ..
            y la respuesta se va a guardar en un objeRef
            buscar ..
            es una referencia al servidor
            */
            org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
            /*
            oermite obtener una ref a un objeto remoto
            pregunta el cliente a la fruteria tiene naranjas
            y ese pedido se guarda en en ncRef
            peticion  a objeto remoto
            */
            NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);
            /*
                nombre del objt remoto
            aqui voy a crear el usuario para que me entregue pedido
            
            */
            String nombre = "EpnRemoto";
            /*
            espero ya le entrego naranjas
            llamar a la funcion saludar
            */
            EpnRemoto.EpnRem impl = EpnRemoto.EpnRemHelper.narrow(ncRef.resolve_str(nombre));
         
            /*ya se entrega las naranjas*/
            System.out.println(impl.Saludar("-Paul Guamani Morales-"));
        }catch(Exception e){
            System.out.println("Error: "+e);
            e.printStackTrace(System.out);
        }
    }
    
}
