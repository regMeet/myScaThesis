
package service.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for datosFormacionSecundaria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="datosFormacionSecundaria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="anioEgresoSecundario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoColegioSecundario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoTituloSecundario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombreColegioSecundario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombreTituloSecundario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orientacionVocacionalRecibida" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "datosFormacionSecundaria", propOrder = {
    "anioEgresoSecundario",
    "codigoColegioSecundario",
    "codigoTituloSecundario",
    "nombreColegioSecundario",
    "nombreTituloSecundario",
    "orientacionVocacionalRecibida"
})
public class DatosFormacionSecundaria {

    protected String anioEgresoSecundario;
    protected String codigoColegioSecundario;
    protected String codigoTituloSecundario;
    protected String nombreColegioSecundario;
    protected String nombreTituloSecundario;
    protected String orientacionVocacionalRecibida;

    /**
     * Gets the value of the anioEgresoSecundario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnioEgresoSecundario() {
        return anioEgresoSecundario;
    }

    /**
     * Sets the value of the anioEgresoSecundario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnioEgresoSecundario(String value) {
        this.anioEgresoSecundario = value;
    }

    /**
     * Gets the value of the codigoColegioSecundario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoColegioSecundario() {
        return codigoColegioSecundario;
    }

    /**
     * Sets the value of the codigoColegioSecundario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoColegioSecundario(String value) {
        this.codigoColegioSecundario = value;
    }

    /**
     * Gets the value of the codigoTituloSecundario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoTituloSecundario() {
        return codigoTituloSecundario;
    }

    /**
     * Sets the value of the codigoTituloSecundario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoTituloSecundario(String value) {
        this.codigoTituloSecundario = value;
    }

    /**
     * Gets the value of the nombreColegioSecundario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreColegioSecundario() {
        return nombreColegioSecundario;
    }

    /**
     * Sets the value of the nombreColegioSecundario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreColegioSecundario(String value) {
        this.nombreColegioSecundario = value;
    }

    /**
     * Gets the value of the nombreTituloSecundario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreTituloSecundario() {
        return nombreTituloSecundario;
    }

    /**
     * Sets the value of the nombreTituloSecundario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreTituloSecundario(String value) {
        this.nombreTituloSecundario = value;
    }

    /**
     * Gets the value of the orientacionVocacionalRecibida property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrientacionVocacionalRecibida() {
        return orientacionVocacionalRecibida;
    }

    /**
     * Sets the value of the orientacionVocacionalRecibida property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrientacionVocacionalRecibida(String value) {
        this.orientacionVocacionalRecibida = value;
    }

}
