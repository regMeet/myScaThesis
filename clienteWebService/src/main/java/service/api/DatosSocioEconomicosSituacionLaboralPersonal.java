
package service.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for datosSocioEconomicosSituacionLaboralPersonal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="datosSocioEconomicosSituacionLaboralPersonal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="datosDeTrabajo" type="{http://api.service/}datosLaborales" minOccurs="0"/>
 *         &lt;element name="descuentoJubilatorios" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="empresaFamiliar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="horasSemanales" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="remuneracion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tareaQueRealiza" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trabajoQueHaceElAlumno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "datosSocioEconomicosSituacionLaboralPersonal", propOrder = {
    "datosDeTrabajo",
    "descuentoJubilatorios",
    "empresaFamiliar",
    "horasSemanales",
    "remuneracion",
    "tareaQueRealiza",
    "trabajoQueHaceElAlumno"
})
public class DatosSocioEconomicosSituacionLaboralPersonal {

    protected DatosLaborales datosDeTrabajo;
    protected String descuentoJubilatorios;
    protected String empresaFamiliar;
    protected String horasSemanales;
    protected String remuneracion;
    protected String tareaQueRealiza;
    protected String trabajoQueHaceElAlumno;

    /**
     * Gets the value of the datosDeTrabajo property.
     * 
     * @return
     *     possible object is
     *     {@link DatosLaborales }
     *     
     */
    public DatosLaborales getDatosDeTrabajo() {
        return datosDeTrabajo;
    }

    /**
     * Sets the value of the datosDeTrabajo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosLaborales }
     *     
     */
    public void setDatosDeTrabajo(DatosLaborales value) {
        this.datosDeTrabajo = value;
    }

    /**
     * Gets the value of the descuentoJubilatorios property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescuentoJubilatorios() {
        return descuentoJubilatorios;
    }

    /**
     * Sets the value of the descuentoJubilatorios property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescuentoJubilatorios(String value) {
        this.descuentoJubilatorios = value;
    }

    /**
     * Gets the value of the empresaFamiliar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmpresaFamiliar() {
        return empresaFamiliar;
    }

    /**
     * Sets the value of the empresaFamiliar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmpresaFamiliar(String value) {
        this.empresaFamiliar = value;
    }

    /**
     * Gets the value of the horasSemanales property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHorasSemanales() {
        return horasSemanales;
    }

    /**
     * Sets the value of the horasSemanales property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHorasSemanales(String value) {
        this.horasSemanales = value;
    }

    /**
     * Gets the value of the remuneracion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemuneracion() {
        return remuneracion;
    }

    /**
     * Sets the value of the remuneracion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemuneracion(String value) {
        this.remuneracion = value;
    }

    /**
     * Gets the value of the tareaQueRealiza property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTareaQueRealiza() {
        return tareaQueRealiza;
    }

    /**
     * Sets the value of the tareaQueRealiza property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTareaQueRealiza(String value) {
        this.tareaQueRealiza = value;
    }

    /**
     * Gets the value of the trabajoQueHaceElAlumno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrabajoQueHaceElAlumno() {
        return trabajoQueHaceElAlumno;
    }

    /**
     * Sets the value of the trabajoQueHaceElAlumno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrabajoQueHaceElAlumno(String value) {
        this.trabajoQueHaceElAlumno = value;
    }

}
