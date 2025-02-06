package personnages;

public class Potion {
	private int forcePotion;
	private int quantitePotion;

	public Potion(int laForce, int laQuantite) {
		forcePotion = laForce;
		quantitePotion = laQuantite;
	}
	
	public int getForcePotion() {
		return forcePotion;
	}
		
	boolean viteMaDose(Gaulois leGaulois) {  // Return True si le gaulois recois de la potion False sinon
		boolean doseDistribue = quantitePotion >=1;
		if (doseDistribue) {
			leGaulois.setterForceEmplifie(forcePotion*leGaulois.getForce());	
			quantitePotion --;
		}
		return doseDistribue;
	}
}