package sites;

import personnages.Gaulois;

public class Village {
	private Gaulois chef;
	private Gaulois[] villageois = new Gaulois[4];
	int nombreVillageois = 0;

	public Village(Gaulois chef) {
		this.chef = chef;

	}

	public Gaulois getChef() {
		return chef;
	}

	public void ajouterVillageois(Gaulois leGaulois) {
		if (this.nombreVillageois < villageois.length) {
			this.villageois[nombreVillageois] = leGaulois;
			this.nombreVillageois++;
			chef.parler(" Bienvenue " + leGaulois.getNom() + "!");

		} else {
			chef.parler(" Désolé " + leGaulois.getNom() + " mon village est déjà bien rempli.");
		}
	}

	public void afficherVillageois() {
		System.out.println("Le village de  " + chef.getNom() + " est habité par :");
		for (int i = 0; i < nombreVillageois; i++) {
			System.out.println("- " + villageois[i].getNom());
		}
	}

	public void changerChef(Gaulois nouveauChef) {
		chef.parler("Je laisse mon grand bouclier au grand " + nouveauChef.getNom());
		chef = nouveauChef;
		chef.parler("Merci !");

	}

}
