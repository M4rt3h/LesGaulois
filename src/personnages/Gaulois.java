package personnages;

public class Gaulois extends Personnage{

		
	public Gaulois(String nom, int force, float forcePotion) {
		super(nom, force);
		super(forcePotion)
	}
	
	
	
	@Override
	protected String donnerAuteur() {
		return "Gaulois";
	}
	

}

