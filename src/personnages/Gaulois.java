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
	
	public void frapper(Romain leRomain) {
		String nomRomain = leRomain.getNom();
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + nomRomain);
		leRomain.recevoirCoup(force/3);
	}


	public static void main(String[] args) {
		Gaulois gauloisC = new Gaulois("GauloisC", 3);
		String nomC = gauloisC.getNom();
		System.out.println("Ce gaulois a pour nom " + nomC);
	}
}

