package alom.bank.server.main;

import java.util.Calendar;
import java.util.GregorianCalendar;

import alom.bank.server.back.Client;
import alom.bank.server.back.Compte;
import alom.bank.server.back.CompteType;
import alom.bank.server.front.GestionBankImpl;
import alom.bank.server.front.exception.ClientCompteNotCloseException;
import alom.bank.server.front.exception.ClientExistException;
import alom.bank.server.front.exception.ClientNotExistException;
import alom.bank.server.front.exception.CompteNotExistException;
import alom.bank.server.front.exception.CompteTypeExistException;
import alom.bank.server.front.exception.CompteTypeNotExistException;
import alom.bank.server.front.exception.IncorrectCompteOwnerException;
import alom.bank.server.front.exception.IncorrectValueException;

public class Main {
	public static void main(String[] args) throws ClientExistException, ClientNotExistException, 
		CompteTypeNotExistException, CompteTypeExistException, CompteNotExistException, 
		IncorrectValueException, IncorrectCompteOwnerException, ClientCompteNotCloseException {
		
		GestionBankImpl bank = new GestionBankImpl();
		
		//Ajouter client
		Calendar calendar = Calendar.getInstance();
		bank.addClient("Seydou","Dicko",calendar);
		
		//retrouver client
		Client clientA = bank.findClient("Seydou","Dicko",calendar);
		String seydou = clientA.getPrenom();
		System.out.println("Le prenom pour le client A : "+seydou);
		
		//ajouter un compte
		bank.addCompte(clientA, CompteType.CHEQUES);
		
		//recuperer un compte
		Compte compteCHEQUES  = bank.findCompte(clientA, CompteType.CHEQUES);
		
		
		//retrouver solde
		System.out.println("Soldes compte CHEQUES pour le client A : "+bank.findMoney(compteCHEQUES));
		
		//ajouter argent
		bank.addMoney(compteCHEQUES, 150);
		System.out.println("Ajout de 150 euro au compte CHEQUES pour le client A");
		
		//retrouver solde
		System.out.println("Soldes compte CHEQUES pour le client A: "+bank.findMoney(compteCHEQUES));
		
		//ajouter argent
		bank.removeMoney(compteCHEQUES, 60);
		System.out.println("Retrait de 60 euro du compte CHEQUES pour le client A");
		
		//retrouver solde
		System.out.println("Soldes compte CHEQUES pour le client A : "+bank.findMoney(compteCHEQUES));
		
		//ajouter un compte
		bank.addCompte(clientA, CompteType.LIVRET_A);
		System.out.println("Creation d'un compte AUTRE pour le client A");
		
		//recuperer un compte
		Compte compteAUTRE  = bank.findCompte(clientA, CompteType.LIVRET_A);
		
		//retrouver solde
		System.out.println("Soldes compte AUTRE pour le client A : "+bank.findMoney(compteAUTRE));
		
		//transfert entre compte meme client
		bank.moveBetweenSameClientCompte(clientA, CompteType.LIVRET_A, CompteType.CHEQUES, 25);
		System.out.println("Transfert de 25 euro du compte CHEQUES au compte AUTRE pour le client A");
		
		
		//retrouver solde
		System.out.println("Soldes compte AUTRE pour le client A : "+bank.findMoney(compteAUTRE));
		
		//retrouver solde
		System.out.println("Soldes compte CHEQUES pour le client A : "+bank.findMoney(compteCHEQUES));
				
		
		//Ajouter client
		 Calendar calendar2 = new GregorianCalendar(2013,0,31);
		bank.addClient("Mohamed","Dicko",calendar2);
		
		//retrouver client
		Client clientB = bank.findClient("Mohamed","Dicko",calendar2);
		String mohamed = clientB.getPrenom();
		System.out.println("Le prenom pour le client B : "+mohamed);
		
		//ajouter un compte
		bank.addCompte(clientB, CompteType.CHEQUES);
		
		//recuperer un compte
		Compte compteCHEQUESB  = bank.findCompte(clientB, CompteType.CHEQUES);
		
		
		//retrouver solde
		System.out.println("Soldes compte CHEQUES pour le client B : "+bank.findMoney(compteCHEQUESB));
		
		
		//transfert entre compte meme client
		bank.moveBetweenDifferentClientCompte(clientB, compteCHEQUESB, clientA, compteCHEQUES, 10);
		System.out.println("Transfert de 10 euro du compte CHEQUES du client A au compte CHEQUES pour le client B");
		
		//retrouver solde
		System.out.println("Soldes compte CHEQUES pour le client A : "+bank.findMoney(compteCHEQUES));
		
		//retrouver solde
		System.out.println("Soldes compte CHEQUES pour le client B : "+bank.findMoney(compteCHEQUESB) + " status close :"+compteCHEQUESB.isClose());
		
		
		//cloture du compte
		bank.closeCompte(compteCHEQUESB);	
		System.out.println("Cloture du compte CHEQUES pour le client B");
		
		//suppression d'un compte
		bank.removeClient(clientB);
		System.out.println("Suppression du client B");
		
		//retrouver solde
		System.out.println("Soldes compte CHEQUES pour le client B : "+bank.findMoney(compteCHEQUESB));
		
		
	}
}