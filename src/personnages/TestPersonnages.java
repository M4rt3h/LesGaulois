package personnages;

public class TestPersonnages {
	public static void main(String[] args) {
		Gaulois gaulois = new Gaulois("GauloisB", 2);
		String nomB = gaulois.getNom();
		System.out.println("Ce gaulois a pour nom " +nomB);
	}
	
}
