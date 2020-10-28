
package alom.bank.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for compteType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="compteType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CHEQUES"/&gt;
 *     &lt;enumeration value="LIVRET_A"/&gt;
 *     &lt;enumeration value="LIVRET_DEVELOPPEMENT_DURABLE"/&gt;
 *     &lt;enumeration value="LIVRET_JEUNE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "compteType")
@XmlEnum
public enum CompteType {

    CHEQUES,
    LIVRET_A,
    LIVRET_DEVELOPPEMENT_DURABLE,
    LIVRET_JEUNE;

    public String value() {
        return name();
    }

    public static CompteType fromValue(String v) {
        return valueOf(v);
    }

}
