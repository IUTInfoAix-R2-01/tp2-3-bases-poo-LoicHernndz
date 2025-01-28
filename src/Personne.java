
public class Personne {

	private String nom;
	private String prenom;
	
	public Personne (String nom, String prenom) {
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
}
