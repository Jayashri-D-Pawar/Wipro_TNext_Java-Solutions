
public class Book {

	String name ;
	Author author;
	double price;
	int qtyInStock;
	public Book(String name, Author author , double price, int qtyInStock)
	{
		this.name = name;
		this.author = author;
		this.price = price;
		this.qtyInStock = qtyInStock; 
		
	}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Author getAuthor() {
		return author;
	}


	public void setAuthor(Author author) {
		this.author = author;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public int getQtyInStock() {
		return qtyInStock;
	}


	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author a1 = new Author("Bhagyashri Badgujar","bhagya@gmail.com",'F');
		Book b1 = new Book("Sample Book",a1,500,20);
		System.out.println("Title :"+b1.getName());
		System.out.println("Author :"+b1.getAuthor().getName());
		System.out.println("Email :"+b1.getAuthor().getEmail());
		System.out.println("Gender :"+b1.getAuthor().getGender());
		System.out.println("Price :"+b1.getPrice());
		System.out.println("Quantity In Stock :"+b1.getQtyInStock());
	}

}

class Author{
	String name;
	String email;
	char gender;
	Author(String name, String email, char gender)
	{
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
}
