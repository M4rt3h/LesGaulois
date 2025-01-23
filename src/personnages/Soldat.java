package personnages;
import personnages.Grade;

public class Soldat extends Romain {
	private Grade grade;
	
	public Soldat(String nom, int force, personnages.Grade leGrade) {
		super(nom, force);
		this.grade = leGrade;
	}
	
	public Grade getGrade() {
		return grade;
	}
}
