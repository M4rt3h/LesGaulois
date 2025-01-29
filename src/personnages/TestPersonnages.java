package personnages;

public class TestPersonnages {
	public static void main(String[] args) {
		Gaulois gaulois = new Gaulois("GauloisB", 2);
		String nomB = gaulois.getNom();
		//System.out.println("Ce gaulois a pour nom " +nomB);
		Druide druide = new Druide("Le druite",2);
		druide.parler("Je suis un druide de niveau noir");
		druide.fabriquerPotion(3,4,10);
	}
	
}
