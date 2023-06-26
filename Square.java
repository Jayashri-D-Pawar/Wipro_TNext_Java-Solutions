class Shape{
	void draw()
	{
		System.out.println("Drawing Shape");
	}
	void erase()
	{
		System.out.println("Erasing Shape");
	}
}
class Triangle extends Shape{
	void draw()
	{
		System.out.println("Drawing Triangle");
	}
	void erase()
	{
		System.out.println("Erasing Triangle");
	}
}
class Circle extends Shape{
	void draw()
	{
		System.out.println("Drawing Circle");
	}
	void erase()
	{
		System.out.println("Erasing Circle");
	}
}
public class Square extends Shape{

	void draw()
	{
		System.out.println("Drawing Square");
	}
	void erase()
	{
		System.out.println("Erasing Square");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s1 = new Triangle();
		s1.draw();
		s1.erase();
		
		Shape s2 = new Circle();
		s2.draw();
		s2.erase();
		
		Shape s3 = new Square();
		s3.draw();
		s3.erase();
		

	}

}
