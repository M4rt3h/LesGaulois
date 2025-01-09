package test_fonctionnel;

import personnages.Gaulois;

public class TestGaulois {
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix", 8);
		String nom = asterix.getNom();
		System.out.println("Ce gaulois a pour nom " +nom);
		asterix.parler("Bonjour test");
	}
	
}
