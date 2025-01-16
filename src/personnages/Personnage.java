package personnages;

public abstract class Personnage {
	private String nom;
	private int force;
	
	protected Personnage(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println("Le " + donnerAuteur() + " " + getNom() + " : " + texte);
	}
	
	public void frapper(Personnage lePersonnage) {
		String nomPersonnage = lePersonnage.getNom();
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + nomPersonnage);
		lePersonnage.recevoirCoup(force/3);
	}
	
	
	protected abstract String donnerAuteur();
	
	public void recevoirCoup(int forceCoup) {
		if (this.force - forceCoup < 1) {
			this.force = 0;
			this.parler("J'abandone...");
		} else {
			this.force = this.force - forceCoup;
			this.parler("Aïe !");
		}
	}
	
}
