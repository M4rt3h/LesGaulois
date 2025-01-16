package personnages;

public class Gaulois {
	private String nom;
	private int force;

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public void parler(String texte) {
		System.out.println("Le gaulois " + getNom() + " : «" + texte + "»");
	}

	public String getNom() {
		return nom;
	}

	public static void main(String[] args) {
		Gaulois gauloisC = new Gaulois("GauloisC", 3);
		String nomC = gauloisC.getNom();
		System.out.println("Ce gaulois a pour nom " + nomC);
	}
	
	public void frapper(Romain leRomain) {
		System.out.println(this.nom + " envoie un grand coup dans la mâchoire de " + leRomain.getNom());
		leRomain.recevoirCoup(force/3);
	}

}

