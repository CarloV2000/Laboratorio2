package it.polito.tdp.alien.model;

public class Parola {
	private String parolaAliena; 
	private String parolaTradotta;
	
	public Parola(String parolaAliena, String parolaTradotta) {
		this.parolaAliena = parolaAliena;
		this.parolaTradotta = parolaTradotta;
	}

	public String getParolaAliena() {
		return parolaAliena;
	}

	public String getParolaTradotta() {
		return parolaTradotta;
	}

	@Override
	public String toString() {
		return "ParolaAliena = " + parolaAliena + ", parolaTradotta = " + parolaTradotta + "\n";
	}
	
		
}
