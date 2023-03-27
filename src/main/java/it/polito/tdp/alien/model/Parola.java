package it.polito.tdp.alien.model;

import java.util.*;

public class Parola {
	private String parolaAliena; 
	//private String parolaTradotta;
	private List<String>traduzioni;
	
	public Parola(String parolaAliena, List<String>traduzioni) {
		this.parolaAliena = parolaAliena;
		this.traduzioni = new ArrayList<>();
	}

	public String getParolaAliena() {
		return parolaAliena;
	}	

	public List<String> getTraduzioni() {
		return traduzioni;
	}

	@Override
	public String toString() {
		return "ParolaAliena = " + parolaAliena + ",\n traduzioni possibili = " + traduzioni + "\n";
	}
	
		
}
