package co.gov.colpensiones.contracts._1_0.personas;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.6
 * 2015-08-03T17:02:59.113-05:00
 * Generated source version: 2.7.6
 * 
 */
@WebServiceClient(name = "RegistroDocumento", 
                  wsdlLocation = "file:/home/aromero/git/POC-Colpensiones/colpensiones/wsdl/RegistrarDocumento.wsdl",
                  targetNamespace = "http://www.colpensiones.gov.co/contracts/1.0/personas") 
public class RegistroDocumento extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.colpensiones.gov.co/contracts/1.0/personas", "RegistroDocumento");
    public final static QName EndpointRegistroDocumentoNuevo = new QName("http://www.colpensiones.gov.co/contracts/1.0/personas", "EndpointRegistroDocumentoNuevo");
    static {
        URL url = null;
        try {
            url = new URL("file:/home/aromero/git/POC-Colpensiones/colpensiones/wsdl/RegistrarDocumento.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(RegistroDocumento.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/home/aromero/git/POC-Colpensiones/colpensiones/wsdl/RegistrarDocumento.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public RegistroDocumento(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public RegistroDocumento(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public RegistroDocumento() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public RegistroDocumento(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public RegistroDocumento(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public RegistroDocumento(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns ContratoRegistroArchivosNuevo
     */
    @WebEndpoint(name = "EndpointRegistroDocumentoNuevo")
    public ContratoRegistroArchivosNuevo getEndpointRegistroDocumentoNuevo() {
        return super.getPort(EndpointRegistroDocumentoNuevo, ContratoRegistroArchivosNuevo.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ContratoRegistroArchivosNuevo
     */
    @WebEndpoint(name = "EndpointRegistroDocumentoNuevo")
    public ContratoRegistroArchivosNuevo getEndpointRegistroDocumentoNuevo(WebServiceFeature... features) {
        return super.getPort(EndpointRegistroDocumentoNuevo, ContratoRegistroArchivosNuevo.class, features);
    }

}
