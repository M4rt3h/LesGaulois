package test_fonctionnel;

import personnages.Gaulois;
import personnages.Romain;

public class TestGaulois {
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Ast�rix", 8);
		String nom = asterix.getNom();
		System.out.println("Ce gaulois a pour nom " +nom);
		asterix.parler("Bonjour � tous");
		
		Romain minus = new Romain("Minus", 6);
		
		minus.recevoirCoup(2);

	}
	
}
