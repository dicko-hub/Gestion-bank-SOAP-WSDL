package Main;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.frontend.ClientProxyFactoryBean;
import org.apache.cxf.jaxws.JaxWsClientFactoryBean;
import org.apache.cxf.transport.http.HTTPConduit;
import org.apache.cxf.transports.http.configuration.HTTPClientPolicy;

import alom.bank.client.GestionBank;

public class BankServiceClient {
	private final ClientProxyFactoryBean factory;
	private GestionBank service;

	public BankServiceClient(long connectionTimeout, long receiveTimeout) {
		factory = new ClientProxyFactoryBean(new JaxWsClientFactoryBean());

		factory.setServiceClass(GestionBank.class);
		factory.setAddress("http://localhost:8080/cxf-bank-server");
		this.service = (GestionBank) factory.create();

		Client client = ClientProxy.getClient(this.service);
		HTTPConduit http = (HTTPConduit) client.getConduit();
		HTTPClientPolicy httpClientPolicy = http.getClient ();

		httpClientPolicy.setConnectionTimeout(connectionTimeout);
		httpClientPolicy.setReceiveTimeout(receiveTimeout);
	}

	public GestionBank getService() {
		return service;
	}
}
