package personnages;

public class Gaulois extends Personnage{
	private String nom;
	private int force;

	public Gaulois(String nom, int force) {
		super(nom, force);
	}
	
	@Override
	protected String donnerAuteur() {
		return "Gaulois";
	}

}

