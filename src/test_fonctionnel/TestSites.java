package test_fonctionnel;
import personnages.Gaulois;
import sites.Village;
import personnages.Soldat;

public class TestSites {
	public static void main(String[] args) {
		Gaulois vercingetorix = new Gaulois("Vercingétorix", 5);
		Village leVillage = new Village(vercingetorix);
		
		Soldat minus = new Soldat("Minus", 2);
		Camp leCamp = new Camp(minus);
		
		
	}
}
