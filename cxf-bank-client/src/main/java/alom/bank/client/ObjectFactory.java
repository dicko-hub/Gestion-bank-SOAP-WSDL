
package alom.bank.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the alom.bank.client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AddClient_QNAME = new QName("http://front.server.bank.alom/", "addClient");
    private final static QName _AddClientResponse_QNAME = new QName("http://front.server.bank.alom/", "addClientResponse");
    private final static QName _AddCompte_QNAME = new QName("http://front.server.bank.alom/", "addCompte");
    private final static QName _AddCompteResponse_QNAME = new QName("http://front.server.bank.alom/", "addCompteResponse");
    private final static QName _AddMoney_QNAME = new QName("http://front.server.bank.alom/", "addMoney");
    private final static QName _AddMoneyResponse_QNAME = new QName("http://front.server.bank.alom/", "addMoneyResponse");
    private final static QName _CloseCompte_QNAME = new QName("http://front.server.bank.alom/", "closeCompte");
    private final static QName _CloseCompteResponse_QNAME = new QName("http://front.server.bank.alom/", "closeCompteResponse");
    private final static QName _FindClient_QNAME = new QName("http://front.server.bank.alom/", "findClient");
    private final static QName _FindClientResponse_QNAME = new QName("http://front.server.bank.alom/", "findClientResponse");
    private final static QName _FindCompte_QNAME = new QName("http://front.server.bank.alom/", "findCompte");
    private final static QName _FindCompteResponse_QNAME = new QName("http://front.server.bank.alom/", "findCompteResponse");
    private final static QName _FindMoney_QNAME = new QName("http://front.server.bank.alom/", "findMoney");
    private final static QName _FindMoneyResponse_QNAME = new QName("http://front.server.bank.alom/", "findMoneyResponse");
    private final static QName _MoveBetweenDifferentClientCompte_QNAME = new QName("http://front.server.bank.alom/", "moveBetweenDifferentClientCompte");
    private final static QName _MoveBetweenDifferentClientCompteResponse_QNAME = new QName("http://front.server.bank.alom/", "moveBetweenDifferentClientCompteResponse");
    private final static QName _MoveBetweenSameClientCompte_QNAME = new QName("http://front.server.bank.alom/", "moveBetweenSameClientCompte");
    private final static QName _MoveBetweenSameClientCompteResponse_QNAME = new QName("http://front.server.bank.alom/", "moveBetweenSameClientCompteResponse");
    private final static QName _RemoveClient_QNAME = new QName("http://front.server.bank.alom/", "removeClient");
    private final static QName _RemoveClientResponse_QNAME = new QName("http://front.server.bank.alom/", "removeClientResponse");
    private final static QName _RemoveMoney_QNAME = new QName("http://front.server.bank.alom/", "removeMoney");
    private final static QName _RemoveMoneyResponse_QNAME = new QName("http://front.server.bank.alom/", "removeMoneyResponse");
    private final static QName _IncorrectValueException_QNAME = new QName("http://front.server.bank.alom/", "IncorrectValueException");
    private final static QName _CompteNotExistException_QNAME = new QName("http://front.server.bank.alom/", "CompteNotExistException");
    private final static QName _ClientNotExistException_QNAME = new QName("http://front.server.bank.alom/", "ClientNotExistException");
    private final static QName _IncorrectCompteOwnerException_QNAME = new QName("http://front.server.bank.alom/", "IncorrectCompteOwnerException");
    private final static QName _ClientExistException_QNAME = new QName("http://front.server.bank.alom/", "ClientExistException");
    private final static QName _CompteTypeNotExistException_QNAME = new QName("http://front.server.bank.alom/", "CompteTypeNotExistException");
    private final static QName _CompteTypeExistException_QNAME = new QName("http://front.server.bank.alom/", "CompteTypeExistException");
    private final static QName _ClientCompteNotCloseException_QNAME = new QName("http://front.server.bank.alom/", "ClientCompteNotCloseException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: alom.bank.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddClient }
     * 
     */
    public AddClient createAddClient() {
        return new AddClient();
    }

    /**
     * Create an instance of {@link AddClientResponse }
     * 
     */
    public AddClientResponse createAddClientResponse() {
        return new AddClientResponse();
    }

    /**
     * Create an instance of {@link AddCompte }
     * 
     */
    public AddCompte createAddCompte() {
        return new AddCompte();
    }

    /**
     * Create an instance of {@link AddCompteResponse }
     * 
     */
    public AddCompteResponse createAddCompteResponse() {
        return new AddCompteResponse();
    }

    /**
     * Create an instance of {@link AddMoney }
     * 
     */
    public AddMoney createAddMoney() {
        return new AddMoney();
    }

    /**
     * Create an instance of {@link AddMoneyResponse }
     * 
     */
    public AddMoneyResponse createAddMoneyResponse() {
        return new AddMoneyResponse();
    }

    /**
     * Create an instance of {@link CloseCompte }
     * 
     */
    public CloseCompte createCloseCompte() {
        return new CloseCompte();
    }

    /**
     * Create an instance of {@link CloseCompteResponse }
     * 
     */
    public CloseCompteResponse createCloseCompteResponse() {
        return new CloseCompteResponse();
    }

    /**
     * Create an instance of {@link FindClient }
     * 
     */
    public FindClient createFindClient() {
        return new FindClient();
    }

    /**
     * Create an instance of {@link FindClientResponse }
     * 
     */
    public FindClientResponse createFindClientResponse() {
        return new FindClientResponse();
    }

    /**
     * Create an instance of {@link FindCompte }
     * 
     */
    public FindCompte createFindCompte() {
        return new FindCompte();
    }

    /**
     * Create an instance of {@link FindCompteResponse }
     * 
     */
    public FindCompteResponse createFindCompteResponse() {
        return new FindCompteResponse();
    }

    /**
     * Create an instance of {@link FindMoney }
     * 
     */
    public FindMoney createFindMoney() {
        return new FindMoney();
    }

    /**
     * Create an instance of {@link FindMoneyResponse }
     * 
     */
    public FindMoneyResponse createFindMoneyResponse() {
        return new FindMoneyResponse();
    }

    /**
     * Create an instance of {@link MoveBetweenDifferentClientCompte }
     * 
     */
    public MoveBetweenDifferentClientCompte createMoveBetweenDifferentClientCompte() {
        return new MoveBetweenDifferentClientCompte();
    }

    /**
     * Create an instance of {@link MoveBetweenDifferentClientCompteResponse }
     * 
     */
    public MoveBetweenDifferentClientCompteResponse createMoveBetweenDifferentClientCompteResponse() {
        return new MoveBetweenDifferentClientCompteResponse();
    }

    /**
     * Create an instance of {@link MoveBetweenSameClientCompte }
     * 
     */
    public MoveBetweenSameClientCompte createMoveBetweenSameClientCompte() {
        return new MoveBetweenSameClientCompte();
    }

    /**
     * Create an instance of {@link MoveBetweenSameClientCompteResponse }
     * 
     */
    public MoveBetweenSameClientCompteResponse createMoveBetweenSameClientCompteResponse() {
        return new MoveBetweenSameClientCompteResponse();
    }

    /**
     * Create an instance of {@link RemoveClient }
     * 
     */
    public RemoveClient createRemoveClient() {
        return new RemoveClient();
    }

    /**
     * Create an instance of {@link RemoveClientResponse }
     * 
     */
    public RemoveClientResponse createRemoveClientResponse() {
        return new RemoveClientResponse();
    }

    /**
     * Create an instance of {@link RemoveMoney }
     * 
     */
    public RemoveMoney createRemoveMoney() {
        return new RemoveMoney();
    }

    /**
     * Create an instance of {@link RemoveMoneyResponse }
     * 
     */
    public RemoveMoneyResponse createRemoveMoneyResponse() {
        return new RemoveMoneyResponse();
    }

    /**
     * Create an instance of {@link IncorrectValueException }
     * 
     */
    public IncorrectValueException createIncorrectValueException() {
        return new IncorrectValueException();
    }

    /**
     * Create an instance of {@link CompteNotExistException }
     * 
     */
    public CompteNotExistException createCompteNotExistException() {
        return new CompteNotExistException();
    }

    /**
     * Create an instance of {@link ClientNotExistException }
     * 
     */
    public ClientNotExistException createClientNotExistException() {
        return new ClientNotExistException();
    }

    /**
     * Create an instance of {@link IncorrectCompteOwnerException }
     * 
     */
    public IncorrectCompteOwnerException createIncorrectCompteOwnerException() {
        return new IncorrectCompteOwnerException();
    }

    /**
     * Create an instance of {@link ClientExistException }
     * 
     */
    public ClientExistException createClientExistException() {
        return new ClientExistException();
    }

    /**
     * Create an instance of {@link CompteTypeNotExistException }
     * 
     */
    public CompteTypeNotExistException createCompteTypeNotExistException() {
        return new CompteTypeNotExistException();
    }

    /**
     * Create an instance of {@link CompteTypeExistException }
     * 
     */
    public CompteTypeExistException createCompteTypeExistException() {
        return new CompteTypeExistException();
    }

    /**
     * Create an instance of {@link ClientCompteNotCloseException }
     * 
     */
    public ClientCompteNotCloseException createClientCompteNotCloseException() {
        return new ClientCompteNotCloseException();
    }

    /**
     * Create an instance of {@link Compte }
     * 
     */
    public Compte createCompte() {
        return new Compte();
    }

    /**
     * Create an instance of {@link Client }
     * 
     */
    public Client createClient() {
        return new Client();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddClient }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddClient }{@code >}
     */
    @XmlElementDecl(namespace = "http://front.server.bank.alom/", name = "addClient")
    public JAXBElement<AddClient> createAddClient(AddClient value) {
        return new JAXBElement<AddClient>(_AddClient_QNAME, AddClient.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddClientResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddClientResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://front.server.bank.alom/", name = "addClientResponse")
    public JAXBElement<AddClientResponse> createAddClientResponse(AddClientResponse value) {
        return new JAXBElement<AddClientResponse>(_AddClientResponse_QNAME, AddClientResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCompte }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddCompte }{@code >}
     */
    @XmlElementDecl(namespace = "http://front.server.bank.alom/", name = "addCompte")
    public JAXBElement<AddCompte> createAddCompte(AddCompte value) {
        return new JAXBElement<AddCompte>(_AddCompte_QNAME, AddCompte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCompteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddCompteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://front.server.bank.alom/", name = "addCompteResponse")
    public JAXBElement<AddCompteResponse> createAddCompteResponse(AddCompteResponse value) {
        return new JAXBElement<AddCompteResponse>(_AddCompteResponse_QNAME, AddCompteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddMoney }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddMoney }{@code >}
     */
    @XmlElementDecl(namespace = "http://front.server.bank.alom/", name = "addMoney")
    public JAXBElement<AddMoney> createAddMoney(AddMoney value) {
        return new JAXBElement<AddMoney>(_AddMoney_QNAME, AddMoney.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddMoneyResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddMoneyResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://front.server.bank.alom/", name = "addMoneyResponse")
    public JAXBElement<AddMoneyResponse> createAddMoneyResponse(AddMoneyResponse value) {
        return new JAXBElement<AddMoneyResponse>(_AddMoneyResponse_QNAME, AddMoneyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CloseCompte }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CloseCompte }{@code >}
     */
    @XmlElementDecl(namespace = "http://front.server.bank.alom/", name = "closeCompte")
    public JAXBElement<CloseCompte> createCloseCompte(CloseCompte value) {
        return new JAXBElement<CloseCompte>(_CloseCompte_QNAME, CloseCompte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CloseCompteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CloseCompteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://front.server.bank.alom/", name = "closeCompteResponse")
    public JAXBElement<CloseCompteResponse> createCloseCompteResponse(CloseCompteResponse value) {
        return new JAXBElement<CloseCompteResponse>(_CloseCompteResponse_QNAME, CloseCompteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindClient }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindClient }{@code >}
     */
    @XmlElementDecl(namespace = "http://front.server.bank.alom/", name = "findClient")
    public JAXBElement<FindClient> createFindClient(FindClient value) {
        return new JAXBElement<FindClient>(_FindClient_QNAME, FindClient.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindClientResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindClientResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://front.server.bank.alom/", name = "findClientResponse")
    public JAXBElement<FindClientResponse> createFindClientResponse(FindClientResponse value) {
        return new JAXBElement<FindClientResponse>(_FindClientResponse_QNAME, FindClientResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCompte }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindCompte }{@code >}
     */
    @XmlElementDecl(namespace = "http://front.server.bank.alom/", name = "findCompte")
    public JAXBElement<FindCompte> createFindCompte(FindCompte value) {
        return new JAXBElement<FindCompte>(_FindCompte_QNAME, FindCompte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCompteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindCompteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://front.server.bank.alom/", name = "findCompteResponse")
    public JAXBElement<FindCompteResponse> createFindCompteResponse(FindCompteResponse value) {
        return new JAXBElement<FindCompteResponse>(_FindCompteResponse_QNAME, FindCompteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindMoney }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindMoney }{@code >}
     */
    @XmlElementDecl(namespace = "http://front.server.bank.alom/", name = "findMoney")
    public JAXBElement<FindMoney> createFindMoney(FindMoney value) {
        return new JAXBElement<FindMoney>(_FindMoney_QNAME, FindMoney.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindMoneyResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindMoneyResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://front.server.bank.alom/", name = "findMoneyResponse")
    public JAXBElement<FindMoneyResponse> createFindMoneyResponse(FindMoneyResponse value) {
        return new JAXBElement<FindMoneyResponse>(_FindMoneyResponse_QNAME, FindMoneyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MoveBetweenDifferentClientCompte }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MoveBetweenDifferentClientCompte }{@code >}
     */
    @XmlElementDecl(namespace = "http://front.server.bank.alom/", name = "moveBetweenDifferentClientCompte")
    public JAXBElement<MoveBetweenDifferentClientCompte> createMoveBetweenDifferentClientCompte(MoveBetweenDifferentClientCompte value) {
        return new JAXBElement<MoveBetweenDifferentClientCompte>(_MoveBetweenDifferentClientCompte_QNAME, MoveBetweenDifferentClientCompte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MoveBetweenDifferentClientCompteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MoveBetweenDifferentClientCompteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://front.server.bank.alom/", name = "moveBetweenDifferentClientCompteResponse")
    public JAXBElement<MoveBetweenDifferentClientCompteResponse> createMoveBetweenDifferentClientCompteResponse(MoveBetweenDifferentClientCompteResponse value) {
        return new JAXBElement<MoveBetweenDifferentClientCompteResponse>(_MoveBetweenDifferentClientCompteResponse_QNAME, MoveBetweenDifferentClientCompteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MoveBetweenSameClientCompte }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MoveBetweenSameClientCompte }{@code >}
     */
    @XmlElementDecl(namespace = "http://front.server.bank.alom/", name = "moveBetweenSameClientCompte")
    public JAXBElement<MoveBetweenSameClientCompte> createMoveBetweenSameClientCompte(MoveBetweenSameClientCompte value) {
        return new JAXBElement<MoveBetweenSameClientCompte>(_MoveBetweenSameClientCompte_QNAME, MoveBetweenSameClientCompte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MoveBetweenSameClientCompteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MoveBetweenSameClientCompteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://front.server.bank.alom/", name = "moveBetweenSameClientCompteResponse")
    public JAXBElement<MoveBetweenSameClientCompteResponse> createMoveBetweenSameClientCompteResponse(MoveBetweenSameClientCompteResponse value) {
        return new JAXBElement<MoveBetweenSameClientCompteResponse>(_MoveBetweenSameClientCompteResponse_QNAME, MoveBetweenSameClientCompteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveClient }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemoveClient }{@code >}
     */
    @XmlElementDecl(namespace = "http://front.server.bank.alom/", name = "removeClient")
    public JAXBElement<RemoveClient> createRemoveClient(RemoveClient value) {
        return new JAXBElement<RemoveClient>(_RemoveClient_QNAME, RemoveClient.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveClientResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemoveClientResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://front.server.bank.alom/", name = "removeClientResponse")
    public JAXBElement<RemoveClientResponse> createRemoveClientResponse(RemoveClientResponse value) {
        return new JAXBElement<RemoveClientResponse>(_RemoveClientResponse_QNAME, RemoveClientResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveMoney }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemoveMoney }{@code >}
     */
    @XmlElementDecl(namespace = "http://front.server.bank.alom/", name = "removeMoney")
    public JAXBElement<RemoveMoney> createRemoveMoney(RemoveMoney value) {
        return new JAXBElement<RemoveMoney>(_RemoveMoney_QNAME, RemoveMoney.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveMoneyResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemoveMoneyResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://front.server.bank.alom/", name = "removeMoneyResponse")
    public JAXBElement<RemoveMoneyResponse> createRemoveMoneyResponse(RemoveMoneyResponse value) {
        return new JAXBElement<RemoveMoneyResponse>(_RemoveMoneyResponse_QNAME, RemoveMoneyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IncorrectValueException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IncorrectValueException }{@code >}
     */
    @XmlElementDecl(namespace = "http://front.server.bank.alom/", name = "IncorrectValueException")
    public JAXBElement<IncorrectValueException> createIncorrectValueException(IncorrectValueException value) {
        return new JAXBElement<IncorrectValueException>(_IncorrectValueException_QNAME, IncorrectValueException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompteNotExistException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CompteNotExistException }{@code >}
     */
    @XmlElementDecl(namespace = "http://front.server.bank.alom/", name = "CompteNotExistException")
    public JAXBElement<CompteNotExistException> createCompteNotExistException(CompteNotExistException value) {
        return new JAXBElement<CompteNotExistException>(_CompteNotExistException_QNAME, CompteNotExistException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClientNotExistException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ClientNotExistException }{@code >}
     */
    @XmlElementDecl(namespace = "http://front.server.bank.alom/", name = "ClientNotExistException")
    public JAXBElement<ClientNotExistException> createClientNotExistException(ClientNotExistException value) {
        return new JAXBElement<ClientNotExistException>(_ClientNotExistException_QNAME, ClientNotExistException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IncorrectCompteOwnerException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IncorrectCompteOwnerException }{@code >}
     */
    @XmlElementDecl(namespace = "http://front.server.bank.alom/", name = "IncorrectCompteOwnerException")
    public JAXBElement<IncorrectCompteOwnerException> createIncorrectCompteOwnerException(IncorrectCompteOwnerException value) {
        return new JAXBElement<IncorrectCompteOwnerException>(_IncorrectCompteOwnerException_QNAME, IncorrectCompteOwnerException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClientExistException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ClientExistException }{@code >}
     */
    @XmlElementDecl(namespace = "http://front.server.bank.alom/", name = "ClientExistException")
    public JAXBElement<ClientExistException> createClientExistException(ClientExistException value) {
        return new JAXBElement<ClientExistException>(_ClientExistException_QNAME, ClientExistException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompteTypeNotExistException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CompteTypeNotExistException }{@code >}
     */
    @XmlElementDecl(namespace = "http://front.server.bank.alom/", name = "CompteTypeNotExistException")
    public JAXBElement<CompteTypeNotExistException> createCompteTypeNotExistException(CompteTypeNotExistException value) {
        return new JAXBElement<CompteTypeNotExistException>(_CompteTypeNotExistException_QNAME, CompteTypeNotExistException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompteTypeExistException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CompteTypeExistException }{@code >}
     */
    @XmlElementDecl(namespace = "http://front.server.bank.alom/", name = "CompteTypeExistException")
    public JAXBElement<CompteTypeExistException> createCompteTypeExistException(CompteTypeExistException value) {
        return new JAXBElement<CompteTypeExistException>(_CompteTypeExistException_QNAME, CompteTypeExistException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClientCompteNotCloseException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ClientCompteNotCloseException }{@code >}
     */
    @XmlElementDecl(namespace = "http://front.server.bank.alom/", name = "ClientCompteNotCloseException")
    public JAXBElement<ClientCompteNotCloseException> createClientCompteNotCloseException(ClientCompteNotCloseException value) {
        return new JAXBElement<ClientCompteNotCloseException>(_ClientCompteNotCloseException_QNAME, ClientCompteNotCloseException.class, null, value);
    }

}
