
package service.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for datosFamiliares complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="datosFamiliares">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cantidadDeHijos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cantidadDeHijosACargo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="conQuienVive" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estadoCivil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "datosFamiliares", propOrder = {
    "cantidadDeHijos",
    "cantidadDeHijosACargo",
    "conQuienVive",
    "estadoCivil"
})
public class DatosFamiliares {

    protected String cantidadDeHijos;
    protected String cantidadDeHijosACargo;
    protected String conQuienVive;
    protected String estadoCivil;

    /**
     * Gets the value of the cantidadDeHijos property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCantidadDeHijos() {
        return cantidadDeHijos;
    }

    /**
     * Sets the value of the cantidadDeHijos property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCantidadDeHijos(String value) {
        this.cantidadDeHijos = value;
    }

    /**
     * Gets the value of the cantidadDeHijosACargo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCantidadDeHijosACargo() {
        return cantidadDeHijosACargo;
    }

    /**
     * Sets the value of the cantidadDeHijosACargo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCantidadDeHijosACargo(String value) {
        this.cantidadDeHijosACargo = value;
    }

    /**
     * Gets the value of the conQuienVive property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConQuienVive() {
        return conQuienVive;
    }

    /**
     * Sets the value of the conQuienVive property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConQuienVive(String value) {
        this.conQuienVive = value;
    }

    /**
     * Gets the value of the estadoCivil property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoCivil() {
        return estadoCivil;
    }

    /**
     * Sets the value of the estadoCivil property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoCivil(String value) {
        this.estadoCivil = value;
    }

}
