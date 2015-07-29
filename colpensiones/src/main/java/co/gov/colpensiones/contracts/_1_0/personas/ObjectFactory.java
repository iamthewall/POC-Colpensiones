
package co.gov.colpensiones.contracts._1_0.personas;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import co.gov.colpensiones.schemas._1_0.comun.errores.TipoEstadoEjecucion;
import co.gov.colpensiones.schemas._1_0.personas.TipoAplicarDispocision;
import co.gov.colpensiones.schemas._1_0.personas.TipoConsultaRecord;
import co.gov.colpensiones.schemas._1_0.personas.TipoConsultaSeries;
import co.gov.colpensiones.schemas._1_0.personas.TipoCriterioContent;
import co.gov.colpensiones.schemas._1_0.personas.TipoDigitalizadosDTO;
import co.gov.colpensiones.schemas._1_0.personas.TipoDocumentoConsultaTRD;
import co.gov.colpensiones.schemas._1_0.personas.TipoDocumentoContent;
import co.gov.colpensiones.schemas._1_0.personas.TipoDocumentoDTO;
import co.gov.colpensiones.schemas._1_0.personas.TipoDocumentosTRDDTO;
import co.gov.colpensiones.schemas._1_0.personas.TipoExpedienteContent;
import co.gov.colpensiones.schemas._1_0.personas.TipoExpedienteRecord;
import co.gov.colpensiones.schemas._1_0.personas.TipoIdentificacionDocumentoDTO;
import co.gov.colpensiones.schemas._1_0.personas.TipoIdentificacionDocumentoTRD;
import co.gov.colpensiones.schemas._1_0.personas.TipoInformacionActualizarMetadataDTO;
import co.gov.colpensiones.schemas._1_0.personas.TipoInformacionConsultaDigitalizadosDTO;
import co.gov.colpensiones.schemas._1_0.personas.TipoInformacionConsultaDocumentosTRD;
import co.gov.colpensiones.schemas._1_0.personas.TipoInformacionMovimientoDocumentoTRDDTO;
import co.gov.colpensiones.schemas._1_0.personas.TipoInformacionRegistroNuevo;
import co.gov.colpensiones.schemas._1_0.personas.TipoInformacionRegistroTRDDTO;
import co.gov.colpensiones.schemas._1_0.personas.TipoObtenerDocumentosTRD;
import co.gov.colpensiones.schemas._1_0.personas.TipoResultadoDispocision;
import co.gov.colpensiones.schemas._1_0.personas.TipoSeguridadSeries;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the co.gov.colpensiones.contracts._1_0.personas package. 
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

    private final static QName _EstadosRecord_QNAME = new QName("http://www.colpensiones.gov.co/contracts/1.0/personas", "EstadosRecord");
    private final static QName _ResultadosRecord_QNAME = new QName("http://www.colpensiones.gov.co/contracts/1.0/personas", "ResultadosRecord");
    private final static QName _CriteriosSeguridadSeries_QNAME = new QName("http://www.colpensiones.gov.co/contracts/1.0/personas", "CriteriosSeguridadSeries");
    private final static QName _CriteriosRecord_QNAME = new QName("http://www.colpensiones.gov.co/contracts/1.0/personas", "CriteriosRecord");
    private final static QName _DocumentosTRD_QNAME = new QName("http://www.colpensiones.gov.co/contracts/1.0/personas", "DocumentosTRD");
    private final static QName _CriteriosContent_QNAME = new QName("http://www.colpensiones.gov.co/contracts/1.0/personas", "CriteriosContent");
    private final static QName _EstadoEjecucion_QNAME = new QName("http://www.colpensiones.gov.co/contracts/1.0/personas", "EstadoEjecucion");
    private final static QName _IdentificacionDocumentoDTO_QNAME = new QName("http://www.colpensiones.gov.co/contracts/1.0/personas", "IdentificacionDocumentoDTO");
    private final static QName _EstadosSeguridadSeries_QNAME = new QName("http://www.colpensiones.gov.co/contracts/1.0/personas", "EstadosSeguridadSeries");
    private final static QName _CriteriosConsultaDigitalizadosDTO_QNAME = new QName("http://www.colpensiones.gov.co/contracts/1.0/personas", "CriteriosConsultaDigitalizadosDTO");
    private final static QName _IdentificacionExpedienteContent_QNAME = new QName("http://www.colpensiones.gov.co/contracts/1.0/personas", "IdentificacionExpedienteContent");
    private final static QName _DocumentosContent_QNAME = new QName("http://www.colpensiones.gov.co/contracts/1.0/personas", "DocumentosContent");
    private final static QName _InformacionRegistroNuevo_QNAME = new QName("http://www.colpensiones.gov.co/contracts/1.0/personas", "InformacionRegistroNuevo");
    private final static QName _InformacionExpedienteRecord_QNAME = new QName("http://www.colpensiones.gov.co/contracts/1.0/personas", "InformacionExpedienteRecord");
    private final static QName _DigitalizadosDTO_QNAME = new QName("http://www.colpensiones.gov.co/contracts/1.0/personas", "DigitalizadosDTO");
    private final static QName _InformacionRegistroTRDDTO_QNAME = new QName("http://www.colpensiones.gov.co/contracts/1.0/personas", "InformacionRegistroTRDDTO");
    private final static QName _DocumentoDTO_QNAME = new QName("http://www.colpensiones.gov.co/contracts/1.0/personas", "DocumentoDTO");
    private final static QName _IdentificacionRecord_QNAME = new QName("http://www.colpensiones.gov.co/contracts/1.0/personas", "IdentificacionRecord");
    private final static QName _IdentificacionDocumentoTRD_QNAME = new QName("http://www.colpensiones.gov.co/contracts/1.0/personas", "IdentificacionDocumentoTRD");
    private final static QName _CriteriosConsultaTRD_QNAME = new QName("http://www.colpensiones.gov.co/contracts/1.0/personas", "CriteriosConsultaTRD");
    private final static QName _InformacionMovimientoDocumentoTRDDTO_QNAME = new QName("http://www.colpensiones.gov.co/contracts/1.0/personas", "InformacionMovimientoDocumentoTRDDTO");
    private final static QName _DocumentosTRDDTO_QNAME = new QName("http://www.colpensiones.gov.co/contracts/1.0/personas", "DocumentosTRDDTO");
    private final static QName _InformacionActualizarDTO_QNAME = new QName("http://www.colpensiones.gov.co/contracts/1.0/personas", "InformacionActualizarDTO");
    private final static QName _ObtenerDocumentoTRD_QNAME = new QName("http://www.colpensiones.gov.co/contracts/1.0/personas", "ObtenerDocumentoTRD");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: co.gov.colpensiones.contracts._1_0.personas
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoExpedienteRecord }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/contracts/1.0/personas", name = "EstadosRecord")
    public JAXBElement<TipoExpedienteRecord> createEstadosRecord(TipoExpedienteRecord value) {
        return new JAXBElement<TipoExpedienteRecord>(_EstadosRecord_QNAME, TipoExpedienteRecord.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoResultadoDispocision }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/contracts/1.0/personas", name = "ResultadosRecord")
    public JAXBElement<TipoResultadoDispocision> createResultadosRecord(TipoResultadoDispocision value) {
        return new JAXBElement<TipoResultadoDispocision>(_ResultadosRecord_QNAME, TipoResultadoDispocision.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoConsultaSeries }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/contracts/1.0/personas", name = "CriteriosSeguridadSeries")
    public JAXBElement<TipoConsultaSeries> createCriteriosSeguridadSeries(TipoConsultaSeries value) {
        return new JAXBElement<TipoConsultaSeries>(_CriteriosSeguridadSeries_QNAME, TipoConsultaSeries.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoConsultaRecord }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/contracts/1.0/personas", name = "CriteriosRecord")
    public JAXBElement<TipoConsultaRecord> createCriteriosRecord(TipoConsultaRecord value) {
        return new JAXBElement<TipoConsultaRecord>(_CriteriosRecord_QNAME, TipoConsultaRecord.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoDocumentoConsultaTRD }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/contracts/1.0/personas", name = "DocumentosTRD")
    public JAXBElement<TipoDocumentoConsultaTRD> createDocumentosTRD(TipoDocumentoConsultaTRD value) {
        return new JAXBElement<TipoDocumentoConsultaTRD>(_DocumentosTRD_QNAME, TipoDocumentoConsultaTRD.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoCriterioContent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/contracts/1.0/personas", name = "CriteriosContent")
    public JAXBElement<TipoCriterioContent> createCriteriosContent(TipoCriterioContent value) {
        return new JAXBElement<TipoCriterioContent>(_CriteriosContent_QNAME, TipoCriterioContent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoEstadoEjecucion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/contracts/1.0/personas", name = "EstadoEjecucion")
    public JAXBElement<TipoEstadoEjecucion> createEstadoEjecucion(TipoEstadoEjecucion value) {
        return new JAXBElement<TipoEstadoEjecucion>(_EstadoEjecucion_QNAME, TipoEstadoEjecucion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoIdentificacionDocumentoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/contracts/1.0/personas", name = "IdentificacionDocumentoDTO")
    public JAXBElement<TipoIdentificacionDocumentoDTO> createIdentificacionDocumentoDTO(TipoIdentificacionDocumentoDTO value) {
        return new JAXBElement<TipoIdentificacionDocumentoDTO>(_IdentificacionDocumentoDTO_QNAME, TipoIdentificacionDocumentoDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoSeguridadSeries }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/contracts/1.0/personas", name = "EstadosSeguridadSeries")
    public JAXBElement<TipoSeguridadSeries> createEstadosSeguridadSeries(TipoSeguridadSeries value) {
        return new JAXBElement<TipoSeguridadSeries>(_EstadosSeguridadSeries_QNAME, TipoSeguridadSeries.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoInformacionConsultaDigitalizadosDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/contracts/1.0/personas", name = "CriteriosConsultaDigitalizadosDTO")
    public JAXBElement<TipoInformacionConsultaDigitalizadosDTO> createCriteriosConsultaDigitalizadosDTO(TipoInformacionConsultaDigitalizadosDTO value) {
        return new JAXBElement<TipoInformacionConsultaDigitalizadosDTO>(_CriteriosConsultaDigitalizadosDTO_QNAME, TipoInformacionConsultaDigitalizadosDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoExpedienteContent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/contracts/1.0/personas", name = "IdentificacionExpedienteContent")
    public JAXBElement<TipoExpedienteContent> createIdentificacionExpedienteContent(TipoExpedienteContent value) {
        return new JAXBElement<TipoExpedienteContent>(_IdentificacionExpedienteContent_QNAME, TipoExpedienteContent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoDocumentoContent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/contracts/1.0/personas", name = "DocumentosContent")
    public JAXBElement<TipoDocumentoContent> createDocumentosContent(TipoDocumentoContent value) {
        return new JAXBElement<TipoDocumentoContent>(_DocumentosContent_QNAME, TipoDocumentoContent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoInformacionRegistroNuevo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/contracts/1.0/personas", name = "InformacionRegistroNuevo")
    public JAXBElement<TipoInformacionRegistroNuevo> createInformacionRegistroNuevo(TipoInformacionRegistroNuevo value) {
        return new JAXBElement<TipoInformacionRegistroNuevo>(_InformacionRegistroNuevo_QNAME, TipoInformacionRegistroNuevo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoExpedienteRecord }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/contracts/1.0/personas", name = "InformacionExpedienteRecord")
    public JAXBElement<TipoExpedienteRecord> createInformacionExpedienteRecord(TipoExpedienteRecord value) {
        return new JAXBElement<TipoExpedienteRecord>(_InformacionExpedienteRecord_QNAME, TipoExpedienteRecord.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoDigitalizadosDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/contracts/1.0/personas", name = "DigitalizadosDTO")
    public JAXBElement<TipoDigitalizadosDTO> createDigitalizadosDTO(TipoDigitalizadosDTO value) {
        return new JAXBElement<TipoDigitalizadosDTO>(_DigitalizadosDTO_QNAME, TipoDigitalizadosDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoInformacionRegistroTRDDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/contracts/1.0/personas", name = "InformacionRegistroTRDDTO")
    public JAXBElement<TipoInformacionRegistroTRDDTO> createInformacionRegistroTRDDTO(TipoInformacionRegistroTRDDTO value) {
        return new JAXBElement<TipoInformacionRegistroTRDDTO>(_InformacionRegistroTRDDTO_QNAME, TipoInformacionRegistroTRDDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoDocumentoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/contracts/1.0/personas", name = "DocumentoDTO")
    public JAXBElement<TipoDocumentoDTO> createDocumentoDTO(TipoDocumentoDTO value) {
        return new JAXBElement<TipoDocumentoDTO>(_DocumentoDTO_QNAME, TipoDocumentoDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoAplicarDispocision }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/contracts/1.0/personas", name = "IdentificacionRecord")
    public JAXBElement<TipoAplicarDispocision> createIdentificacionRecord(TipoAplicarDispocision value) {
        return new JAXBElement<TipoAplicarDispocision>(_IdentificacionRecord_QNAME, TipoAplicarDispocision.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoIdentificacionDocumentoTRD }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/contracts/1.0/personas", name = "IdentificacionDocumentoTRD")
    public JAXBElement<TipoIdentificacionDocumentoTRD> createIdentificacionDocumentoTRD(TipoIdentificacionDocumentoTRD value) {
        return new JAXBElement<TipoIdentificacionDocumentoTRD>(_IdentificacionDocumentoTRD_QNAME, TipoIdentificacionDocumentoTRD.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoInformacionConsultaDocumentosTRD }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/contracts/1.0/personas", name = "CriteriosConsultaTRD")
    public JAXBElement<TipoInformacionConsultaDocumentosTRD> createCriteriosConsultaTRD(TipoInformacionConsultaDocumentosTRD value) {
        return new JAXBElement<TipoInformacionConsultaDocumentosTRD>(_CriteriosConsultaTRD_QNAME, TipoInformacionConsultaDocumentosTRD.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoInformacionMovimientoDocumentoTRDDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/contracts/1.0/personas", name = "InformacionMovimientoDocumentoTRDDTO")
    public JAXBElement<TipoInformacionMovimientoDocumentoTRDDTO> createInformacionMovimientoDocumentoTRDDTO(TipoInformacionMovimientoDocumentoTRDDTO value) {
        return new JAXBElement<TipoInformacionMovimientoDocumentoTRDDTO>(_InformacionMovimientoDocumentoTRDDTO_QNAME, TipoInformacionMovimientoDocumentoTRDDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoDocumentosTRDDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/contracts/1.0/personas", name = "DocumentosTRDDTO")
    public JAXBElement<TipoDocumentosTRDDTO> createDocumentosTRDDTO(TipoDocumentosTRDDTO value) {
        return new JAXBElement<TipoDocumentosTRDDTO>(_DocumentosTRDDTO_QNAME, TipoDocumentosTRDDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoInformacionActualizarMetadataDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/contracts/1.0/personas", name = "InformacionActualizarDTO")
    public JAXBElement<TipoInformacionActualizarMetadataDTO> createInformacionActualizarDTO(TipoInformacionActualizarMetadataDTO value) {
        return new JAXBElement<TipoInformacionActualizarMetadataDTO>(_InformacionActualizarDTO_QNAME, TipoInformacionActualizarMetadataDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoObtenerDocumentosTRD }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/contracts/1.0/personas", name = "ObtenerDocumentoTRD")
    public JAXBElement<TipoObtenerDocumentosTRD> createObtenerDocumentoTRD(TipoObtenerDocumentosTRD value) {
        return new JAXBElement<TipoObtenerDocumentosTRD>(_ObtenerDocumentoTRD_QNAME, TipoObtenerDocumentosTRD.class, null, value);
    }

}
