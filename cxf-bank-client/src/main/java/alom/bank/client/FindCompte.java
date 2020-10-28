
package alom.bank.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for findCompte complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="findCompte"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="client" type="{http://front.server.bank.alom/}client" minOccurs="0"/&gt;
 *         &lt;element name="compteType" type="{http://front.server.bank.alom/}compteType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findCompte", propOrder = {
    "client",
    "compteType"
})
public class FindCompte {

    protected Client client;
    @XmlSchemaType(name = "string")
    protected CompteType compteType;

    /**
     * Gets the value of the client property.
     * 
     * @return
     *     possible object is
     *     {@link Client }
     *     
     */
    public Client getClient() {
        return client;
    }

    /**
     * Sets the value of the client property.
     * 
     * @param value
     *     allowed object is
     *     {@link Client }
     *     
     */
    public void setClient(Client value) {
        this.client = value;
    }

    /**
     * Gets the value of the compteType property.
     * 
     * @return
     *     possible object is
     *     {@link CompteType }
     *     
     */
    public CompteType getCompteType() {
        return compteType;
    }

    /**
     * Sets the value of the compteType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompteType }
     *     
     */
    public void setCompteType(CompteType value) {
        this.compteType = value;
    }

}
