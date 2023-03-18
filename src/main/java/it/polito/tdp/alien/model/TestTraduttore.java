package it.polito.tdp.alien.model;

public class TestTraduttore {
	public static void main (String []args) {
		Traduttore trad = new Traduttore();
		
		String s1 = "haha ciao";
		String s2 = "dasl allora";
		String s3 = "dasl";
		String s4 = "jaw  ma";
		String s5 = "saas si";
		
		try {
			trad.inserisciNelTraduttoreOTraduci(s1);
		}catch (IllegalArgumentException e){
			System.out.println("Errore nell'inserimento voto.");
			System.out.println(e.getMessage());
		}

		try {
			trad.inserisciNelTraduttoreOTraduci(s2);
		}catch (IllegalArgumentException e){
			System.out.println("Errore nell'inserimento voto.");
			System.out.println(e.getMessage());
		}
		
		try {
			trad.inserisciNelTraduttoreOTraduci(s3);
		}catch (IllegalArgumentException e){
			System.out.println("Errore nell'inserimento voto.");
			System.out.println(e.getMessage());
		}
		
		try {
			trad.inserisciNelTraduttoreOTraduci(s4);
		}catch (IllegalArgumentException e){
			System.out.println("Errore nell'inserimento voto.");
			System.out.println(e.getMessage());
		}
		
		try {
			trad.inserisciNelTraduttoreOTraduci(s5);
		}catch (IllegalArgumentException e){
			System.out.println("Errore nell'inserimento voto.");
			System.out.println(e.getMessage());
		}
		
		System.out.println(trad.stampaTraduttore());
		System.out.println("traduzione : "+trad.inserisciNelTraduttoreOTraduci(s3));
		System.out.println(trad.contaSpazi(s1));
		
		
		
	}
	
}
