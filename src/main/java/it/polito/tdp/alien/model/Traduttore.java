package it.polito.tdp.alien.model;

import java.util.ArrayList;
import java.util.List;
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
			x += p.getParolaAliena()+" (which means : "+p.getTraduzioni()+")\n";
		}
		return x;
	}
	
	public Parola inserisciNelTraduttoreOTraduci(String s) {
		Parola p = null;
			if(s.contains(" ")) {
				String parolaAliena = s.substring(0,s.indexOf(" "));
				String parolaTradotta = s.substring(s.lastIndexOf(" "));
				
				p = this.mappaParolePerParolaAliena.get(parolaAliena);
				List<String>traduzioni = new ArrayList<>();
				
				if(p==null){//se la parola aliena non c'era ancora: la creo e, la aggiungo
					traduzioni.add(parolaTradotta);
					p = new Parola(parolaAliena, traduzioni);
					this.mappaParolePerParolaAliena.put(parolaAliena, p);
				}
				p.getTraduzioni().add(parolaTradotta);//aggiorno la lista di traduzioni 
        	}
			// se non ci sono spazi
			else {
				p = this.mappaParolePerParolaAliena.get(s);
			}
		return p;	
	}
	
	public int contaSpazi(String s) {
		String a = s.replaceAll(" ", ""); 
		int nS = s.length()-a.length();
		return nS;
	}
	
	public boolean contieneNumeri(String s) {
		boolean a = false;
		for(int i = 0 ; i<s.length(); i++) {
			if(Character.isDigit(s.charAt(i))) {
				a = true;
				break;
			}
		}
		return a;
	}
	
}
