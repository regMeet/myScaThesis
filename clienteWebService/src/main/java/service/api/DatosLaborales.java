
package service.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for datosLaborales complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="datosLaborales">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="actividadEconomica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="categoriaOcupacional" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="detalleRamaActividadEconomica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="situacionLaboral" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "datosLaborales", propOrder = {
    "actividadEconomica",
    "categoriaOcupacional",
    "detalleRamaActividadEconomica",
    "situacionLaboral"
})
public class DatosLaborales {

    protected String actividadEconomica;
    protected String categoriaOcupacional;
    protected String detalleRamaActividadEconomica;
    protected String situacionLaboral;

    /**
     * Gets the value of the actividadEconomica property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActividadEconomica() {
        return actividadEconomica;
    }

    /**
     * Sets the value of the actividadEconomica property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActividadEconomica(String value) {
        this.actividadEconomica = value;
    }

    /**
     * Gets the value of the categoriaOcupacional property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoriaOcupacional() {
        return categoriaOcupacional;
    }

    /**
     * Sets the value of the categoriaOcupacional property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoriaOcupacional(String value) {
        this.categoriaOcupacional = value;
    }

    /**
     * Gets the value of the detalleRamaActividadEconomica property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetalleRamaActividadEconomica() {
        return detalleRamaActividadEconomica;
    }

    /**
     * Sets the value of the detalleRamaActividadEconomica property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetalleRamaActividadEconomica(String value) {
        this.detalleRamaActividadEconomica = value;
    }

    /**
     * Gets the value of the situacionLaboral property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSituacionLaboral() {
        return situacionLaboral;
    }

    /**
     * Sets the value of the situacionLaboral property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSituacionLaboral(String value) {
        this.situacionLaboral = value;
    }

}
