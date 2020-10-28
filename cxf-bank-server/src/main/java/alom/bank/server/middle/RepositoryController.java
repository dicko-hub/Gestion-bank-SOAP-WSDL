package alom.bank.server.middle;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Map;

import alom.bank.server.back.Client;
import alom.bank.server.back.Compte;
import alom.bank.server.back.CompteType;
import alom.bank.server.back.Repository;
import alom.bank.server.front.exception.ClientCompteNotCloseException;
import alom.bank.server.front.exception.ClientExistException;
import alom.bank.server.front.exception.ClientNotExistException;
import alom.bank.server.front.exception.CompteNotExistException;
import alom.bank.server.front.exception.CompteTypeExistException;
import alom.bank.server.front.exception.CompteTypeNotExistException;
import alom.bank.server.front.exception.IncorrectCompteOwnerException;
import alom.bank.server.front.exception.IncorrectValueException;

public class RepositoryController {
	 Map<Client, ArrayList<Compte>> bank = Repository.getInstance().getBank();
	 
	 
	public Client addClient(String prenom, String nom, Calendar date) throws ClientExistException {
		Client client = new Client(prenom,nom,date);
		for (Client base : bank.keySet()) {
					 if(base.equals(client)) {
						 throw new ClientExistException("le client existe deja");
					 }
		}
		 ArrayList<Compte> comptes = new ArrayList<Compte>();
		 bank.put(client,comptes);
		return client;
	}

	public Client findClient(String prenom, String nom, Calendar date) throws ClientNotExistException {
		 Client client = new Client(prenom,nom,date);
		 for (Client base : bank.keySet()) {
			 
			 if(base.equals(client)) {
				 return client;
			 }
		 }
		 throw new ClientNotExistException("le client n'existe pas");
	}

	public Compte addCompte(Client client, CompteType type)
			throws CompteTypeExistException, ClientNotExistException {
		
		Client clientSur = findClient(client.getPrenom(), client.getNom(), client.getDate());
		ArrayList<Compte> comptes = bank.get(clientSur);
		
		Compte compte = new Compte(client,type,0);
		for (Compte base : comptes) {
			 
			 if(base.equals(compte)) {
				 throw new CompteTypeExistException("ce type de compte existe deja pour ce client");
			 }
		 }
		
		comptes.add(compte);
		bank.put(client,comptes);
		return compte;
	}

	public Compte findCompte(Client client, CompteType type)
			throws CompteNotExistException, ClientNotExistException {
		
		Client clientSur = findClient(client.getPrenom(), client.getNom(), client.getDate());
		ArrayList<Compte> comptes = bank.get(clientSur);
		
		for(Compte compte : comptes) {
			
			if(compte.getType().equals(type)) {
				
				return compte;
			}
		}
		throw new CompteNotExistException("le compte n'existe pas");
		
	}

	public int addMoney(Compte compte, int somme) throws CompteNotExistException, IncorrectValueException {
		for (Client baseClient : bank.keySet()) {
			 if(baseClient.equals(compte.getClient())) {
				 
				 for(Compte baseCompte : bank.get(baseClient) ) {
					 if(baseCompte.equals(compte) && baseCompte.isClose() == false) {
						 if(somme > 0) {
							 int valProv = baseCompte.getSolde();
							 int resultat = valProv + somme;
							 baseCompte.setSolde(resultat);
							 return resultat;
						 }else
							 throw new IncorrectValueException("Un probleme avec le montant qui est <= 0 euros");
					 }
				 }
			 }
		 }
		throw new CompteNotExistException("le compte n'existe pas ou est cloturé");
	}

	public int findMoney(Compte compte) throws CompteNotExistException {
		for (Client baseClient : bank.keySet()) {
			 if(baseClient.equals(compte.getClient())) {
				 for(Compte baseCompte : bank.get(baseClient) ) {
					 
					 if(baseCompte.equals(compte) && baseCompte.isClose() == false) {
						 
						return baseCompte.getSolde();
					 }
				 }
			 }
		 }
		throw new CompteNotExistException("le compte n'existe pas ou est cloturé");
	}

