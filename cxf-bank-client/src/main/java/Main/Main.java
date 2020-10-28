package Main;

import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import alom.bank.client.Client;
import alom.bank.client.ClientCompteNotCloseException_Exception;
import alom.bank.client.ClientExistException_Exception;
import alom.bank.client.ClientNotExistException_Exception;
import alom.bank.client.CompteNotExistException_Exception;
import alom.bank.client.CompteType;
import alom.bank.client.CompteTypeExistException_Exception;
import alom.bank.client.CompteTypeNotExistException_Exception;
import alom.bank.client.GestionBank;
import alom.bank.client.GestionBankImplService;
import alom.bank.client.IncorrectCompteOwnerException_Exception;
import alom.bank.client.IncorrectValueException_Exception;


public class Main {

		    private Main() {
		    }
		    
		    public static BankServiceClient service;
			public static GestionBankImplService implService;
			public static GestionBank port;

		    public static void main(String args[]) throws java.lang.Exception {
		     
		        service = new BankServiceClient(5000, 5000);
				implService = new GestionBankImplService();
				port = implService.getGestionBankImplPort();
		        
		        GregorianCalendar c = new GregorianCalendar();
		        c.setTime(new Date());
		        XMLGregorianCalendar xmlDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
		        
		        alom.bank.client.Client clientA = null;
		        alom.bank.client.Client clientB = null;
		        CompteType cheques = CompteType.CHEQUES;
		        CompteType autre = CompteType.LIVRET_A;
		        CompteType livretJaune = CompteType.LIVRET_JEUNE;
		        alom.bank.client.Compte compteChequesA = null;
		        alom.bank.client.Compte compteAutreA = null;
		        alom.bank.client.Compte compteChequesB = null;
		        
		        {
		            System.out.println("Procedure d'ajout d'un client ...");
		            java.lang.String _addClient_prenom = "Seydou Salia";
		            java.lang.String _addClient_nom = "Dicko";
		            javax.xml.datatype.XMLGregorianCalendar _addClient_date = xmlDate;
		            try {
		                alom.bank.client.Client _addClient__return = port.addClient(_addClient_prenom, _addClient_nom, _addClient_date);
		                System.out.println("Le prenom pour le client A : " + _addClient__return.getPrenom());
		                
		            } catch (ClientExistException_Exception e) {
		                System.out.println("Expected exception: ClientExistException has occurred.");
		                System.out.println(e.toString());
		            }
		            System.out.println(".............................................................................");

		                }
		        
		        {

		            System.out.println("Recuperation du client A ...");
		            java.lang.String _findClient_prenom = "Seydou Salia";
		            java.lang.String _findClient_nom = "Dicko";
		            javax.xml.datatype.XMLGregorianCalendar _findClient_date = xmlDate;
		            try {
		                alom.bank.client.Client _findClient__return = port.findClient(_findClient_prenom, _findClient_nom, _findClient_date);
		                System.out.println("Le client A à pour nom : " + _findClient__return.getNom());
		                clientA = _findClient__return;

		            } catch (ClientNotExistException_Exception e) {
		                System.out.println("Expected exception: ClientNotExistException has occurred.");
		                System.out.println(e.toString());
		            }
		            System.out.println(".............................................................................");
		        }
		        
		        {
		            System.out.println("Ajout d'un compte de type CHEQUES pour le client A ...");
		            alom.bank.client.Client _addCompte_client = clientA;
		            CompteType _addCompte_type = cheques;
		            try {
		                alom.bank.client.Compte _addCompte__return = port.addCompte(_addCompte_client, _addCompte_type);
		                System.out.println("Le client A à un compte de type : " + _addCompte__return.getType());
		                
		            } catch (CompteTypeNotExistException_Exception e) {
		                System.out.println("Expected exception: CompteTypeNotExistException has occurred.");
		                System.out.println(e.toString());
		            } catch (ClientNotExistException_Exception e) {
		                System.out.println("Expected exception: ClientNotExistException has occurred.");
		                System.out.println(e.toString());
		            } catch (CompteTypeExistException_Exception e) {
		                System.out.println("Expected exception: CompteTypeExistException has occurred.");
		                System.out.println(e.toString());
		            }
		            System.out.println(".............................................................................");

		             }
		        
		        {
		            System.out.println("Recuperation du compte CHEQUES du client A ...");
		            alom.bank.client.Client _findCompte_client = clientA;
		            CompteType _findCompte_type = cheques;
		            try {
		                alom.bank.client.Compte _findCompte__return = port.findCompte(_findCompte_client, _findCompte_type);
		                System.out.println("Le type du compte du client A est : " + _findCompte__return.getType());
		                compteChequesA = _findCompte__return;

		            } catch (CompteTypeNotExistException_Exception e) {
		                System.out.println("Expected exception: CompteTypeNotExistException has occurred.");
		                System.out.println(e.toString());
		            } catch (ClientNotExistException_Exception e) {
		                System.out.println("Expected exception: ClientNotExistException has occurred.");
		                System.out.println(e.toString());
		            } catch (CompteNotExistException_Exception e) {
		                System.out.println("Expected exception: CompteNotExistException has occurred.");
		                System.out.println(e.toString());
		            }
		            System.out.println(".............................................................................");

		                }
		        
		        
		        {
		            System.out.println("Recuperation du solde du compte CHEQUES du client A");
		            alom.bank.client.Compte _findMoney_compte = compteChequesA;
		            try {
		                int _findMoney__return = port.findMoney(_findMoney_compte);
		                System.out.println("Soldes compte CHEQUES pour le client A : " + _findMoney__return);

		            } catch (CompteNotExistException_Exception e) {
		                System.out.println("Expected exception: CompteNotExistException has occurred.");
		                System.out.println(e.toString());
		            }
		            System.out.println(".............................................................................");

		                }
		        
		        
		        {
		            System.out.println("Precedure d'ajout sur le compte CHEQUES du client A");
		            alom.bank.client.Compte _addMoney_compte = compteChequesA;
		            int _addMoney_somme = 150;
		            try {
		                int _addMoney__return = port.addMoney(_addMoney_compte, _addMoney_somme);
		                System.out.println("Ajout de "+_addMoney__return+" euro au compte CHEQUES pour le client A");

		            } catch (IncorrectValueException_Exception e) {
		                System.out.println("Expected exception: IncorrectValueException has occurred.");
		                System.out.println(e.toString());
		            } catch (CompteNotExistException_Exception e) {
		                System.out.println("Expected exception: CompteNotExistException has occurred.");
		                System.out.println(e.toString());
		            }
		            System.out.println(".............................................................................");

		                }
		        {
		            
		            alom.bank.client.Client _findCompte_client = clientA;
		            CompteType _findCompte_type = cheques;
		            try {
		                alom.bank.client.Compte _findCompte__return = port.findCompte(_findCompte_client, _findCompte_type);
		               
		                compteChequesA = _findCompte__return;
		                

		            } catch (CompteTypeNotExistException_Exception e) {
		                System.out.println("Expected exception: CompteTypeNotExistException has occurred.");
		                System.out.println(e.toString());
		            } catch (ClientNotExistException_Exception e) {
		                System.out.println("Expected exception: ClientNotExistException has occurred.");
		                System.out.println(e.toString());
		            } catch (CompteNotExistException_Exception e) {
		                System.out.println("Expected exception: CompteNotExistException has occurred.");
		                System.out.println(e.toString());
		            }

		                }
		        
		        
		        {
		            System.out.println("Recuperation du solde du compte CHEQUES du client A");
		            alom.bank.client.Compte _findMoney_compte = compteChequesA;
		            try {
		                int _findMoney__return = port.findMoney(_findMoney_compte);
		                System.out.println("Soldes compte CHEQUES pour le client A : " + _findMoney__return);

		            } catch (CompteNotExistException_Exception e) {
		                System.out.println("Expected exception: CompteNotExistException has occurred.");
		                System.out.println(e.toString());
		            }
		            System.out.println(".............................................................................");

		                }
		        
		        
		        {
		            System.out.println("Retrait d'une somme sur le compte CHEQUES du client A ...");
		            alom.bank.client.Compte _removeMoney_compte = compteChequesA;
		            int _removeMoney_somme = 60;
		            try {
		                int _removeMoney__return = port.removeMoney(_removeMoney_compte, _removeMoney_somme);
		                System.out.println("Retrait de "+_removeMoney_somme+" euro du compte CHEQUES pour le client A");
		            } catch (IncorrectValueException_Exception e) {
		                System.out.println("Expected exception: IncorrectValueException has occurred.");
		                System.out.println(e.toString());
		            } catch (CompteNotExistException_Exception e) {
		                System.out.println("Expected exception: CompteNotExistException has occurred.");
		                System.out.println(e.toString());
		            }
		            System.out.println(".............................................................................");

		                }
		        
		        { 
		            
		            alom.bank.client.Client _findCompte_client = clientA;
		            CompteType _findCompte_type = cheques;
		            try {
		                alom.bank.client.Compte _findCompte__return = port.findCompte(_findCompte_client, _findCompte_type);
		               
		                compteChequesA = _findCompte__return;
		                

		            } catch (CompteTypeNotExistException_Exception e) {
		                System.out.println("Expected exception: CompteTypeNotExistException has occurred.");
		                System.out.println(e.toString());
		            } catch (ClientNotExistException_Exception e) {
		                System.out.println("Expected exception: ClientNotExistException has occurred.");
		                System.out.println(e.toString());
		            } catch (CompteNotExistException_Exception e) {
		                System.out.println("Expected exception: CompteNotExistException has occurred.");
		                System.out.println(e.toString());
		            }

		                }
		        
		        
		        {
		            System.out.println("Recuperation du solde du compte CHEQUES du client A ...");
		            alom.bank.client.Compte _findMoney_compte = compteChequesA;
		            try {
		                int _findMoney__return = port.findMoney(_findMoney_compte);
		                System.out.println("Soldes compte CHEQUES pour le client A : " + _findMoney__return);
		            } catch (CompteNotExistException_Exception e) {
		                System.out.println("Expected exception: CompteNotExistException has occurred.");
		                System.out.println(e.toString());
		            }
		            System.out.println(".............................................................................");

		                }
		        
		        
		        {
		            System.out.println("Ajout d'un compte de type AUTRE pour le client A ...");
		            alom.bank.client.Client _addCompte_client = clientA;
		            CompteType _addCompte_type = autre;
		            try {
		                alom.bank.client.Compte _addCompte__return = port.addCompte(_addCompte_client, _addCompte_type);
		                System.out.println("Le client A à un compte de type : " + _addCompte__return.getType());
		            } catch (CompteTypeNotExistException_Exception e) {
		                System.out.println("Expected exception: CompteTypeNotExistException has occurred.");
		                System.out.println(e.toString());
		            } catch (ClientNotExistException_Exception e) {
		                System.out.println("Expected exception: ClientNotExistException has occurred.");
		                System.out.println(e.toString());
		            } catch (CompteTypeExistException_Exception e) {
		                System.out.println("Expected exception: CompteTypeExistException has occurred.");
		                System.out.println(e.toString());
		            }
		            System.out.println(".............................................................................");

		             }
		        
		        {
		            System.out.println("Recuperation du compte AUTRE du client A ...");
		            alom.bank.client.Client _findCompte_client = clientA;
		            CompteType _findCompte_type = autre;
		            try {
		                alom.bank.client.Compte _findCompte__return = port.findCompte(_findCompte_client, _findCompte_type);
		                System.out.println("Le type du compte du client A est : " + _findCompte__return.getType());
		                compteAutreA = _findCompte__return;
		            } catch (CompteTypeNotExistException_Exception e) {
		                System.out.println("Expected exception: CompteTypeNotExistException has occurred.");
		                System.out.println(e.toString());
		            } catch (ClientNotExistException_Exception e) {
		                System.out.println("Expected exception: ClientNotExistException has occurred.");
		                System.out.println(e.toString());
		            } catch (CompteNotExistException_Exception e) {
		                System.out.println("Expected exception: CompteNotExistException has occurred.");
		                System.out.println(e.toString());
		            }
		            System.out.println(".............................................................................");

		                }
		        
		        {
		            System.out.println("Recuperation du solde du compte AUTRE du client A");
		            alom.bank.client.Compte _findMoney_compte = compteAutreA;
		            try {
		                int _findMoney__return = port.findMoney(_findMoney_compte);
		                System.out.println("Soldes compte AUTRE pour le client A : " + _findMoney__return);

		            } catch (CompteNotExistException_Exception e) {
		                System.out.println("Expected exception: CompteNotExistException has occurred.");
		                System.out.println(e.toString());
		            }
		            System.out.println(".............................................................................");

		                }
		        
		        {
		            System.out.println("Procedure de transfert d'argent entre le compte AUTRE et CHEQUES du client A ...");
		            alom.bank.client.Client _moveBetweenSameClientCompte_client = clientA;
		            CompteType _moveBetweenSameClientCompte_typePlus = autre;
		            CompteType _moveBetweenSameClientCompte_typeMoins = cheques;
		            int _moveBetweenSameClientCompte_montant = 25;
		            try {
		                port.moveBetweenSameClientCompte(_moveBetweenSameClientCompte_client, _moveBetweenSameClientCompte_typePlus, _moveBetweenSameClientCompte_typeMoins, _moveBetweenSameClientCompte_montant);
		                System.out.println("Transfert de "+_moveBetweenSameClientCompte_montant+" euro du compte CHEQUES au compte AUTRE pour le client A");
		            } catch (IncorrectValueException_Exception e) {
		                System.out.println("Expected exception: IncorrectValueException has occurred.");
		                System.out.println(e.toString());
		            } catch (CompteTypeNotExistException_Exception e) {
		                System.out.println("Expected exception: CompteTypeNotExistException has occurred.");
		                System.out.println(e.toString());
		            } catch (ClientNotExistException_Exception e) {
		                System.out.println("Expected exception: ClientNotExistException has occurred.");
		                System.out.println(e.toString());
		            } catch (CompteNotExistException_Exception e) {
		                System.out.println("Expected exception: CompteNotExistException has occurred.");
		                System.out.println(e.toString());
		            }
		            System.out.println(".............................................................................");
		        }
		        
		        {
		            alom.bank.client.Client _findCompte_client = clientA;
		            CompteType _findCompte_type = autre;
		            try {
		                alom.bank.client.Compte _findCompte__return = port.findCompte(_findCompte_client, _findCompte_type);
		                compteAutreA = _findCompte__return;
		            } catch (CompteTypeNotExistException_Exception e) {
		                System.out.println("Expected exception: CompteTypeNotExistException has occurred.");
		                System.out.println(e.toString());
		            } catch (ClientNotExistException_Exception e) {
		                System.out.println("Expected exception: ClientNotExistException has occurred.");
		                System.out.println(e.toString());
		            } catch (CompteNotExistException_Exception e) {
		                System.out.println("Expected exception: CompteNotExistException has occurred.");
		                System.out.println(e.toString());
		            }

		                }
		        
		        {
		            System.out.println("Recuperation du solde du compte AUTRE du client A");
		            alom.bank.client.Compte _findMoney_compte = compteAutreA;
		            try {
		                int _findMoney__return = port.findMoney(_findMoney_compte);
		                System.out.println("Soldes compte AUTRE pour le client A : " + _findMoney__return);

		            } catch (CompteNotExistException_Exception e) {
		                System.out.println("Expected exception: CompteNotExistException has occurred.");
		                System.out.println(e.toString());
		            }
		            System.out.println(".............................................................................");

		                }
		        

		        { 
		            
		            alom.bank.client.Client _findCompte_client = clientA;
		            CompteType _findCompte_type = cheques;
		            try {
		                alom.bank.client.Compte _findCompte__return = port.findCompte(_findCompte_client, _findCompte_type);
		               
		                compteChequesA = _findCompte__return;
		                

		            } catch (CompteTypeNotExistException_Exception e) {
		                System.out.println("Expected exception: CompteTypeNotExistException has occurred.");
		                System.out.println(e.toString());
		            } catch (ClientNotExistException_Exception e) {
		                System.out.println("Expected exception: ClientNotExistException has occurred.");
		                System.out.println(e.toString());
		            } catch (CompteNotExistException_Exception e) {
		                System.out.println("Expected exception: CompteNotExistException has occurred.");
		                System.out.println(e.toString());
		            }

		                }
		        
		        {
		            System.out.println("Recuperation du solde du compte CHEQUES du client A ...");
		            alom.bank.client.Compte _findMoney_compte = compteChequesA;
		            try {
		                int _findMoney__return = port.findMoney(_findMoney_compte);
		                System.out.println("Soldes compte CHEQUES pour le client A : " + _findMoney__return);
		            } catch (CompteNotExistException_Exception e) {
		                System.out.println("Expected exception: CompteNotExistException has occurred.");
		                System.out.println(e.toString());
		            }
		            System.out.println(".............................................................................");

		        }	
		        
		        {
		            System.out.println("Procedure d'ajout d'un client B ...");
		            java.lang.String _addClient_prenom = "Gilles";
		            java.lang.String _addClient_nom = "Charles";
		            javax.xml.datatype.XMLGregorianCalendar _addClient_date = xmlDate;
		            try {
		                alom.bank.client.Client _addClient__return = port.addClient(_addClient_prenom, _addClient_nom, _addClient_date);
		                System.out.println("Le prenom pour le client B : " + _addClient__return.getPrenom());
		                
		            } catch (ClientExistException_Exception e) {
		                System.out.println("Expected exception: ClientExistException has occurred.");
		                System.out.println(e.toString());
		            }
		            System.out.println(".............................................................................");
		       }
		        
		        {

		            System.out.println("Recuperation du client B ...");
		            java.lang.String _findClient_prenom = "Gilles";
		            java.lang.String _findClient_nom = "Charles";
		            javax.xml.datatype.XMLGregorianCalendar _findClient_date = xmlDate;
		            try {
		                alom.bank.client.Client _findClient__return = port.findClient(_findClient_prenom, _findClient_nom, _findClient_date);
		                System.out.println("Le client B à pour nom : " + _findClient__return.getNom());
		                clientB = _findClient__return;

		            } catch (ClientNotExistException_Exception e) {
		                System.out.println("Expected exception: ClientNotExistException has occurred.");
		                System.out.println(e.toString());
		            }
		            System.out.println(".............................................................................");
		        }
		        
		        {
		            System.out.println("Ajout d'un compte de type CHEQUES pour le client B ...");
		            alom.bank.client.Client _addCompte_client = clientB;
		            CompteType _addCompte_type = cheques;
		            try {
		                alom.bank.client.Compte _addCompte__return = port.addCompte(_addCompte_client, _addCompte_type);
		                System.out.println("Le client B à un compte de type : " + _addCompte__return.getType());
		                
		            } catch (CompteTypeNotExistException_Exception e) {
		                System.out.println("Expected exception: CompteTypeNotExistException has occurred.");
		                System.out.println(e.toString());
		            } catch (ClientNotExistException_Exception e) {
		                System.out.println("Expected exception: ClientNotExistException has occurred.");
		                System.out.println(e.toString());
		            } catch (CompteTypeExistException_Exception e) {
		                System.out.println("Expected exception: CompteTypeExistException has occurred.");
		                System.out.println(e.toString());
		            }
		            System.out.println(".............................................................................");

		             }
		        {
		            System.out.println("Recuperation du compte CHEQUES du client B ...");
		            alom.bank.client.Client _findCompte_client = clientB;
		            CompteType _findCompte_type = cheques;
		            try {
		                alom.bank.client.Compte _findCompte__return = port.findCompte(_findCompte_client, _findCompte_type);
		                System.out.println("Le type du compte du client B est : " + _findCompte__return.getType());
		                compteChequesB = _findCompte__return;

		            } catch (CompteTypeNotExistException_Exception e) {
		                System.out.println("Expected exception: CompteTypeNotExistException has occurred.");
		                System.out.println(e.toString());
		            } catch (ClientNotExistException_Exception e) {
		                System.out.println("Expected exception: ClientNotExistException has occurred.");
		                System.out.println(e.toString());
		            } catch (CompteNotExistException_Exception e) {
		                System.out.println("Expected exception: CompteNotExistException has occurred.");
		                System.out.println(e.toString());
		            }
		            System.out.println(".............................................................................");

		                }
		        
		        {
		            System.out.println("Recuperation du solde du compte CHEQUES du client B ...");
		            alom.bank.client.Compte _findMoney_compte = compteChequesB;
		            try {
		                int _findMoney__return = port.findMoney(_findMoney_compte);
		                System.out.println("Soldes compte CHEQUES pour le client B : " + _findMoney__return);
		            } catch (CompteNotExistException_Exception e) {
		                System.out.println("Expected exception: CompteNotExistException has occurred.");
		                System.out.println(e.toString());
		            }
		            System.out.println(".............................................................................");

		        }	
		        
		        {
		            System.out.println("Procedure de transfert d'argent entre le compte CHEQUES du client A et CHEQUES du client B ...");
		            alom.bank.client.Client _moveBetweenDifferentClientCompte_clientPlus = clientB;
		            alom.bank.client.Compte _moveBetweenDifferentClientCompte_comptePlus = compteChequesB;
		            alom.bank.client.Client _moveBetweenDifferentClientCompte_clientMoins =clientA;
		            alom.bank.client.Compte _moveBetweenDifferentClientCompte_compteMoins = compteChequesA;
		            int _moveBetweenDifferentClientCompte_montant = 10;
		            try {
		                port.moveBetweenDifferentClientCompte(_moveBetweenDifferentClientCompte_clientPlus, _moveBetweenDifferentClientCompte_comptePlus, _moveBetweenDifferentClientCompte_clientMoins, _moveBetweenDifferentClientCompte_compteMoins, _moveBetweenDifferentClientCompte_montant);

		            } catch (IncorrectValueException_Exception e) {
		                System.out.println("Expected exception: IncorrectValueException has occurred.");
		                System.out.println(e.toString());
		            } catch (IncorrectCompteOwnerException_Exception e) {
		                System.out.println("Expected exception: IncorrectCompteOwnerException has occurred.");
		                System.out.println(e.toString());
		            } catch (ClientNotExistException_Exception e) {
		                System.out.println("Expected exception: ClientNotExistException has occurred.");
		                System.out.println(e.toString());
		            } catch (CompteNotExistException_Exception e) {
		                System.out.println("Expected exception: CompteNotExistException has occurred.");
		                System.out.println(e.toString());
		            }
		            System.out.println(".............................................................................");

		                }
		        
		        { 
		            
		            alom.bank.client.Client _findCompte_client = clientA;
		            CompteType _findCompte_type = cheques;
		            try {
		                alom.bank.client.Compte _findCompte__return = port.findCompte(_findCompte_client, _findCompte_type);
		               
		                compteChequesA = _findCompte__return;
		                

		            } catch (CompteTypeNotExistException_Exception e) {
		                System.out.println("Expected exception: CompteTypeNotExistException has occurred.");
		                System.out.println(e.toString());
		            } catch (ClientNotExistException_Exception e) {
		                System.out.println("Expected exception: ClientNotExistException has occurred.");
		                System.out.println(e.toString());
		            } catch (CompteNotExistException_Exception e) {
		                System.out.println("Expected exception: CompteNotExistException has occurred.");
		                System.out.println(e.toString());
		            }

		                }
		        
		        {
		            System.out.println("Recuperation du solde du compte CHEQUES du client A ...");
		            alom.bank.client.Compte _findMoney_compte = compteChequesA;
		            try {
		                int _findMoney__return = port.findMoney(_findMoney_compte);
		                System.out.println("Soldes compte CHEQUES pour le client A : " + _findMoney__return);
		            } catch (CompteNotExistException_Exception e) {
		                System.out.println("Expected exception: CompteNotExistException has occurred.");
		                System.out.println(e.toString());
		            }
		            System.out.println(".............................................................................");

		        }	
		        
	        {
	            alom.bank.client.Client _findCompte_client = clientB;
	            CompteType _findCompte_type = cheques;
	            try {
	                alom.bank.client.Compte _findCompte__return = port.findCompte(_findCompte_client, _findCompte_type);
	                compteChequesB = _findCompte__return;
	            } catch (CompteTypeNotExistException_Exception e) {
	                System.out.println("Expected exception: CompteTypeNotExistException has occurred.");
	                System.out.println(e.toString());
	            } catch (ClientNotExistException_Exception e) {
	                System.out.println("Expected exception: ClientNotExistException has occurred.");
	                System.out.println(e.toString());
	            } catch (CompteNotExistException_Exception e) {
	                System.out.println("Expected exception: CompteNotExistException has occurred.");
	                System.out.println(e.toString());
	            }

	                }
		        
	        {
	            System.out.println("Recuperation du solde du compte CHEQUES du client B ...");
	            alom.bank.client.Compte _findMoney_compte = compteChequesB;
	            try {
	                int _findMoney__return = port.findMoney(_findMoney_compte);
	                System.out.println("Soldes compte CHEQUES pour le client B : " + _findMoney__return);
	            } catch (CompteNotExistException_Exception e) {
	                System.out.println("Expected exception: CompteNotExistException has occurred.");
	                System.out.println(e.toString());
	            }
	            System.out.println(".............................................................................");

	        }	
	        
	        	        
	        {
	            System.out.println("Procedure d'ajout d'un client deja existant ...");
	            java.lang.String _addClient_prenom = "Seydou Salia";
	            java.lang.String _addClient_nom = "Dicko";
	            javax.xml.datatype.XMLGregorianCalendar _addClient_date = xmlDate;
	            try {
	                alom.bank.client.Client _addClient__return = port.addClient(_addClient_prenom, _addClient_nom, _addClient_date);
	                System.out.println("Le prenom pour le client A : " + _addClient__return.getPrenom());
	                
	            } catch (ClientExistException_Exception e) {
	                System.out.println("Expected exception: ClientExistException has occurred.");
	                System.out.println(e.toString());
	            }
	            System.out.println(".............................................................................");

	                }
	        
	        {

	            System.out.println("Recuperation d'un client qui n'existe pas ...");
	            java.lang.String _findClient_prenom = "Seydou Salia";
	            java.lang.String _findClient_nom = "DuPont";
	            javax.xml.datatype.XMLGregorianCalendar _findClient_date = xmlDate;
	            try {
	                alom.bank.client.Client _findClient__return = port.findClient(_findClient_prenom, _findClient_nom, _findClient_date);
	                System.out.println("Le client A à pour nom : " + _findClient__return.getNom());
	                clientA = _findClient__return;

	            } catch (ClientNotExistException_Exception e) {
	                System.out.println("Expected exception: ClientNotExistException has occurred.");
	                System.out.println(e.toString());
	            }
	            System.out.println(".............................................................................");
	        }
	        
	        {
	            System.out.println("Ajout d'un compte de type CHEQUES pour un client qui n'existe pas...");
	            alom.bank.client.Client _addCompte_client = new Client();
	            CompteType _addCompte_type = cheques;
	            try {
	                alom.bank.client.Compte _addCompte__return = port.addCompte(_addCompte_client, _addCompte_type);
	                System.out.println("Le client A à un compte de type : " + _addCompte__return.getType());
	                
	            } catch (CompteTypeNotExistException_Exception e) {
	                System.out.println("Expected exception: CompteTypeNotExistException has occurred.");
	                System.out.println(e.toString());
	            } catch (ClientNotExistException_Exception e) {
	                System.out.println("Expected exception: ClientNotExistException has occurred.");
	                System.out.println(e.toString());
	            } catch (CompteTypeExistException_Exception e) {
	                System.out.println("Expected exception: CompteTypeExistException has occurred.");
	                System.out.println(e.toString());
	            }
	            System.out.println(".............................................................................");

	             }
	        {
	            System.out.println("Ajout d'un compte de type CHEQUES pour le client A qui en possede deja un ...");
	            alom.bank.client.Client _addCompte_client = clientA;
	            CompteType _addCompte_type = cheques;
	            try {
	                alom.bank.client.Compte _addCompte__return = port.addCompte(_addCompte_client, _addCompte_type);
	                System.out.println("Le client A à un compte de type : " + _addCompte__return.getType());
	                
	            } catch (CompteTypeNotExistException_Exception e) {
	                System.out.println("Expected exception: CompteTypeNotExistException has occurred.");
	                System.out.println(e.toString());
	            } catch (ClientNotExistException_Exception e) {
	                System.out.println("Expected exception: ClientNotExistException has occurred.");
	                System.out.println(e.toString());
	            } catch (CompteTypeExistException_Exception e) {
	                System.out.println("Expected exception: CompteTypeExistException has occurred.");
	                System.out.println(e.toString());
	            }
	            System.out.println(".............................................................................");

	             }
	        
	        {
	            System.out.println("Recuperation du compte LIVRET_JEUNE qui n'existe pas pour le client A...");
	            alom.bank.client.Client _findCompte_client = clientA;
	            CompteType _findCompte_type = livretJaune;
	            try {
	                alom.bank.client.Compte _findCompte__return = port.findCompte(_findCompte_client, _findCompte_type);
	                System.out.println("Le type du compte du client A est : " + _findCompte__return.getType());
	                compteChequesA = _findCompte__return;

	            } catch (CompteTypeNotExistException_Exception e) {
	                System.out.println("Expected exception: CompteTypeNotExistException has occurred.");
	                System.out.println(e.toString());
	            } catch (ClientNotExistException_Exception e) {
	                System.out.println("Expected exception: ClientNotExistException has occurred.");
	                System.out.println(e.toString());
	            } catch (CompteNotExistException_Exception e) {
	                System.out.println("Expected exception: CompteNotExistException has occurred.");
	                System.out.println(e.toString());
	            }
	            System.out.println(".............................................................................");

	                }
	        
	        {
	            System.out.println("Procedure d'ajout sur le compte CHEQUES du client A avec un montant negatif");
	            alom.bank.client.Compte _addMoney_compte = compteChequesA;
	            int _addMoney_somme = -50;
	            try {
	                int _addMoney__return = port.addMoney(_addMoney_compte, _addMoney_somme);
	                System.out.println("Ajout de "+_addMoney__return+" euro au compte CHEQUES pour le client A");

	            } catch (IncorrectValueException_Exception e) {
	                System.out.println("Expected exception: IncorrectValueException has occurred.");
	                System.out.println(e.toString());
	            } catch (CompteNotExistException_Exception e) {
	                System.out.println("Expected exception: CompteNotExistException has occurred.");
	                System.out.println(e.toString());
	            }
	            System.out.println(".............................................................................");

	                }
	        
	        {
	            System.out.println("Retrait d'une somme sur le compte CHEQUES du client A  avec un montant negatif...");
	            alom.bank.client.Compte _removeMoney_compte = compteChequesA;
	            int _removeMoney_somme = -10;
	            try {
	                int _removeMoney__return = port.removeMoney(_removeMoney_compte, _removeMoney_somme);
	                System.out.println("Retrait de "+_removeMoney_somme+" euro du compte CHEQUES pour le client A");
	            } catch (IncorrectValueException_Exception e) {
	                System.out.println("Expected exception: IncorrectValueException has occurred.");
	                System.out.println(e.toString());
	            } catch (CompteNotExistException_Exception e) {
	                System.out.println("Expected exception: CompteNotExistException has occurred.");
	                System.out.println(e.toString());
	            }
	            System.out.println(".............................................................................");

	                }
	        {
	            System.out.println("Retrait d'une somme sur le compte CHEQUES du client A  avec un montant superieur au solde...");
	            alom.bank.client.Compte _removeMoney_compte = compteChequesA;
	            int _removeMoney_somme = 500;
	            try {
	                int _removeMoney__return = port.removeMoney(_removeMoney_compte, _removeMoney_somme);
	                System.out.println("Retrait de "+_removeMoney_somme+" euro du compte CHEQUES pour le client A");
	            } catch (IncorrectValueException_Exception e) {
	                System.out.println("Expected exception: IncorrectValueException has occurred.");
	                System.out.println(e.toString());
	            } catch (CompteNotExistException_Exception e) {
	                System.out.println("Expected exception: CompteNotExistException has occurred.");
	                System.out.println(e.toString());
	            }
	            System.out.println(".............................................................................");

	                }

	        
	        {
	            System.out.println("Cloture du compte CHEQUES pour le client A ...");
	            alom.bank.client.Compte _closeCompte_compte = compteChequesA;
	            try {
	                int _closeCompte__return = port.closeCompte(_closeCompte_compte);
	                System.out.println("Soldes compte CHEQUES pour le client A avant cloture est : " + _closeCompte__return);
	            } catch (CompteNotExistException_Exception e) {
	                System.out.println("Expected exception: CompteNotExistException has occurred.");
	                System.out.println(e.toString());
	            }
	            System.out.println(".............................................................................");

	                }
	        
	        {
	            System.out.println("Procedure de transfert d'argent entre le compte AUTRE et CHEQUES du client A après la cloture de son compte CHEQUES...");
	            alom.bank.client.Client _moveBetweenSameClientCompte_client = clientA;
	            CompteType _moveBetweenSameClientCompte_typePlus = autre;
	            CompteType _moveBetweenSameClientCompte_typeMoins = cheques;
	            int _moveBetweenSameClientCompte_montant = 25;
	            try {
	                port.moveBetweenSameClientCompte(_moveBetweenSameClientCompte_client, _moveBetweenSameClientCompte_typePlus, _moveBetweenSameClientCompte_typeMoins, _moveBetweenSameClientCompte_montant);
	                System.out.println("Transfert de "+_moveBetweenSameClientCompte_montant+" euro du compte CHEQUES au compte AUTRE pour le client A");
	            } catch (IncorrectValueException_Exception e) {
	                System.out.println("Expected exception: IncorrectValueException has occurred.");
	                System.out.println(e.toString());
	            } catch (CompteTypeNotExistException_Exception e) {
	                System.out.println("Expected exception: CompteTypeNotExistException has occurred.");
	                System.out.println(e.toString());
	            } catch (ClientNotExistException_Exception e) {
	                System.out.println("Expected exception: ClientNotExistException has occurred.");
	                System.out.println(e.toString());
	            } catch (CompteNotExistException_Exception e) {
	                System.out.println("Expected exception: CompteNotExistException has occurred.");
	                System.out.println(e.toString());
	            }
	            System.out.println(".............................................................................");
	        }
	        
	        {
	            System.out.println("Procedure de transfert d'argent entre le compte CHEQUES du client A et CHEQUES du client B  après cloture du compte CHEQUES de A...");
	            alom.bank.client.Client _moveBetweenDifferentClientCompte_clientPlus = clientB;
	            alom.bank.client.Compte _moveBetweenDifferentClientCompte_comptePlus = compteChequesB;
	            alom.bank.client.Client _moveBetweenDifferentClientCompte_clientMoins =clientA;
	            alom.bank.client.Compte _moveBetweenDifferentClientCompte_compteMoins = compteChequesA;
	            int _moveBetweenDifferentClientCompte_montant = 10;
	            try {
	                port.moveBetweenDifferentClientCompte(_moveBetweenDifferentClientCompte_clientPlus, _moveBetweenDifferentClientCompte_comptePlus, _moveBetweenDifferentClientCompte_clientMoins, _moveBetweenDifferentClientCompte_compteMoins, _moveBetweenDifferentClientCompte_montant);

	            } catch (IncorrectValueException_Exception e) {
	                System.out.println("Expected exception: IncorrectValueException has occurred.");
	                System.out.println(e.toString());
	            } catch (IncorrectCompteOwnerException_Exception e) {
	                System.out.println("Expected exception: IncorrectCompteOwnerException has occurred.");
	                System.out.println(e.toString());
	            } catch (ClientNotExistException_Exception e) {
	                System.out.println("Expected exception: ClientNotExistException has occurred.");
	                System.out.println(e.toString());
	            } catch (CompteNotExistException_Exception e) {
	                System.out.println("Expected exception: CompteNotExistException has occurred.");
	                System.out.println(e.toString());
	            }
	            System.out.println(".............................................................................");

	                }
	        
	        
	        {
	            System.out.println("Suppression du client A alors que son compte AUTRE existe ...");
	            alom.bank.client.Client _removeClient_client =  clientA;
	            try {
	                port.removeClient(_removeClient_client);
	            } catch (ClientNotExistException_Exception e) {
	                System.out.println("Expected exception: ClientNotExistException has occurred.");
	                System.out.println(e.toString());
	            } catch (ClientCompteNotCloseException_Exception e) {
	                System.out.println("Expected exception: ClientCompteNotCloseException has occurred.");
	                System.out.println(e.toString());
	            }
	            System.out.println(".............................................................................");

	                }
	        {

            System.out.println("Recuperation du solde du compte CHEQUES après la suppression du client A ...");
            alom.bank.client.Compte _findMoney_compte = compteChequesA;
            try {
                int _findMoney__return = port.findMoney(_findMoney_compte);
                System.out.println("Soldes compte CHEQUES pour le client A : " + _findMoney__return);
            } catch (CompteNotExistException_Exception e) {
                System.out.println("Expected exception: CompteNotExistException has occurred.");
                System.out.println(e.toString());
            }
            System.out.println(".............................................................................");

        }	
	             
		        
		    }

}
