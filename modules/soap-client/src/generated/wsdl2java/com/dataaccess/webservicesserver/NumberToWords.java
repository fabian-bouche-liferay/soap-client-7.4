
package com.dataaccess.webservicesserver;

import java.math.BigInteger;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="ubiNum" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/&gt;
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
    "ubiNum"
})
@XmlRootElement(name = "NumberToWords")
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.4")
public class NumberToWords {

    @XmlElement(required = true)
    @XmlSchemaType(name = "unsignedLong")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.4")
    protected BigInteger ubiNum;

    /**
     * Obtient la valeur de la propri�t� ubiNum.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.4")
    public BigInteger getUbiNum() {
        return ubiNum;
    }

    /**
     * D�finit la valeur de la propri�t� ubiNum.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.4")
    public void setUbiNum(BigInteger value) {
        this.ubiNum = value;
    }

}
