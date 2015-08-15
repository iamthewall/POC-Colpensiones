
package com.redhat.colpensiones;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para afiliado complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="afiliado">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="af_Depura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="af_Direccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="af_Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="af_Estado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="af_EstadoCarnet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="af_Estrato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="af_FechaModificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="af_FechaNacimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="af_GrupEtnico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="af_NumeroCarnet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="af_NumeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="af_PrimerApellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="af_PrimerNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="af_Sector" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="af_SegundoApellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="af_SegundoNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="af_Sexo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="af_Telefono" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="af_TipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="af_Zona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dp_Departamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gp_GrupoPoblacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gs_GrupoSanguineo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lc_Localidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mu_Municipio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="na_Nacionalidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "afiliado", propOrder = {
    "afDepura",
    "afDireccion",
    "afEmail",
    "afEstado",
    "afEstadoCarnet",
    "afEstrato",
    "afFechaModificacion",
    "afFechaNacimiento",
    "afGrupEtnico",
    "afNumeroCarnet",
    "afNumeroDocumento",
    "afPrimerApellido",
    "afPrimerNombre",
    "afSector",
    "afSegundoApellido",
    "afSegundoNombre",
    "afSexo",
    "afTelefono",
    "afTipoDocumento",
    "afZona",
    "dpDepartamento",
    "gpGrupoPoblacion",
    "gsGrupoSanguineo",
    "lcLocalidad",
    "muMunicipio",
    "naNacionalidad"
})
public class Afiliado {

    @XmlElement(name = "af_Depura")
    protected String afDepura;
    @XmlElement(name = "af_Direccion")
    protected String afDireccion;
    @XmlElement(name = "af_Email")
    protected String afEmail;
    @XmlElement(name = "af_Estado")
    protected String afEstado;
    @XmlElement(name = "af_EstadoCarnet")
    protected String afEstadoCarnet;
    @XmlElement(name = "af_Estrato")
    protected String afEstrato;
    @XmlElement(name = "af_FechaModificacion")
    protected String afFechaModificacion;
    @XmlElement(name = "af_FechaNacimiento")
    protected String afFechaNacimiento;
    @XmlElement(name = "af_GrupEtnico")
    protected String afGrupEtnico;
    @XmlElement(name = "af_NumeroCarnet")
    protected String afNumeroCarnet;
    @XmlElement(name = "af_NumeroDocumento")
    protected String afNumeroDocumento;
    @XmlElement(name = "af_PrimerApellido")
    protected String afPrimerApellido;
    @XmlElement(name = "af_PrimerNombre")
    protected String afPrimerNombre;
    @XmlElement(name = "af_Sector")
    protected String afSector;
    @XmlElement(name = "af_SegundoApellido")
    protected String afSegundoApellido;
    @XmlElement(name = "af_SegundoNombre")
    protected String afSegundoNombre;
    @XmlElement(name = "af_Sexo")
    protected String afSexo;
    @XmlElement(name = "af_Telefono")
    protected String afTelefono;
    @XmlElement(name = "af_TipoDocumento")
    protected String afTipoDocumento;
    @XmlElement(name = "af_Zona")
    protected String afZona;
    @XmlElement(name = "dp_Departamento")
    protected String dpDepartamento;
    @XmlElement(name = "gp_GrupoPoblacion")
    protected String gpGrupoPoblacion;
    @XmlElement(name = "gs_GrupoSanguineo")
    protected String gsGrupoSanguineo;
    @XmlElement(name = "lc_Localidad")
    protected String lcLocalidad;
    @XmlElement(name = "mu_Municipio")
    protected String muMunicipio;
    @XmlElement(name = "na_Nacionalidad")
    protected String naNacionalidad;

