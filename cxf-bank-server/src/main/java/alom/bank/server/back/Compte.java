package alom.bank.server.back;

public class Compte {
	
	private Client client;
	private CompteType type;
	private int solde = 0;
	private boolean close = false;
	
	public Compte() {
		
	}
	
	public Compte(Client client, CompteType type, int solde) {
		
		this.client = client;
		this.type = type;
		this.solde = solde;
	}

	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((client == null) ? 0 : client.hashCode());
		result = prime * result + (close ? 1231 : 1237);
		result = prime * result + solde;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Compte other = (Compte) obj;
		if (client == null) {
			if (other.client != null)
				return false;
		} else if (!client.equals(other.client))
			return false;
		if (close != other.close)
			return false;
		if (solde != other.solde)
			return false;
		if (type != other.type)
			return false;
		return true;
	}

	public Client getClient() {
		return client;
	}





	public void setClient(Client client) {
		this.client = client;
	}





	public CompteType getType() {
		return type;
	}





	public void setType(CompteType type) {
		this.type = type;
	}





	public int getSolde() {
		return solde;
	}





	public void setSolde(int solde) {
		this.solde = solde;
	}





	public boolean isClose() {
		return close;
	}





	public void setClose(boolean close) {
		this.close = close;
	}

}
