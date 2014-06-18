
package service.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for datosSocioEconomicosGenerales complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="datosSocioEconomicosGenerales">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accesoInternet" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="disponibilidadPC" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="regularidadAccesoInternet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="usoInternet" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "datosSocioEconomicosGenerales", propOrder = {
    "accesoInternet",
    "disponibilidadPC",
    "regularidadAccesoInternet",
    "usoInternet"
})
public class DatosSocioEconomicosGenerales {

    @XmlElement(nillable = true)
    protected List<String> accesoInternet;
    @XmlElement(nillable = true)
    protected List<String> disponibilidadPC;
    protected String regularidadAccesoInternet;
    @XmlElement(nillable = true)
    protected List<String> usoInternet;

    /**
     * Gets the value of the accesoInternet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accesoInternet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccesoInternet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAccesoInternet() {
        if (accesoInternet == null) {
            accesoInternet = new ArrayList<String>();
        }
        return this.accesoInternet;
    }

    /**
     * Gets the value of the disponibilidadPC property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the disponibilidadPC property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisponibilidadPC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDisponibilidadPC() {
        if (disponibilidadPC == null) {
            disponibilidadPC = new ArrayList<String>();
        }
        return this.disponibilidadPC;
    }

    /**
     * Gets the value of the regularidadAccesoInternet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegularidadAccesoInternet() {
        return regularidadAccesoInternet;
    }

    /**
     * Sets the value of the regularidadAccesoInternet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegularidadAccesoInternet(String value) {
        this.regularidadAccesoInternet = value;
    }

    /**
     * Gets the value of the usoInternet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the usoInternet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUsoInternet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getUsoInternet() {
        if (usoInternet == null) {
            usoInternet = new ArrayList<String>();
        }
        return this.usoInternet;
    }

}
