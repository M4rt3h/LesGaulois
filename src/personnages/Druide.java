package personnages;
import java.util.Random;


public class Druide extends Gaulois{

	public Druide(String nom, int force) {
		super(nom, force);
	}
		
	void fabriquerPotion(int quantite, int forceMin, int forceMax) {
		int forcePotion = forceMin + new Random().nextInt(forceMax); 
		this.parler("J'ai concocté "+quantite+ " doses de potion magique. Elle a une force de "+ forcePotion+ ". ");
	}
	
	void booster(Gaulois leGaulois) {
		
	}
}
