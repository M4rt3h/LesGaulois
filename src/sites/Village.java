package sites;
import personnages.Gaulois;
import personnages.Grade;
import personnages.Soldat;

public class Village {
	private Gaulois chef;
	private Gaulois[] villageois;
	int nombreVillageois;
	
	public Village(Gaulois chef) {
		this.chef = chef;
        this.villageois = new Gaulois[4];
        this.nombreVillageois = 0;

	}
	
	public Gaulois getChef() {
		return chef;
	}
	
	public void ajouterVillageois(Gaulois leGaulois) {
		if (this.nombreVillageois <4) {
			this.villageois[nombreVillageois] = leGaulois;
			this.nombreVillageois ++;
			chef.parler(" Bienvenue " + leGaulois.getNom() + "!");

		}
		else {
			chef.parler(" Désolé " + leGaulois.getNom() + " mon village est déjà bien rempli.");
		}
	}
	
	public void afficherVillageois() {
		System.out.println("Le village de  " + chef.getNom() + " est habité par :" );
		for (int i=0; i<this.nombreVillageois; i++) {
			System.out.println("- " + this.villageois[i].getNom());
		}
	}
	
	public void changerChef(Gaulois nouveauChef) {
		chef.parler("Je laisse mon grand bouclier au grand "+nouveauChef.getNom());
		chef = nouveauChef;
		chef.parler("Merci !");

	}
	
}
