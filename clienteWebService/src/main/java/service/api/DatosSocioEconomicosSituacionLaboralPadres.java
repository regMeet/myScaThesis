
package service.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for datosSocioEconomicosSituacionLaboralPadres complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="datosSocioEconomicosSituacionLaboralPadres">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="datosDeTrabajoMadre" type="{http://api.service/}datosLaborales" minOccurs="0"/>
 *         &lt;element name="datosDeTrabajoPadre" type="{http://api.service/}datosLaborales" minOccurs="0"/>
 *         &lt;element name="nivelDeEstudiosMadre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nivelDeEstudiosPadre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="viveElPadre" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="viveLaMadre" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "datosSocioEconomicosSituacionLaboralPadres", propOrder = {
    "datosDeTrabajoMadre",
    "datosDeTrabajoPadre",
    "nivelDeEstudiosMadre",
    "nivelDeEstudiosPadre",
    "viveElPadre",
    "viveLaMadre"
})
public class DatosSocioEconomicosSituacionLaboralPadres {

    protected DatosLaborales datosDeTrabajoMadre;
    protected DatosLaborales datosDeTrabajoPadre;
    protected String nivelDeEstudiosMadre;
    protected String nivelDeEstudiosPadre;
    protected boolean viveElPadre;
    protected boolean viveLaMadre;

    /**
     * Gets the value of the datosDeTrabajoMadre property.
     * 
     * @return
     *     possible object is
     *     {@link DatosLaborales }
     *     
     */
    public DatosLaborales getDatosDeTrabajoMadre() {
        return datosDeTrabajoMadre;
    }

    /**
     * Sets the value of the datosDeTrabajoMadre property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosLaborales }
     *     
     */
    public void setDatosDeTrabajoMadre(DatosLaborales value) {
        this.datosDeTrabajoMadre = value;
    }

    /**
     * Gets the value of the datosDeTrabajoPadre property.
     * 
     * @return
     *     possible object is
     *     {@link DatosLaborales }
     *     
     */
    public DatosLaborales getDatosDeTrabajoPadre() {
        return datosDeTrabajoPadre;
    }

    /**
     * Sets the value of the datosDeTrabajoPadre property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosLaborales }
     *     
     */
    public void setDatosDeTrabajoPadre(DatosLaborales value) {
        this.datosDeTrabajoPadre = value;
    }

    /**
     * Gets the value of the nivelDeEstudiosMadre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNivelDeEstudiosMadre() {
        return nivelDeEstudiosMadre;
    }

    /**
     * Sets the value of the nivelDeEstudiosMadre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNivelDeEstudiosMadre(String value) {
        this.nivelDeEstudiosMadre = value;
    }

    /**
     * Gets the value of the nivelDeEstudiosPadre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNivelDeEstudiosPadre() {
        return nivelDeEstudiosPadre;
    }

    /**
     * Sets the value of the nivelDeEstudiosPadre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNivelDeEstudiosPadre(String value) {
        this.nivelDeEstudiosPadre = value;
    }

    /**
     * Gets the value of the viveElPadre property.
     * 
     */
    public boolean isViveElPadre() {
        return viveElPadre;
    }

    /**
     * Sets the value of the viveElPadre property.
     * 
     */
    public void setViveElPadre(boolean value) {
        this.viveElPadre = value;
    }

    /**
     * Gets the value of the viveLaMadre property.
     * 
     */
    public boolean isViveLaMadre() {
        return viveLaMadre;
    }

    /**
     * Sets the value of the viveLaMadre property.
     * 
     */
    public void setViveLaMadre(boolean value) {
        this.viveLaMadre = value;
    }

}
