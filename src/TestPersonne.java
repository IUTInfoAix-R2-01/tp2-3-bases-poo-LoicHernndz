public class TestPersonne {
	public static void main(String[] args) {
		Personne P1 = new Personne("Agostinelli", "Laurence");
		
		System.out.println(P1);
		System.out.println("Prénom : " + P1.getPrenom());
		System.out.println("Nom : " + P1.getNom());
	}
}
