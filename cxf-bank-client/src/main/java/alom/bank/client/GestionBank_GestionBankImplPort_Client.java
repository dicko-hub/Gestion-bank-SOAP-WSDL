
package alom.bank.client;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.3.7
 * 2020-10-08T17:08:06.281+02:00
 * Generated source version: 3.3.7
 *
 */
public final class GestionBank_GestionBankImplPort_Client {

    private static final QName SERVICE_NAME = new QName("http://front.server.bank.alom/", "GestionBankImplService");

    private GestionBank_GestionBankImplPort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = GestionBankImplService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) {
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }

        GestionBankImplService ss = new GestionBankImplService(wsdlURL, SERVICE_NAME);
        GestionBank port = ss.getGestionBankImplPort();

        {
        System.out.println("Invoking removeMoney...");
        alom.bank.client.Compte _removeMoney_compte = null;
        int _removeMoney_somme = 0;
        try {
            int _removeMoney__return = port.removeMoney(_removeMoney_compte, _removeMoney_somme);
            System.out.println("removeMoney.result=" + _removeMoney__return);

        } catch (IncorrectValueException_Exception e) {
            System.out.println("Expected exception: IncorrectValueException has occurred.");
            System.out.println(e.toString());
        } catch (CompteNotExistException_Exception e) {
            System.out.println("Expected exception: CompteNotExistException has occurred.");
            System.out.println(e.toString());
        }

            }
        {
        System.out.println("Invoking findClient...");
        java.lang.String _findClient_prenom = "";
        java.lang.String _findClient_nom = "";
        javax.xml.datatype.XMLGregorianCalendar _findClient_date = null;
        try {
            alom.bank.client.Client _findClient__return = port.findClient(_findClient_prenom, _findClient_nom, _findClient_date);
            System.out.println("findClient.result=" + _findClient__return);

        } catch (ClientNotExistException_Exception e) {
            System.out.println("Expected exception: ClientNotExistException has occurred.");
            System.out.println(e.toString());
        }

            }
        {
        System.out.println("Invoking addMoney...");
        alom.bank.client.Compte _addMoney_compte = null;
        int _addMoney_somme = 0;
        try {
            int _addMoney__return = port.addMoney(_addMoney_compte, _addMoney_somme);
            System.out.println("addMoney.result=" + _addMoney__return);

        } catch (IncorrectValueException_Exception e) {
            System.out.println("Expected exception: IncorrectValueException has occurred.");
            System.out.println(e.toString());
        } catch (CompteNotExistException_Exception e) {
            System.out.println("Expected exception: CompteNotExistException has occurred.");
            System.out.println(e.toString());
        }

            }
        {
        System.out.println("Invoking moveBetweenDifferentClientCompte...");
        alom.bank.client.Client _moveBetweenDifferentClientCompte_clientPlus = null;
        alom.bank.client.Compte _moveBetweenDifferentClientCompte_comptePlus = null;
        alom.bank.client.Client _moveBetweenDifferentClientCompte_clientMoins = null;
        alom.bank.client.Compte _moveBetweenDifferentClientCompte_compteMoins = null;
        int _moveBetweenDifferentClientCompte_montant = 0;
        try {
            port.moveBetweenDifferentClientCompte(_moveBetweenDifferentClientCompte_clientPlus, _moveBetweenDifferentClientCompte_comptePlus, _moveBetweenDifferentClientCompte_clientMoins, _moveBetweenDifferentClientCompte_compteMoins, _moveBetweenDifferentClientCompte_montant);

        } catch (IncorrectValueException_Exception e) {
            System.out.println("Expected exception: IncorrectValueException has occurred.");
            System.out.println(e.toString());
        } catch (IncorrectCompteOwnerException_Exception e) {
            System.out.println("Expected exception: IncorrectCompteOwnerException has occurred.");
            System.out.println(e.toString());
        } catch (ClientNotExistException_Exception e) {
            System.out.println("Expected exception: ClientNotExistException has occurred.");
            System.out.println(e.toString());
        } catch (CompteNotExistException_Exception e) {
            System.out.println("Expected exception: CompteNotExistException has occurred.");
            System.out.println(e.toString());
        }

            }
        {
        System.out.println("Invoking findMoney...");
        alom.bank.client.Compte _findMoney_compte = null;
        try {
            int _findMoney__return = port.findMoney(_findMoney_compte);
            System.out.println("findMoney.result=" + _findMoney__return);

        } catch (CompteNotExistException_Exception e) {
            System.out.println("Expected exception: CompteNotExistException has occurred.");
            System.out.println(e.toString());
        }

            }
        {
        System.out.println("Invoking addClient...");
        java.lang.String _addClient_prenom = "";
        java.lang.String _addClient_nom = "";
        javax.xml.datatype.XMLGregorianCalendar _addClient_date = null;
        try {
            alom.bank.client.Client _addClient__return = port.addClient(_addClient_prenom, _addClient_nom, _addClient_date);
            System.out.println("addClient.result=" + _addClient__return);

        } catch (ClientExistException_Exception e) {
            System.out.println("Expected exception: ClientExistException has occurred.");
            System.out.println(e.toString());
        }

            }
        {
        System.out.println("Invoking addCompte...");
        alom.bank.client.Client _addCompte_client = null;
        alom.bank.client.CompteType _addCompte_compteType = null;
        try {
            alom.bank.client.Compte _addCompte__return = port.addCompte(_addCompte_client, _addCompte_compteType);
            System.out.println("addCompte.result=" + _addCompte__return);

        } catch (CompteTypeNotExistException_Exception e) {
            System.out.println("Expected exception: CompteTypeNotExistException has occurred.");
            System.out.println(e.toString());
        } catch (ClientNotExistException_Exception e) {
            System.out.println("Expected exception: ClientNotExistException has occurred.");
            System.out.println(e.toString());
        } catch (CompteTypeExistException_Exception e) {
            System.out.println("Expected exception: CompteTypeExistException has occurred.");
            System.out.println(e.toString());
        }

            }
        {
        System.out.println("Invoking findCompte...");
        alom.bank.client.Client _findCompte_client = null;
        alom.bank.client.CompteType _findCompte_compteType = null;
        try {
            alom.bank.client.Compte _findCompte__return = port.findCompte(_findCompte_client, _findCompte_compteType);
            System.out.println("findCompte.result=" + _findCompte__return);

        } catch (CompteTypeNotExistException_Exception e) {
            System.out.println("Expected exception: CompteTypeNotExistException has occurred.");
            System.out.println(e.toString());
        } catch (ClientNotExistException_Exception e) {
            System.out.println("Expected exception: ClientNotExistException has occurred.");
            System.out.println(e.toString());
        } catch (CompteNotExistException_Exception e) {
            System.out.println("Expected exception: CompteNotExistException has occurred.");
            System.out.println(e.toString());
        }

            }
        {
        System.out.println("Invoking removeClient...");
        alom.bank.client.Client _removeClient_client = null;
        try {
            port.removeClient(_removeClient_client);

        } catch (ClientNotExistException_Exception e) {
            System.out.println("Expected exception: ClientNotExistException has occurred.");
            System.out.println(e.toString());
        } catch (ClientCompteNotCloseException_Exception e) {
            System.out.println("Expected exception: ClientCompteNotCloseException has occurred.");
            System.out.println(e.toString());
        }

            }
        {
        System.out.println("Invoking closeCompte...");
        alom.bank.client.Compte _closeCompte_compte = null;
        try {
            int _closeCompte__return = port.closeCompte(_closeCompte_compte);
            System.out.println("closeCompte.result=" + _closeCompte__return);

        } catch (CompteNotExistException_Exception e) {
            System.out.println("Expected exception: CompteNotExistException has occurred.");
            System.out.println(e.toString());
        }

            }
        {
        System.out.println("Invoking moveBetweenSameClientCompte...");
        alom.bank.client.Client _moveBetweenSameClientCompte_client = null;
        alom.bank.client.CompteType _moveBetweenSameClientCompte_compteTypePlus = null;
        alom.bank.client.CompteType _moveBetweenSameClientCompte_compteTypeMoins = null;
        int _moveBetweenSameClientCompte_montant = 0;
        try {
            port.moveBetweenSameClientCompte(_moveBetweenSameClientCompte_client, _moveBetweenSameClientCompte_compteTypePlus, _moveBetweenSameClientCompte_compteTypeMoins, _moveBetweenSameClientCompte_montant);

        } catch (IncorrectValueException_Exception e) {
            System.out.println("Expected exception: IncorrectValueException has occurred.");
            System.out.println(e.toString());
        } catch (CompteTypeNotExistException_Exception e) {
            System.out.println("Expected exception: CompteTypeNotExistException has occurred.");
            System.out.println(e.toString());
        } catch (ClientNotExistException_Exception e) {
            System.out.println("Expected exception: ClientNotExistException has occurred.");
            System.out.println(e.toString());
        } catch (CompteNotExistException_Exception e) {
            System.out.println("Expected exception: CompteNotExistException has occurred.");
            System.out.println(e.toString());
        }

            }

        System.exit(0);
    }

}
