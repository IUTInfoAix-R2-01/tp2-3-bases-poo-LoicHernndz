package part2.ex1;

public class TestAuthor {
	public static void main(String[] arg) {
		// Test constructeur & toString
		Author author = new Author("Vives", "vives@author.com", 'm');
		System.out.println(author);
		
		// Test Getter & Setter
		author.setEmail("N/A");
		System.out.println(author.getEmail());
	}
}
