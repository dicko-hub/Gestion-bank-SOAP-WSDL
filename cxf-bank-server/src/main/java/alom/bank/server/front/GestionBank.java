package alom.bank.server.front;

import java.util.Calendar;

import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.datatype.XMLGregorianCalendar;

import alom.bank.server.back.Client;
import alom.bank.server.back.Compte;
import alom.bank.server.back.CompteType;
import alom.bank.server.front.exception.ClientCompteNotCloseException;
import alom.bank.server.front.exception.ClientExistException;
import alom.bank.server.front.exception.ClientNotExistException;
import alom.bank.server.front.exception.CompteNotExistException;
import alom.bank.server.front.exception.CompteTypeExistException;
import alom.bank.server.front.exception.CompteTypeNotExistException;
import alom.bank.server.front.exception.IncorrectCompteOwnerException;
import alom.bank.server.front.exception.IncorrectValueException;

@WebService
public interface GestionBank {
	
	Client addClient(@WebParam(name="prenom")String prenom, @WebParam(name="nom")String nom, @WebParam(name="date")Calendar date) 
	throws ClientExistException;
	
	Client findClient(@WebParam(name="prenom")String prenom, @WebParam(name="nom")String nom, @WebParam(name="date")Calendar date)
	throws ClientNotExistException;
		
	Compte addCompte(@WebParam(name="client")Client client, @WebParam(name="compteType")CompteType type)
	throws CompteTypeNotExistException, CompteTypeExistException, ClientNotExistException;
	
	Compte findCompte(@WebParam(name="client")Client client, @WebParam(name="compteType")CompteType type)
	throws CompteTypeNotExistException, CompteNotExistException, ClientNotExistException;
	
	int addMoney(@WebParam(name="compte")Compte compte, @WebParam(name="somme")int somme)
	throws CompteNotExistException, IncorrectValueException;
	
	// Recuperer le solde
	int findMoney(@WebParam(name="compte")Compte compte)
	throws CompteNotExistException;
	
	// retirer de l'argent
	int removeMoney(@WebParam(name="compte")Compte compte, @WebParam(name="somme")int somme)
	throws CompteNotExistException, IncorrectValueException;
	
	void moveBetweenSameClientCompte(@WebParam(name="client")Client client, @WebParam(name="compteTypePlus")CompteType typePlus, @WebParam(name="compteTypeMoins")CompteType typeMoins, @WebParam(name="montant")int montant)
	throws ClientNotExistException, CompteNotExistException, CompteTypeNotExistException, IncorrectValueException;
	
	void moveBetweenDifferentClientCompte(@WebParam(name="clientPlus")Client clientPlus, @WebParam(name="comptePlus")Compte comptePlus, 
			@WebParam(name="clientMoins")Client clientMoins, @WebParam(name="compteMoins")Compte compteMoins, @WebParam(name="montant")int montant)
	throws ClientNotExistException, CompteNotExistException, IncorrectCompteOwnerException, IncorrectValueException;
	
	//permet de clore un compte
	int closeCompte(@WebParam(name="compte")Compte compte)
	throws CompteNotExistException;
	
	//permet de supprimer un client de la banque
	void removeClient(@WebParam(name="client")Client client)
	throws ClientNotExistException, ClientCompteNotCloseException;
}