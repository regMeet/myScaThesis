
package service.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for datosPersonales complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="datosPersonales">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="datosCondicionAcademica" type="{http://api.service/}datosCondicionAcademica" minOccurs="0"/>
 *         &lt;element name="datosDomicilio" type="{http://api.service/}datosDomicilio" minOccurs="0"/>
 *         &lt;element name="datosExtranjeros" type="{http://api.service/}datosExtranjeros" minOccurs="0"/>
 *         &lt;element name="datosFamiliares" type="{http://api.service/}datosFamiliares" minOccurs="0"/>
 *         &lt;element name="datosFormacion" type="{http://api.service/}datosFormacion" minOccurs="0"/>
 *         &lt;element name="datosPrincipales" type="{http://api.service/}datosPrincipales" minOccurs="0"/>
 *         &lt;element name="datosSocioEconomicos" type="{http://api.service/}datosSocioEconomicos" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "datosPersonales", propOrder = {
    "datosCondicionAcademica",
    "datosDomicilio",
    "datosExtranjeros",
    "datosFamiliares",
    "datosFormacion",
    "datosPrincipales",
    "datosSocioEconomicos"
})
public class DatosPersonales {

    protected DatosCondicionAcademica datosCondicionAcademica;
    protected DatosDomicilio datosDomicilio;
    protected DatosExtranjeros datosExtranjeros;
    protected DatosFamiliares datosFamiliares;
    protected DatosFormacion datosFormacion;
    protected DatosPrincipales datosPrincipales;
    protected DatosSocioEconomicos datosSocioEconomicos;

    /**
     * Gets the value of the datosCondicionAcademica property.
     * 
     * @return
     *     possible object is
     *     {@link DatosCondicionAcademica }
     *     
     */
    public DatosCondicionAcademica getDatosCondicionAcademica() {
        return datosCondicionAcademica;
    }

    /**
     * Sets the value of the datosCondicionAcademica property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosCondicionAcademica }
     *     
     */
    public void setDatosCondicionAcademica(DatosCondicionAcademica value) {
        this.datosCondicionAcademica = value;
    }

    /**
     * Gets the value of the datosDomicilio property.
     * 
     * @return
     *     possible object is
     *     {@link DatosDomicilio }
     *     
     */
    public DatosDomicilio getDatosDomicilio() {
        return datosDomicilio;
    }

    /**
     * Sets the value of the datosDomicilio property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosDomicilio }
     *     
     */
    public void setDatosDomicilio(DatosDomicilio value) {
        this.datosDomicilio = value;
    }

    /**
     * Gets the value of the datosExtranjeros property.
     * 
     * @return
     *     possible object is
     *     {@link DatosExtranjeros }
     *     
     */
    public DatosExtranjeros getDatosExtranjeros() {
        return datosExtranjeros;
    }

    /**
     * Sets the value of the datosExtranjeros property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosExtranjeros }
     *     
     */
    public void setDatosExtranjeros(DatosExtranjeros value) {
        this.datosExtranjeros = value;
    }

    /**
     * Gets the value of the datosFamiliares property.
     * 
     * @return
     *     possible object is
     *     {@link DatosFamiliares }
     *     
     */
    public DatosFamiliares getDatosFamiliares() {
        return datosFamiliares;
    }

    /**
     * Sets the value of the datosFamiliares property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosFamiliares }
     *     
     */
    public void setDatosFamiliares(DatosFamiliares value) {
        this.datosFamiliares = value;
    }

    /**
     * Gets the value of the datosFormacion property.
     * 
     * @return
     *     possible object is
     *     {@link DatosFormacion }
     *     
     */
    public DatosFormacion getDatosFormacion() {
        return datosFormacion;
    }

    /**
     * Sets the value of the datosFormacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosFormacion }
     *     
     */
    public void setDatosFormacion(DatosFormacion value) {
        this.datosFormacion = value;
    }

    /**
     * Gets the value of the datosPrincipales property.
     * 
     * @return
     *     possible object is
     *     {@link DatosPrincipales }
     *     
     */
    public DatosPrincipales getDatosPrincipales() {
        return datosPrincipales;
    }

    /**
     * Sets the value of the datosPrincipales property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosPrincipales }
     *     
     */
    public void setDatosPrincipales(DatosPrincipales value) {
        this.datosPrincipales = value;
    }

    /**
     * Gets the value of the datosSocioEconomicos property.
     * 
     * @return
     *     possible object is
     *     {@link DatosSocioEconomicos }
     *     
     */
    public DatosSocioEconomicos getDatosSocioEconomicos() {
        return datosSocioEconomicos;
    }

    /**
     * Sets the value of the datosSocioEconomicos property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosSocioEconomicos }
     *     
     */
    public void setDatosSocioEconomicos(DatosSocioEconomicos value) {
        this.datosSocioEconomicos = value;
    }

}
