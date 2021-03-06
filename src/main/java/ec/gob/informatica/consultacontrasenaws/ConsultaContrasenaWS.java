package ec.gob.informatica.consultacontrasenaws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.6
 * 2015-07-29T12:01:02.528-05:00
 * Generated source version: 2.7.6
 * 
 */
@WebServiceClient(name = "ConsultaContrasenaWS", 
                  wsdlLocation = "http://srvprbews.bsg.int:80/sbsg-sw/ConsultaContrasenaWS/BSG06_Consulta_Contrasenia?wsdl",
                  targetNamespace = "http://www.informatica.gob.ec/ConsultaContrasenaWS") 
public class ConsultaContrasenaWS extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.informatica.gob.ec/ConsultaContrasenaWS", "ConsultaContrasenaWS");
    public final static QName ConsultaContrasenaWSSoapPort = new QName("http://www.informatica.gob.ec/ConsultaContrasenaWS", "ConsultaContrasenaWSSoapPort");
    static {
        URL url = null;
        try {
            url = new URL("http://srvprbews.bsg.int:80/sbsg-sw/ConsultaContrasenaWS/BSG06_Consulta_Contrasenia?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(ConsultaContrasenaWS.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://srvprbews.bsg.int:80/sbsg-sw/ConsultaContrasenaWS/BSG06_Consulta_Contrasenia?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public ConsultaContrasenaWS(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ConsultaContrasenaWS(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ConsultaContrasenaWS() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns BSG06ConsultaContrasenia
     */
    @WebEndpoint(name = "ConsultaContrasenaWSSoapPort")
    public BSG06ConsultaContrasenia getConsultaContrasenaWSSoapPort() {
        return super.getPort(ConsultaContrasenaWSSoapPort, BSG06ConsultaContrasenia.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BSG06ConsultaContrasenia
     */
    @WebEndpoint(name = "ConsultaContrasenaWSSoapPort")
    public BSG06ConsultaContrasenia getConsultaContrasenaWSSoapPort(WebServiceFeature... features) {
        return super.getPort(ConsultaContrasenaWSSoapPort, BSG06ConsultaContrasenia.class, features);
    }

}
