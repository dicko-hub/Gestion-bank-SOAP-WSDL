package alom.bank.server.back;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

public class Repository {
	
	private static Map<Client, ArrayList<Compte>> bank =  new HashMap<Client, ArrayList<Compte>>();
	
	private static final Repository INSTANCE = new Repository();

	private  Repository() {
		 
	}
	
	 public static Repository getInstance(){
		 return INSTANCE;
	 }

	public Map<Client, ArrayList<Compte>> getBank() {
		return bank;
	}
	 
}
