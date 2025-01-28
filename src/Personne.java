
public class Personne {

	private String nom;
	private String prenom;
	
	public Personne (String prenom, String nom) {
		this.prenom = prenom;
		this.nom = nom;
	}
	
	public String getNom() {
		return nom;
	}
	
	public String getPrenom() {
		return prenom;
	}
	
	public String toString() {
		return prenom + " " + nom;
	}
	
	public static void main(String[] args) {
		Personne P1 = new Personne("Agostinelli", "Laurence");
	}

}
