
package service.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for carrera complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="carrera">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="activo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoCarrera" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="egresado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaUltimoExamen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombreCarrera" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ultimaReincripcion" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "carrera", propOrder = {
    "activo",
    "codigoCarrera",
    "egresado",
    "fechaUltimoExamen",
    "nombreCarrera",
    "ultimaReincripcion"
})
public class Carrera {

    protected String activo;
    protected String codigoCarrera;
    protected String egresado;
    protected String fechaUltimoExamen;
    protected String nombreCarrera;
    protected int ultimaReincripcion;

    /**
     * Gets the value of the activo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivo() {
        return activo;
    }

    /**
     * Sets the value of the activo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivo(String value) {
        this.activo = value;
    }

    /**
     * Gets the value of the codigoCarrera property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoCarrera() {
        return codigoCarrera;
    }

    /**
     * Sets the value of the codigoCarrera property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoCarrera(String value) {
        this.codigoCarrera = value;
    }

    /**
     * Gets the value of the egresado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEgresado() {
        return egresado;
    }

    /**
     * Sets the value of the egresado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEgresado(String value) {
        this.egresado = value;
    }

    /**
     * Gets the value of the fechaUltimoExamen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaUltimoExamen() {
        return fechaUltimoExamen;
    }

    /**
     * Sets the value of the fechaUltimoExamen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaUltimoExamen(String value) {
        this.fechaUltimoExamen = value;
    }

    /**
     * Gets the value of the nombreCarrera property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreCarrera() {
        return nombreCarrera;
    }

    /**
     * Sets the value of the nombreCarrera property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreCarrera(String value) {
        this.nombreCarrera = value;
    }

    /**
     * Gets the value of the ultimaReincripcion property.
     * 
     */
    public int getUltimaReincripcion() {
        return ultimaReincripcion;
    }

    /**
     * Sets the value of the ultimaReincripcion property.
     * 
     */
    public void setUltimaReincripcion(int value) {
        this.ultimaReincripcion = value;
    }

}
