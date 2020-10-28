
package alom.bank.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for compte complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="compte"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="client" type="{http://front.server.bank.alom/}client" minOccurs="0"/&gt;
 *         &lt;element name="close" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="solde" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="type" type="{http://front.server.bank.alom/}compteType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "compte", propOrder = {
    "client",
    "close",
    "solde",
    "type"
})
public class Compte {

    protected Client client;
    protected boolean close;
    protected int solde;
    @XmlSchemaType(name = "string")
    protected CompteType type;

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
     * Gets the value of the close property.
     * 
     */
    public boolean isClose() {
        return close;
    }

    /**
     * Sets the value of the close property.
     * 
     */
    public void setClose(boolean value) {
        this.close = value;
    }

    /**
     * Gets the value of the solde property.
     * 
     */
    public int getSolde() {
        return solde;
    }

    /**
     * Sets the value of the solde property.
     * 
     */
    public void setSolde(int value) {
        this.solde = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link CompteType }
     *     
     */
    public CompteType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompteType }
     *     
     */
    public void setType(CompteType value) {
        this.type = value;
    }

}
