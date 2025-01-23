package sites;
import personnages.Soldat;
import personnages.Grade;

public class Camp {
	private Soldat commandant;
	private Soldat[] soldats;
	int nbSoldats;
	
	public Camp(Soldat commandant) {
		this.commandant = commandant;
		this.soldats = new Soldat[3];
		this.nbSoldats = 0;
	}
	
	public Soldat getCommandant() {
		return commandant;
	}
	
	public void ajouterSoldat(Soldat leSoldat) {
		if (this.nbSoldats <3) {
			this.soldats[nbSoldats] = leSoldat;
			this.nbSoldats ++;
			leSoldat.parler("Je mets mon épée au service de Rome dans le camp dirigé par " + commandant.getNom());
			
		}
		else {
			commandant.parler("Désolé "+ leSoldat.getNom() +" notre camp est complet !");
		}
	}
	
	public void afficherCamp() {
		System.out.println("Le camp dirigé par " + commandant.getNom() + " contient les soldats :" );
		for (int i=0; i<this.nbSoldats; i++) {
			System.out.println("- " + this.soldats[i].getNom());
		}
	}
	
	public void changerCommandant(Soldat nouveauCommandant) {
		if (nouveauCommandant.getGrade() ==  Grade.CENTURION) {
			commandant = nouveauCommandant;
			commandant.parler("Moi " + commandant.getNom() + " je prends la direction du camp romain.");
		}
		else {
			nouveauCommandant.parler("Je ne suis pas suffisamment gradé pour prendre la direction du camp romain. ");
		}
	}
	
}
