
package service.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for datosSocioEconomicosSalud complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="datosSocioEconomicosSalud">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="coberturaDeSalud" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deportes" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="lugaresPractica" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="practicaDeporte" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "datosSocioEconomicosSalud", propOrder = {
    "coberturaDeSalud",
    "deportes",
    "lugaresPractica",
    "practicaDeporte"
})
public class DatosSocioEconomicosSalud {

    protected String coberturaDeSalud;
    @XmlElement(nillable = true)
    protected List<String> deportes;
    @XmlElement(nillable = true)
    protected List<String> lugaresPractica;
    protected boolean practicaDeporte;

    /**
     * Gets the value of the coberturaDeSalud property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoberturaDeSalud() {
        return coberturaDeSalud;
    }

    /**
     * Sets the value of the coberturaDeSalud property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoberturaDeSalud(String value) {
        this.coberturaDeSalud = value;
    }

    /**
     * Gets the value of the deportes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deportes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeportes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDeportes() {
        if (deportes == null) {
            deportes = new ArrayList<String>();
        }
        return this.deportes;
    }

    /**
     * Gets the value of the lugaresPractica property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lugaresPractica property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLugaresPractica().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLugaresPractica() {
        if (lugaresPractica == null) {
            lugaresPractica = new ArrayList<String>();
        }
        return this.lugaresPractica;
    }

    /**
     * Gets the value of the practicaDeporte property.
     * 
     */
    public boolean isPracticaDeporte() {
        return practicaDeporte;
    }

    /**
     * Sets the value of the practicaDeporte property.
     * 
     */
    public void setPracticaDeporte(boolean value) {
        this.practicaDeporte = value;
    }

}
