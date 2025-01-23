package test_fonctionnel;
import personnages.Gaulois;
import sites.Camp;
import sites.Village;
import personnages.Soldat;
import personnages.Grade;



public class TestSites {
	public static void main(String[] args) {
		Gaulois vercingetorix = new Gaulois("Vercing�torix", 5);
		Village leVillage = new Village(vercingetorix);
		vercingetorix.parler("Je suis un grand guerrier et je vais cr�er mon village");

		
		Soldat minus = new Soldat("Minus", 2, Grade.CENTURION);
		Camp leCamp = new Camp(minus);
		minus.parler("Je suis en charge de cr�er un nouveau camp romain.");
		
		Gaulois agecanonix = new Gaulois("Agecanonix", 1);
		Gaulois assurancetourix = new Gaulois("Assurancetourix", 2);
		Gaulois asterix = new Gaulois("Ast�rix", 5);
		Gaulois obelix = new Gaulois("Ob�lix", 15);
		Gaulois prolix = new Gaulois("Prolix",3);
		
		Soldat brutus = new Soldat("Brutus", 5, Grade.CENTURION);
		Soldat milexcus = new Soldat("Milexcus", 2, Grade.SOLDAT);
		Soldat tulliusOctpus = new Soldat("Tullius Octpus", 2, Grade.TESSERARIUS);
		Soldat ballondebaudrus = new Soldat("Ballondebaudrus", 3, Grade.OPTIO);
		
		leCamp.ajouterSoldat(brutus);
		leCamp.ajouterSoldat(milexcus);
		leCamp.ajouterSoldat(tulliusOctpus);
		leCamp.ajouterSoldat(ballondebaudrus);
		
		leVillage.ajouterVillageois(agecanonix);
		leVillage.ajouterVillageois(assurancetourix);
		leVillage.ajouterVillageois(asterix);
		leVillage.ajouterVillageois(obelix);
		leVillage.ajouterVillageois(prolix);
		
		leVillage.afficherVillageois();
		leCamp.afficherCamp();
		
		leCamp.changerCommandant(brutus);
		leCamp.changerCommandant(ballondebaudrus);
		leVillage.changerChef(prolix);

	}
}
