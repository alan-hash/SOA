
package wssoap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para baja complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="baja">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sqlconsultaalta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "baja", propOrder = {
    "sqlconsultaalta"
})
public class Baja {

    protected String sqlconsultaalta;

    /**
     * Obtiene el valor de la propiedad sqlconsultaalta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSqlconsultaalta() {
        return sqlconsultaalta;
    }

    /**
     * Define el valor de la propiedad sqlconsultaalta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSqlconsultaalta(String value) {
        this.sqlconsultaalta = value;
    }

}
