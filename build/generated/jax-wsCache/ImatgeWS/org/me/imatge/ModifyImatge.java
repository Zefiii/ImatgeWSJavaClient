
package org.me.imatge;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para modifyImatge complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="modifyImatge">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="imatge" type="{http://imatge.me.org/}imatge" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "modifyImatge", propOrder = {
    "imatge"
})
public class ModifyImatge {

    protected Imatge imatge;

    /**
     * Obtiene el valor de la propiedad imatge.
     * 
     * @return
     *     possible object is
     *     {@link Imatge }
     *     
     */
    public Imatge getImatge() {
        return imatge;
    }

    /**
     * Define el valor de la propiedad imatge.
     * 
     * @param value
     *     allowed object is
     *     {@link Imatge }
     *     
     */
    public void setImatge(Imatge value) {
        this.imatge = value;
    }

}
