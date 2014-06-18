
package service.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for datosCondicionAcademica complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="datosCondicionAcademica">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="carreras" type="{http://api.service/}carrera" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "datosCondicionAcademica", propOrder = {
    "carreras"
})
public class DatosCondicionAcademica {

    @XmlElement(nillable = true)
    protected List<Carrera> carreras;

    /**
     * Gets the value of the carreras property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the carreras property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCarreras().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Carrera }
     * 
     * 
     */
    public List<Carrera> getCarreras() {
        if (carreras == null) {
            carreras = new ArrayList<Carrera>();
        }
        return this.carreras;
    }

}
