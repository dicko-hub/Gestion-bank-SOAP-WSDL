package alom.bank.server.back;



public enum CompteType {
	
	CHEQUES ("cheques"),
	LIVRET_A ("livret A"),
	LIVRET_DEVELOPPEMENT_DURABLE ("livret developpement durable"),
	LIVRET_JEUNE ("livret jeune");
	
	private final String type;

	CompteType(String type) {
		this.type = type;
	}
	
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

}
