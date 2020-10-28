package alom.bank.server.front.exception;

public class IncorrectCompteOwnerException extends Exception {

	public IncorrectCompteOwnerException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	// permet de verifier qu'un compte appartient au bon client au moment des virememnts

}
