package personnages;
import java.util.Random;
import personnages.Potion;


public class Druide extends Gaulois{

	public Druide(String nom, int force) {
		super(nom, force);
	}
		
	void fabriquerPotion(int quantite) {
		int forceMin = 2;
		int forceMax = 6;
		int forcePotion = forceMin + new Random().nextInt(forceMax); 
		this.parler("J'ai concocté "+quantite+ " doses de potion magique. Elle a une force de "+ forcePotion+ ". ");
		Potion laPotion = new Potion(forcePotion, quantite);
	}
	
	void booster(Gaulois leGaulois, Potion laPotion) {
		if (leGaulois.getNom() != "Obelix") {
			if (laPotion.viteMaDose()) {
				this.parler("Tiens " + leGaulois.getNom() + " un peu de potion magique.");
				}
			else {
				this.parler("Désolé " + leGaulois.getNom() + " il n'y a plus une seule goutte de potion.");
				}
			}
		else {
			this.parler("Non, Obélix Non !... Et tu le sais très bien ! ");
	}

		
	}
	

}
