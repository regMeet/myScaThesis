
package service.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for datosFormacion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="datosFormacion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="datosFormacionSecundaria" type="{http://api.service/}datosFormacionSecundaria" minOccurs="0"/>
 *         &lt;element name="datosFormacionSuperior" type="{http://api.service/}datosFormacionSuperior" minOccurs="0"/>
 *         &lt;element name="idiomas" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "datosFormacion", propOrder = {
    "datosFormacionSecundaria",
    "datosFormacionSuperior",
    "idiomas"
})
public class DatosFormacion {

    protected DatosFormacionSecundaria datosFormacionSecundaria;
    protected DatosFormacionSuperior datosFormacionSuperior;
    @XmlElement(nillable = true)
    protected List<String> idiomas;

    /**
     * Gets the value of the datosFormacionSecundaria property.
     * 
     * @return
     *     possible object is
     *     {@link DatosFormacionSecundaria }
     *     
     */
    public DatosFormacionSecundaria getDatosFormacionSecundaria() {
        return datosFormacionSecundaria;
    }

    /**
     * Sets the value of the datosFormacionSecundaria property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosFormacionSecundaria }
     *     
     */
    public void setDatosFormacionSecundaria(DatosFormacionSecundaria value) {
        this.datosFormacionSecundaria = value;
    }

    /**
     * Gets the value of the datosFormacionSuperior property.
     * 
     * @return
     *     possible object is
     *     {@link DatosFormacionSuperior }
     *     
     */
    public DatosFormacionSuperior getDatosFormacionSuperior() {
        return datosFormacionSuperior;
    }

    /**
     * Sets the value of the datosFormacionSuperior property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosFormacionSuperior }
     *     
     */
    public void setDatosFormacionSuperior(DatosFormacionSuperior value) {
        this.datosFormacionSuperior = value;
    }

    /**
     * Gets the value of the idiomas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the idiomas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdiomas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getIdiomas() {
        if (idiomas == null) {
            idiomas = new ArrayList<String>();
        }
        return this.idiomas;
    }

}
