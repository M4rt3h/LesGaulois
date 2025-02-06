package personnages;

public class Gaulois extends Personnage{
	int forceEmplifie = 1;
		
	public Gaulois(String nom, int force) {
		super(nom, force);
	}
	
	public void setterForceEmplifie(int forceEmplifie) { //Pour set la force emplifie du gaulois
		this.forceEmplifie = forceEmplifie;
	}
	
	public int getForceEmplifie() { //Pour récupere la force emplifiée du gaulois
		return forceEmplifie;
	}
	
	
	@Override
	protected String donnerAuteur() {
		return "Gaulois";
	}
	
	@Override
	public boolean estAterre() {
		return (getForceEmplifie() == 1 && getForce()==1);
	}
	
	@Override
	protected int forceCoup() {
		int forceDeCoup;
		if (forceEmplifie>1) { //Si le gaulois a encore les effets de la potion
			forceDeCoup = getForce() * forceEmplifie;
		}
		else {	//Sinon
			forceDeCoup = getForce();
		}
		return (forceDeCoup);
	}
	
	@Override
	public void frapper(Personnage lePersonnage) { //Pour donner coup à lePersonnage
		String nomPersonnage = lePersonnage.getNom();
		
		if (forceEmplifie>1) {
			lePersonnage.recevoirCoup(getForceEmplifie());
			System.out.println(getNom() + " envoie un grand coup de force "+ getForceEmplifie() +" dans la mâchoire de " + nomPersonnage);
			setterForceEmplifie(getForceEmplifie()-1);		}
		else {
		System.out.println(getNom() + " envoie un grand coup dans la mâchoire de " + nomPersonnage);
		lePersonnage.recevoirCoup(getForce());

		}
	}


}

