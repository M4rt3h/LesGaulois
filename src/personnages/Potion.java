package personnages;

public class Potion {
	private int forcePotion;
	private int quantitePotion;

	public Potion(int laForce, int laQuantite) {
		forcePotion = laForce;
		quantitePotion = laQuantite;
	}
	
	boolean viteMaDose() {
		if (quantitePotion >=1) {
			quantitePotion --;
			return true;
		}
		else {
			return false;
		}
	}
}