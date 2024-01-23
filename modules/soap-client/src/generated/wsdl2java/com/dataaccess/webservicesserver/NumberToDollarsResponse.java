
package com.dataaccess.webservicesserver;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NumberToDollarsResult" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "numberToDollarsResult"
})
@XmlRootElement(name = "NumberToDollarsResponse")
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.4")
public class NumberToDollarsResponse {

    @XmlElement(name = "NumberToDollarsResult", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.4")
    protected String numberToDollarsResult;

    /**
     * Obtient la valeur de la propri�t� numberToDollarsResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.4")
    public String getNumberToDollarsResult() {
        return numberToDollarsResult;
    }

    /**
     * D�finit la valeur de la propri�t� numberToDollarsResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.4")
    public void setNumberToDollarsResult(String value) {
        this.numberToDollarsResult = value;
    }

}