    /**
     * Obtiene el valor de la propiedad afDepura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAfDepura() {
        return afDepura;
    }

    /**
     * Define el valor de la propiedad afDepura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAfDepura(String value) {
        this.afDepura = value;
    }

    /**
     * Obtiene el valor de la propiedad afDireccion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAfDireccion() {
        return afDireccion;
    }

    /**
     * Define el valor de la propiedad afDireccion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAfDireccion(String value) {
        this.afDireccion = value;
    }

    /**
     * Obtiene el valor de la propiedad afEmail.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAfEmail() {
        return afEmail;
    }

    /**
     * Define el valor de la propiedad afEmail.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAfEmail(String value) {
        this.afEmail = value;
    }

    /**
     * Obtiene el valor de la propiedad afEstado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAfEstado() {
        return afEstado;
    }

    /**
     * Define el valor de la propiedad afEstado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAfEstado(String value) {
        this.afEstado = value;
    }

    /**
     * Obtiene el valor de la propiedad afEstadoCarnet.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAfEstadoCarnet() {
        return afEstadoCarnet;
    }

    /**
     * Define el valor de la propiedad afEstadoCarnet.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAfEstadoCarnet(String value) {
        this.afEstadoCarnet = value;
    }

    /**
     * Obtiene el valor de la propiedad afEstrato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAfEstrato() {
        return afEstrato;
    }

    /**
     * Define el valor de la propiedad afEstrato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAfEstrato(String value) {
        this.afEstrato = value;
    }

    /**
     * Obtiene el valor de la propiedad afFechaModificacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAfFechaModificacion() {
        return afFechaModificacion;
    }

    /**
     * Define el valor de la propiedad afFechaModificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAfFechaModificacion(String value) {
        this.afFechaModificacion = value;
    }

    /**
     * Obtiene el valor de la propiedad afFechaNacimiento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAfFechaNacimiento() {
        return afFechaNacimiento;
    }

    /**
     * Define el valor de la propiedad afFechaNacimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAfFechaNacimiento(String value) {
        this.afFechaNacimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad afGrupEtnico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAfGrupEtnico() {
        return afGrupEtnico;
    }

    /**
     * Define el valor de la propiedad afGrupEtnico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAfGrupEtnico(String value) {
        this.afGrupEtnico = value;
    }

    /**
     * Obtiene el valor de la propiedad afNumeroCarnet.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAfNumeroCarnet() {
        return afNumeroCarnet;
    }

    /**
     * Define el valor de la propiedad afNumeroCarnet.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAfNumeroCarnet(String value) {
        this.afNumeroCarnet = value;
    }

    /**
     * Obtiene el valor de la propiedad afNumeroDocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAfNumeroDocumento() {
        return afNumeroDocumento;
    }

    /**
     * Define el valor de la propiedad afNumeroDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAfNumeroDocumento(String value) {
        this.afNumeroDocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad afPrimerApellido.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAfPrimerApellido() {
        return afPrimerApellido;
    }

    /**
     * Define el valor de la propiedad afPrimerApellido.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAfPrimerApellido(String value) {
        this.afPrimerApellido = value;
    }

    /**
     * Obtiene el valor de la propiedad afPrimerNombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAfPrimerNombre() {
        return afPrimerNombre;
    }

    /**
     * Define el valor de la propiedad afPrimerNombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAfPrimerNombre(String value) {
        this.afPrimerNombre = value;
    }

    /**
     * Obtiene el valor de la propiedad afSector.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAfSector() {
        return afSector;
    }

    /**
     * Define el valor de la propiedad afSector.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAfSector(String value) {
        this.afSector = value;
    }

    /**
     * Obtiene el valor de la propiedad afSegundoApellido.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAfSegundoApellido() {
        return afSegundoApellido;
    }

    /**
     * Define el valor de la propiedad afSegundoApellido.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAfSegundoApellido(String value) {
        this.afSegundoApellido = value;
    }

    /**
     * Obtiene el valor de la propiedad afSegundoNombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAfSegundoNombre() {
        return afSegundoNombre;
    }

    /**
     * Define el valor de la propiedad afSegundoNombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAfSegundoNombre(String value) {
        this.afSegundoNombre = value;
    }

    /**
     * Obtiene el valor de la propiedad afSexo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAfSexo() {
        return afSexo;
    }

    /**
     * Define el valor de la propiedad afSexo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAfSexo(String value) {
        this.afSexo = value;
    }

    /**
     * Obtiene el valor de la propiedad afTelefono.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAfTelefono() {
        return afTelefono;
    }

    /**
     * Define el valor de la propiedad afTelefono.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAfTelefono(String value) {
        this.afTelefono = value;
    }

    /**
     * Obtiene el valor de la propiedad afTipoDocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAfTipoDocumento() {
        return afTipoDocumento;
    }

    /**
     * Define el valor de la propiedad afTipoDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAfTipoDocumento(String value) {
        this.afTipoDocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad afZona.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAfZona() {
        return afZona;
    }

    /**
     * Define el valor de la propiedad afZona.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAfZona(String value) {
        this.afZona = value;
    }

    /**
     * Obtiene el valor de la propiedad dpDepartamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDpDepartamento() {
        return dpDepartamento;
    }

    /**
     * Define el valor de la propiedad dpDepartamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDpDepartamento(String value) {
        this.dpDepartamento = value;
    }

    /**
     * Obtiene el valor de la propiedad gpGrupoPoblacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGpGrupoPoblacion() {
        return gpGrupoPoblacion;
    }

    /**
     * Define el valor de la propiedad gpGrupoPoblacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGpGrupoPoblacion(String value) {
        this.gpGrupoPoblacion = value;
    }

    /**
     * Obtiene el valor de la propiedad gsGrupoSanguineo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGsGrupoSanguineo() {
        return gsGrupoSanguineo;
    }

    /**
     * Define el valor de la propiedad gsGrupoSanguineo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGsGrupoSanguineo(String value) {
        this.gsGrupoSanguineo = value;
    }

    /**
     * Obtiene el valor de la propiedad lcLocalidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLcLocalidad() {
        return lcLocalidad;
    }

    /**
     * Define el valor de la propiedad lcLocalidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLcLocalidad(String value) {
        this.lcLocalidad = value;
    }

    /**
     * Obtiene el valor de la propiedad muMunicipio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMuMunicipio() {
        return muMunicipio;
    }

    /**
     * Define el valor de la propiedad muMunicipio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMuMunicipio(String value) {
        this.muMunicipio = value;
    }

    /**
     * Obtiene el valor de la propiedad naNacionalidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNaNacionalidad() {
        return naNacionalidad;
    }

    /**
     * Define el valor de la propiedad naNacionalidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNaNacionalidad(String value) {
        this.naNacionalidad = value;
    }

}
