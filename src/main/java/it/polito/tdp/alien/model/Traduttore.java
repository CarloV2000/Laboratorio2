package it.polito.tdp.alien.model;

import java.util.TreeMap;

import javafx.event.ActionEvent;

public class Traduttore {
	public TreeMap<String, Parola>mappaParolePerParolaAliena;

	public Traduttore() {
		this.mappaParolePerParolaAliena = new TreeMap<>();
	}
	
	public void put(Parola p) {
		this.mappaParolePerParolaAliena.put(p.getParolaAliena(), p);
	}
	
	public String stampaTraduttore() {
		String x = "";
		for(Parola p : this.mappaParolePerParolaAliena.values()) {
			x += p.getParolaAliena()+" (which means : "+p.getParolaTradotta()+")\n";
		}
		return x;
	}
	
	public boolean controlliParolaInserita(String s) {
		boolean soloAlfab = false;
		if(this.contaSpazi(s)<=1) {
			String a = s.toLowerCase();
			if(this.soloAlfabetici(s))
				soloAlfab = true;
			else 
				throw new IllegalArgumentException("Non inserire dei numeri!!!");
		}
		else
			throw new IllegalArgumentException("Non inserire più di uno spazio!!!");
	    return soloAlfab;
	}
	
	public Parola inserisciNelTraduttoreOTraduci(String s) {
		Parola p = null;
		if(this.controlliParolaInserita(s)) {
			if(s.contains(" ")) {
				String parolaAliena = s.substring(0,s.indexOf(" "));
				String parolaTradotta = s.substring(s.lastIndexOf(" "));
				p = new Parola(parolaAliena, parolaTradotta);
				this.mappaParolePerParolaAliena.put(parolaAliena, p);
        	}
			else {
				p = this.mappaParolePerParolaAliena.get(s);
			}
		}
		return p;	
	}
	
	public int contaSpazi(String s) {
		String a = s.replaceAll(" ", ""); 
		int nS = s.length()-a.length();
		return nS;
	}
	
	public boolean soloAlfabetici(String s) {
		boolean a = false;
		for(int i = 0 ; i<s.length(); i++) {
			if(Character.isAlphabetic(s.charAt(i)))
				a = true;
		}
		return a;
	}
	
}
