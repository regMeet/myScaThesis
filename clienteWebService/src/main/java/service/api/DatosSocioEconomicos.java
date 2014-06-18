
package service.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for datosSocioEconomicos complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="datosSocioEconomicos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="datosSocioEconomicosGenerales" type="{http://api.service/}datosSocioEconomicosGenerales" minOccurs="0"/>
 *         &lt;element name="datosSocioEconomicosSalud" type="{http://api.service/}datosSocioEconomicosSalud" minOccurs="0"/>
 *         &lt;element name="datosSocioEconomicosSituacionLaboralPadres" type="{http://api.service/}datosSocioEconomicosSituacionLaboralPadres" minOccurs="0"/>
 *         &lt;element name="datosSocioEconomicosSituacionLaboralPersonal" type="{http://api.service/}datosSocioEconomicosSituacionLaboralPersonal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "datosSocioEconomicos", propOrder = {
    "datosSocioEconomicosGenerales",
    "datosSocioEconomicosSalud",
    "datosSocioEconomicosSituacionLaboralPadres",
    "datosSocioEconomicosSituacionLaboralPersonal"
})
public class DatosSocioEconomicos {

    protected DatosSocioEconomicosGenerales datosSocioEconomicosGenerales;
    protected DatosSocioEconomicosSalud datosSocioEconomicosSalud;
    protected DatosSocioEconomicosSituacionLaboralPadres datosSocioEconomicosSituacionLaboralPadres;
    protected DatosSocioEconomicosSituacionLaboralPersonal datosSocioEconomicosSituacionLaboralPersonal;

    /**
     * Gets the value of the datosSocioEconomicosGenerales property.
     * 
     * @return
     *     possible object is
     *     {@link DatosSocioEconomicosGenerales }
     *     
     */
    public DatosSocioEconomicosGenerales getDatosSocioEconomicosGenerales() {
        return datosSocioEconomicosGenerales;
    }

    /**
     * Sets the value of the datosSocioEconomicosGenerales property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosSocioEconomicosGenerales }
     *     
     */
    public void setDatosSocioEconomicosGenerales(DatosSocioEconomicosGenerales value) {
        this.datosSocioEconomicosGenerales = value;
    }

    /**
     * Gets the value of the datosSocioEconomicosSalud property.
     * 
     * @return
     *     possible object is
     *     {@link DatosSocioEconomicosSalud }
     *     
     */
    public DatosSocioEconomicosSalud getDatosSocioEconomicosSalud() {
        return datosSocioEconomicosSalud;
    }

    /**
     * Sets the value of the datosSocioEconomicosSalud property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosSocioEconomicosSalud }
     *     
     */
    public void setDatosSocioEconomicosSalud(DatosSocioEconomicosSalud value) {
        this.datosSocioEconomicosSalud = value;
    }

    /**
     * Gets the value of the datosSocioEconomicosSituacionLaboralPadres property.
     * 
     * @return
     *     possible object is
     *     {@link DatosSocioEconomicosSituacionLaboralPadres }
     *     
     */
    public DatosSocioEconomicosSituacionLaboralPadres getDatosSocioEconomicosSituacionLaboralPadres() {
        return datosSocioEconomicosSituacionLaboralPadres;
    }

    /**
     * Sets the value of the datosSocioEconomicosSituacionLaboralPadres property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosSocioEconomicosSituacionLaboralPadres }
     *     
     */
    public void setDatosSocioEconomicosSituacionLaboralPadres(DatosSocioEconomicosSituacionLaboralPadres value) {
        this.datosSocioEconomicosSituacionLaboralPadres = value;
    }

    /**
     * Gets the value of the datosSocioEconomicosSituacionLaboralPersonal property.
     * 
     * @return
     *     possible object is
     *     {@link DatosSocioEconomicosSituacionLaboralPersonal }
     *     
     */
    public DatosSocioEconomicosSituacionLaboralPersonal getDatosSocioEconomicosSituacionLaboralPersonal() {
        return datosSocioEconomicosSituacionLaboralPersonal;
    }

    /**
     * Sets the value of the datosSocioEconomicosSituacionLaboralPersonal property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosSocioEconomicosSituacionLaboralPersonal }
     *     
     */
    public void setDatosSocioEconomicosSituacionLaboralPersonal(DatosSocioEconomicosSituacionLaboralPersonal value) {
        this.datosSocioEconomicosSituacionLaboralPersonal = value;
    }

}