	public int removeMoney(Compte compte, int somme) throws CompteNotExistException, IncorrectValueException {
		for (Client baseClient : bank.keySet()) {
			 if(baseClient.equals(compte.getClient())) {
				 for(Compte baseCompte : bank.get(baseClient) ) {
					 if(baseCompte.equals(compte) && baseCompte.isClose() == false) {
						
						 if(somme >0 && (baseCompte.getSolde() - somme) >= 0) {
							 int valProv = baseCompte.getSolde();
							 int resultat = valProv - somme;
							 baseCompte.setSolde(resultat);
							 return resultat;
						 }else
							 throw new IncorrectValueException("Un probleme avec le montant soit > au solde, soit < 0");
					 }
				 }
			 }
		 }
		throw new CompteNotExistException("le compte n'existe pas ou est cloturé");
	}

	public void moveBetweenSameClientCompte(Client client, CompteType typePlus, CompteType typeMoins, int montant)
			throws ClientNotExistException, CompteNotExistException, IncorrectValueException {
		
		Client clientSur = findClient(client.getPrenom(), client.getNom(), client.getDate());
		for (Client baseClient : bank.keySet()) {
			 if(baseClient.equals(clientSur)) {
				 for(Compte baseCompte : bank.get(baseClient)) {
					 if(baseCompte.getType().equals(typeMoins) && baseCompte.isClose() == false) {
						 removeMoney(baseCompte,montant);
					 }
					 
				 }
				 for(Compte baseCompte : bank.get(baseClient) ) {
					 if(baseCompte.getType().equals(typePlus) && baseCompte.isClose() == false) {
						 addMoney(baseCompte,montant);
					 }
				 }
			 }
		 }
	}

	public void moveBetweenDifferentClientCompte(Client clientPlus, Compte comptePlus, Client clientMoins,
			Compte compteMoins, int montant) throws ClientNotExistException, CompteNotExistException,
			IncorrectCompteOwnerException, IncorrectValueException {
		
		Client clientSurPlus = findClient(clientPlus.getPrenom(), clientPlus.getNom(), clientPlus.getDate());
		Client clientSurMoins = findClient(clientMoins.getPrenom(), clientMoins.getNom(), clientMoins.getDate());
		boolean find = false;
		for (Client baseClient : bank.keySet()) {
			 if(baseClient.equals(clientSurMoins)) {
				 for(Compte baseCompte : bank.get(baseClient) ) {
					 if(baseCompte.equals(compteMoins) && baseCompte.isClose() == false) {
						 find = true;
						 removeMoney(baseCompte,montant);
					 }
				 }
				 if(find == false)
				 throw new IncorrectCompteOwnerException("Il semble que vous vous etes trompez dans l'attribution des comptes");
			 }
		 }
		for (Client baseClient : bank.keySet()) {
			 if(baseClient.equals(clientSurPlus)) {
				 for(Compte baseCompte : bank.get(baseClient) ) {
					 if(baseCompte.equals(comptePlus) && baseCompte.isClose() == false) {
						 addMoney(baseCompte,montant);
					 }
					 
				 }
			 }
		 }

	}

	public int closeCompte(Compte compte) throws CompteNotExistException {
		for (Client baseClient : bank.keySet()) {
			 if(baseClient.equals(compte.getClient())) {
				 for(Compte baseCompte : bank.get(baseClient) ) {
					 if(baseCompte.equals(compte) && baseCompte.isClose() == false) {
						 baseCompte.setClose(true);
						return baseCompte.getSolde();
					 }
				 }
			 }
		 }
		throw new CompteNotExistException("le compte n'existe pas ou est cloturé");
	}

	public void removeClient(Client client) throws ClientNotExistException, ClientCompteNotCloseException {
		
		Client clientSur = findClient(client.getPrenom(), client.getNom(), client.getDate());
		
		boolean compteOpen = false;
		for (Compte base : bank.get(clientSur)) {
			 if(base.isClose() == false) {
				 compteOpen = true;
			 }
		 }
		
		if(compteOpen == false) {
			bank.remove(clientSur);
		}else {
	 		 throw new ClientCompteNotCloseException("Au moins un compte du client est ouvert");
		 }
	}

}