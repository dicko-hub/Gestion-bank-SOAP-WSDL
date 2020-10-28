
package alom.bank.client;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.3.7
 * 2020-10-08T17:08:06.347+02:00
 * Generated source version: 3.3.7
 */

@WebFault(name = "ClientNotExistException", targetNamespace = "http://front.server.bank.alom/")
public class ClientNotExistException_Exception extends Exception {

    private alom.bank.client.ClientNotExistException clientNotExistException;

    public ClientNotExistException_Exception() {
        super();
    }

    public ClientNotExistException_Exception(String message) {
        super(message);
    }

    public ClientNotExistException_Exception(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public ClientNotExistException_Exception(String message, alom.bank.client.ClientNotExistException clientNotExistException) {
        super(message);
        this.clientNotExistException = clientNotExistException;
    }

    public ClientNotExistException_Exception(String message, alom.bank.client.ClientNotExistException clientNotExistException, java.lang.Throwable cause) {
        super(message, cause);
        this.clientNotExistException = clientNotExistException;
    }

    public alom.bank.client.ClientNotExistException getFaultInfo() {
        return this.clientNotExistException;
    }
}
