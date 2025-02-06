package personnages;

public class TestPersonnages {
	public static void main(String[] args) {
		Romain minus = new Romain("Minus", 20);
		
		Gaulois asterix = new Gaulois("Asterix", 2);
		Gaulois assurancetourix = new Gaulois("Assurancetourix", 1);
		Gaulois abraracourcix = new Gaulois("Abraracourcix", 3);
		Gaulois agecanonix = new Gaulois("Agecanonix", 3);
		Gaulois obelix = new Gaulois("Obelix",5);
		
		Druide druide = new Druide("Le druide",2);
		
		Potion laPotion = new Potion(3,3);
		
		druide.booster(asterix, laPotion);
		druide.booster(assurancetourix, laPotion);
		druide.booster(abraracourcix, laPotion);
		druide.booster(agecanonix, laPotion);
		druide.booster(obelix, laPotion);
		
		asterix.parler("Bonjour à tous");
		minus.parler("UN GAU... UN GAUGAU... ");
		boolean conditionBoucle = true;
		
		//probleme sur la boucle qui tourne sans fin 
		//=> surement un probleme avec estAterre()
		
		
		while (conditionBoucle) {
			if (asterix.estAterre()) {
				conditionBoucle = false;
			}
			if (minus.estAterre()) {
				conditionBoucle = false;
			}
			asterix.frapper(minus);
			minus.frapper(asterix);
			
		}
	
		
	}
	
}
