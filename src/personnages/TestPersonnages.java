package personnages;

public class TestPersonnages {
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix", 2);
		Druide druide = new Druide("Le druite",2);
		druide.parler("Je suis un druide de niveau noir");
		Potion laPotion = new Potion(1,4);
		druide.booster(asterix, laPotion);
		Gaulois obelix = new Gaulois("Obelix",5);
		druide.booster(obelix, laPotion);

	}
	
}
