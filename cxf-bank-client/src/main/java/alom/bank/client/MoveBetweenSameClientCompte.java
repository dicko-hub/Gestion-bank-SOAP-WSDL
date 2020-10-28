
package alom.bank.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for moveBetweenSameClientCompte complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="moveBetweenSameClientCompte"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="client" type="{http://front.server.bank.alom/}client" minOccurs="0"/&gt;
 *         &lt;element name="compteTypePlus" type="{http://front.server.bank.alom/}compteType" minOccurs="0"/&gt;
 *         &lt;element name="compteTypeMoins" type="{http://front.server.bank.alom/}compteType" minOccurs="0"/&gt;
 *         &lt;element name="montant" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "moveBetweenSameClientCompte", propOrder = {
    "client",
    "compteTypePlus",
    "compteTypeMoins",
    "montant"
})
public class MoveBetweenSameClientCompte {

    protected Client client;
    @XmlSchemaType(name = "string")
    protected CompteType compteTypePlus;
    @XmlSchemaType(name = "string")
    protected CompteType compteTypeMoins;
    protected int montant;

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
     * Gets the value of the compteTypePlus property.
     * 
     * @return
     *     possible object is
     *     {@link CompteType }
     *     
     */
    public CompteType getCompteTypePlus() {
        return compteTypePlus;
    }

    /**
     * Sets the value of the compteTypePlus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompteType }
     *     
     */
    public void setCompteTypePlus(CompteType value) {
        this.compteTypePlus = value;
    }

    /**
     * Gets the value of the compteTypeMoins property.
     * 
     * @return
     *     possible object is
     *     {@link CompteType }
     *     
     */
    public CompteType getCompteTypeMoins() {
        return compteTypeMoins;
    }

    /**
     * Sets the value of the compteTypeMoins property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompteType }
     *     
     */
    public void setCompteTypeMoins(CompteType value) {
        this.compteTypeMoins = value;
    }

    /**
     * Gets the value of the montant property.
     * 
     */
    public int getMontant() {
        return montant;
    }

    /**
     * Sets the value of the montant property.
     * 
     */
    public void setMontant(int value) {
        this.montant = value;
    }

}
