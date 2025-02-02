package part2.ex2;

public class Book {
	private String name;
	private Author[] authors;
	private double price;
	private int qty;
	
	public Book (String name, Author[] authors, double price) {
		this.name = name;
		this.authors = authors;
		this.price = price;
		this.qty = 0;
	}
	
	public Book (String name, Author[] authors, double price, int qty) {
		this.name = name;
		this.authors = authors;
		this.price = price;
		this.qty = qty;
	}
	
	public String getName() {
		return name;
	}
	
	public Author[] getAuthors() {	
		return authors;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getQty() {
		return qty;
	}
	
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	public String toString() {
		String str = "Book[name=" + name + ",authors={" + authors[0];
		for (int i = 1; i < authors.length; ++i) {
			str += "," + authors[i];
		}
		str += "},price="+price+",qty="+qty+"]";
		return str;
	}
	
	public String getAuthorNames() {
		String names = authors[0].getName();
		for (int i = 1; i < authors.length; ++i) {
			names += "," + authors[i].getName();
		}
		return names;
	}

}
