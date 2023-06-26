class Animal
{
	void eat()
	{
		System.out.println("In Animal Class & in Eat Method");
	}
	void sleep()
	{
		System.out.println("In Animal Class & in Sleep Method");
	}
}
class Bird extends Animal
{
	void eat()
	{
		System.out.println("In Bird Class & in Eat Method");
	}
	void sleep()
	{
		System.out.println("In Bird Class & in Sleep Method");
	}
	void fly()
	{
		System.out.println("In Bird Class & in Fly Method");
	}
}
public class Animal_Bird {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a1 = new Animal();
		a1.eat();
		a1.sleep();
		Bird b1 = new Bird();
		b1.eat();
		b1.sleep();
		b1.fly();

	}

}
