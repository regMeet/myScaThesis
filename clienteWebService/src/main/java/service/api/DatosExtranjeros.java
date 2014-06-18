
package service.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for datosExtranjeros complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="datosExtranjeros">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fechaDeOtorgamientoDeLaResidencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaDeVencimientoDeLaResidencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaIngresoAlPais" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaOtorgamientoVisa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaVencimientoVisa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoDeResidencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "datosExtranjeros", propOrder = {
    "fechaDeOtorgamientoDeLaResidencia",
    "fechaDeVencimientoDeLaResidencia",
    "fechaIngresoAlPais",
    "fechaOtorgamientoVisa",
    "fechaVencimientoVisa",
    "tipoDeResidencia"
})
public class DatosExtranjeros {

    protected String fechaDeOtorgamientoDeLaResidencia;
    protected String fechaDeVencimientoDeLaResidencia;
    protected String fechaIngresoAlPais;
    protected String fechaOtorgamientoVisa;
    protected String fechaVencimientoVisa;
    protected String tipoDeResidencia;

    /**
     * Gets the value of the fechaDeOtorgamientoDeLaResidencia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaDeOtorgamientoDeLaResidencia() {
        return fechaDeOtorgamientoDeLaResidencia;
    }

    /**
     * Sets the value of the fechaDeOtorgamientoDeLaResidencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaDeOtorgamientoDeLaResidencia(String value) {
        this.fechaDeOtorgamientoDeLaResidencia = value;
    }

    /**
     * Gets the value of the fechaDeVencimientoDeLaResidencia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaDeVencimientoDeLaResidencia() {
        return fechaDeVencimientoDeLaResidencia;
    }

    /**
     * Sets the value of the fechaDeVencimientoDeLaResidencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaDeVencimientoDeLaResidencia(String value) {
        this.fechaDeVencimientoDeLaResidencia = value;
    }

    /**
     * Gets the value of the fechaIngresoAlPais property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaIngresoAlPais() {
        return fechaIngresoAlPais;
    }

    /**
     * Sets the value of the fechaIngresoAlPais property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaIngresoAlPais(String value) {
        this.fechaIngresoAlPais = value;
    }

    /**
     * Gets the value of the fechaOtorgamientoVisa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaOtorgamientoVisa() {
        return fechaOtorgamientoVisa;
    }

    /**
     * Sets the value of the fechaOtorgamientoVisa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaOtorgamientoVisa(String value) {
        this.fechaOtorgamientoVisa = value;
    }

    /**
     * Gets the value of the fechaVencimientoVisa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaVencimientoVisa() {
        return fechaVencimientoVisa;
    }

    /**
     * Sets the value of the fechaVencimientoVisa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaVencimientoVisa(String value) {
        this.fechaVencimientoVisa = value;
    }

    /**
     * Gets the value of the tipoDeResidencia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDeResidencia() {
        return tipoDeResidencia;
    }

    /**
     * Sets the value of the tipoDeResidencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDeResidencia(String value) {
        this.tipoDeResidencia = value;
    }

}
