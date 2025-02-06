package personnages;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;
//import personnages.Potion;


public class Druide extends Gaulois{
	private Random random;
	private Potion laPotion;
	
	public Druide(String nom, int force) {
		super(nom, force);
	}
	
		
	void fabriquerPotion(int quantite, int forceMin, int forceMax) {
	    try {
	        random = SecureRandom.getInstanceStrong();  // Cr�ation d'une instance SecureRandom
	    } catch (NoSuchAlgorithmException e) {
	        e.printStackTrace();
	    }

	    // Remplacement de 'new Random()' par 'random' (qui est une instance de SecureRandom)
	    int forcePotion = forceMin + random.nextInt(forceMax);  // Utilisation de SecureRandom pour g�n�rer un nombre al�atoire
	    this.parler("J'ai concoct� "+quantite+ " doses de potion magique. Elle a une force de "+ forcePotion);
	    
	    laPotion = new Potion(forcePotion, quantite);
	}

	
	void booster(Gaulois leGaulois, Potion laPotion) {
		if (!"Obelix".equals(leGaulois.getNom())) {
			if (laPotion.viteMaDose(leGaulois)) {
				this.parler("Tiens " + leGaulois.getNom() + " un peu de potion magique.");
				}
			else {
				this.parler("D�sol� " + leGaulois.getNom() + " il n'y a plus une seule goutte de potion.");
				}
			}
		else {
			this.parler("Non, Ob�lix Non !... Et tu le sais tr�s bien ! ");
	}

		
	}
	

}
