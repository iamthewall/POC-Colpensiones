
package co.gov.colpensiones.schemas._1_0.comun;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the co.gov.colpensiones.schemas._1_0.comun package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _TipoCredencialesAutorizacion_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/comun", "tipoCredencialesAutorizacion");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: co.gov.colpensiones.schemas._1_0.comun
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TipoCredencialesAutorizacion }
     * 
     */
    public TipoCredencialesAutorizacion createTipoCredencialesAutorizacion() {
        return new TipoCredencialesAutorizacion();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoCredencialesAutorizacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/comun", name = "tipoCredencialesAutorizacion")
    public JAXBElement<TipoCredencialesAutorizacion> createTipoCredencialesAutorizacion(TipoCredencialesAutorizacion value) {
        return new JAXBElement<TipoCredencialesAutorizacion>(_TipoCredencialesAutorizacion_QNAME, TipoCredencialesAutorizacion.class, null, value);
    }

}
