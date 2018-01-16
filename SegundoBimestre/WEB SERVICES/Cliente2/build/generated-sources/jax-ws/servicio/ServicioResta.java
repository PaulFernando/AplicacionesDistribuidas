
package servicio;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "servicioResta", targetNamespace = "http://Servicio/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ServicioResta {


    /**
     * 
     * @param a
     * @param b
     * @return
     *     returns java.lang.Double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "resta", targetNamespace = "http://Servicio/", className = "servicio.Resta")
    @ResponseWrapper(localName = "restaResponse", targetNamespace = "http://Servicio/", className = "servicio.RestaResponse")
    @Action(input = "http://Servicio/servicioResta/restaRequest", output = "http://Servicio/servicioResta/restaResponse")
    public Double resta(
        @WebParam(name = "a", targetNamespace = "")
        double a,
        @WebParam(name = "b", targetNamespace = "")
        double b);

    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://Servicio/", className = "servicio.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://Servicio/", className = "servicio.HelloResponse")
    @Action(input = "http://Servicio/servicioResta/helloRequest", output = "http://Servicio/servicioResta/helloResponse")
    public String hello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

}
