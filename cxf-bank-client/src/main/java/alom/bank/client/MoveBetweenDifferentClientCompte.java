
package alom.bank.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for moveBetweenDifferentClientCompte complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="moveBetweenDifferentClientCompte"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="clientPlus" type="{http://front.server.bank.alom/}client" minOccurs="0"/&gt;
 *         &lt;element name="comptePlus" type="{http://front.server.bank.alom/}compte" minOccurs="0"/&gt;
 *         &lt;element name="clientMoins" type="{http://front.server.bank.alom/}client" minOccurs="0"/&gt;
 *         &lt;element name="compteMoins" type="{http://front.server.bank.alom/}compte" minOccurs="0"/&gt;
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
@XmlType(name = "moveBetweenDifferentClientCompte", propOrder = {
    "clientPlus",
    "comptePlus",
    "clientMoins",
    "compteMoins",
    "montant"
})
public class MoveBetweenDifferentClientCompte {

    protected Client clientPlus;
    protected Compte comptePlus;
    protected Client clientMoins;
    protected Compte compteMoins;
    protected int montant;

    /**
     * Gets the value of the clientPlus property.
     * 
     * @return
     *     possible object is
     *     {@link Client }
     *     
     */
    public Client getClientPlus() {
        return clientPlus;
    }

    /**
     * Sets the value of the clientPlus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Client }
     *     
     */
    public void setClientPlus(Client value) {
        this.clientPlus = value;
    }

    /**
     * Gets the value of the comptePlus property.
     * 
     * @return
     *     possible object is
     *     {@link Compte }
     *     
     */
    public Compte getComptePlus() {
        return comptePlus;
    }

    /**
     * Sets the value of the comptePlus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Compte }
     *     
     */
    public void setComptePlus(Compte value) {
        this.comptePlus = value;
    }

    /**
     * Gets the value of the clientMoins property.
     * 
     * @return
     *     possible object is
     *     {@link Client }
     *     
     */
    public Client getClientMoins() {
        return clientMoins;
    }

    /**
     * Sets the value of the clientMoins property.
     * 
     * @param value
     *     allowed object is
     *     {@link Client }
     *     
     */
    public void setClientMoins(Client value) {
        this.clientMoins = value;
    }

    /**
     * Gets the value of the compteMoins property.
     * 
     * @return
     *     possible object is
     *     {@link Compte }
     *     
     */
    public Compte getCompteMoins() {
        return compteMoins;
    }

    /**
     * Sets the value of the compteMoins property.
     * 
     * @param value
     *     allowed object is
     *     {@link Compte }
     *     
     */
    public void setCompteMoins(Compte value) {
        this.compteMoins = value;
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
