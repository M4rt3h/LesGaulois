package test_fonctionnel;

import personnages.Gaulois;
import personnages.Romain;

public class TestGaulois {
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix", 8);
		String nom = asterix.getNom();
		System.out.println("Ce gaulois a pour nom " +nom);
		asterix.parler("Bonjour à tous");
		
		Romain minus = new Romain("Minus", 6);
		minus.parler("UN GAU… UN GAUGAU…");
		
		//for (int coup = 0; coup<2; coup++) {
		//	minus.recevoirCoup(3);
		//}
		
		//asterix.frapper(minus);
		
		for (int coup=0; coup<3; coup++ ) {
			asterix.frapper(minus);

			
		}
	}
	
}
