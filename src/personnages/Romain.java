package personnages;

public class Romain {
	private String nom;
	private int force;
	
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println("Le romain " + getNom() + " : «" + texte + "»");
	}
	
	public void recevoirCoup(int forceCoup) {
		this.force = this.force-forceCoup;

		
		System.out.println("la force apres le coup : "+force);
	}
}
