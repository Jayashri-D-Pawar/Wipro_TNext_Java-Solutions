class Fruit{
	String name,taste,size;
	Fruit(String name, String taste, String size)
	{
		this.name = name;
		this.taste = taste;
		this.size = size;
	}
	void eat()
	{
		System.out.println("The "+name+ " tastes "+taste);
	}
	
}
class Apple extends Fruit{
	//String size;
	Apple(String size)
	{
		super("Apple","sweet",size);
	}
	void eat()
	{
		System.out.println("The "+size+" size "+ " name "+ " "+name+" "+" taste "+taste);
	}
}
public class Orange extends Fruit {
	

	Orange(String size)
	{
		super("Orange","Sour",size);
	}
	void eat()
	{
		System.out.println("The "+size+ " name "+name+" taste "+taste);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Apple a1 = new Apple("Medium");
		a1.eat();
		Orange o1 = new Orange("Large");
		o1.eat();

	}

}
