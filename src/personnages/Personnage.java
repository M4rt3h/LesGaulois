package personnages;

public abstract class Personnage {
	private String nom;
	private int force;
	
	protected Personnage(String nom, int force) {
		this.nom = nom;
		this.setForce(force);
	}
	
	public boolean estAterre() {
		return getForce()==1;
	}
	
	public String getNom() { //Pour retourner le nom du personnage
		return nom;
	}
	
	public int getForce() { //Retourne la force
		return force;
	}
	

	public void setForce(int force) { //Pour modifier la force du gaulois avec la potion
		this.force = force;
	}

	//Modifier pour que la puissance du coup soit multiplier par la force de la potion 
	//qui ne peut pas etre < 1 (voir sujet)
	
	public void parler(String texte) { // Pour parler
		System.out.println("«Le " + donnerAuteur() + " " + getNom() + " : " + texte + " »");
	}
	
	public void frapper(Personnage lePersonnage) { //Pour donner coup à lePersonnage
		String nomPersonnage = lePersonnage.getNom();
		System.out.println(nom + " envoie un grand coup de force "+ getForce()+" dans la mâchoire de " + nomPersonnage);
		lePersonnage.recevoirCoup(getForce());
	}
	
	
	
	protected abstract String donnerAuteur(); //Pour savoir si c'est Gaulois ou Romain
	
	protected abstract int forceCoup(); //retourne force du coup

	
	
	public void recevoirCoup(int forceCoup) { //Pour recevoir coup de force forceCoup
		if (this.getForce() - forceCoup < 1) {
			this.setForce(0);
			this.parler("J'abandone...");
		}
		else {
			this.setForce(this.getForce() - forceCoup);
			this.parler("Aïe !");
		}
	}


	
}
