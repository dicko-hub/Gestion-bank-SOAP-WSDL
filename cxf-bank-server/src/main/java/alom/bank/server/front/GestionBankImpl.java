package alom.bank.server.front;

import java.util.Calendar;

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
import alom.bank.server.middle.RepositoryController;

@WebService(endpointInterface = "alom.bank.server.front.GestionBank")
public class GestionBankImpl implements GestionBank {
	
	RepositoryController RP = new RepositoryController();

	@Override
	public Client addClient(String prenom, String nom, Calendar date) throws ClientExistException {
		return RP.addClient(prenom, nom, date);
	}

	@Override
	public Client findClient(String prenom, String nom, Calendar date) throws ClientNotExistException {
		return RP.findClient(prenom, nom, date);
	}

	@Override
	public Compte addCompte(Client client, CompteType type)
			throws CompteTypeNotExistException, CompteTypeExistException, ClientNotExistException {
		return RP.addCompte(client, type);
	}

	@Override
	public Compte findCompte(Client client, CompteType type)
			throws CompteTypeNotExistException, CompteNotExistException, ClientNotExistException {
		return RP.findCompte(client, type);
	}

	@Override
	public int addMoney(Compte compte, int somme) throws CompteNotExistException, IncorrectValueException {
		return RP.addMoney(compte, somme);
	}

	@Override
	public int findMoney(Compte compte) throws CompteNotExistException {
		return RP.findMoney(compte);
	}

	@Override
	public int removeMoney(Compte compte, int somme) throws CompteNotExistException, IncorrectValueException {
		return RP.removeMoney(compte, somme);
	}

	@Override
	public void moveBetweenSameClientCompte(Client client, CompteType typePlus, CompteType typeMoins, int montant)
			throws ClientNotExistException, CompteNotExistException, CompteTypeNotExistException,
			IncorrectValueException {
		RP.moveBetweenSameClientCompte(client, typePlus, typeMoins, montant);

	}

	@Override
	public void moveBetweenDifferentClientCompte(Client clientPlus, Compte comptePlus, Client clientMoins,
			Compte compteMoins, int montant) throws ClientNotExistException, CompteNotExistException,
			IncorrectCompteOwnerException, IncorrectValueException {
		RP.moveBetweenDifferentClientCompte(clientPlus, comptePlus, clientMoins, compteMoins, montant);

	}

	@Override
	public int closeCompte(Compte compte) throws CompteNotExistException {
		return RP.closeCompte(compte);
	}

	@Override
	public void removeClient(Client client) throws ClientNotExistException, ClientCompteNotCloseException {
		RP.removeClient(client);
	}

}