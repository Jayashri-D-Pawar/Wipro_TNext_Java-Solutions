import java.util.Scanner;
class InvalidAgeException extends Exception{
	public InvalidAgeException()
	{
		super();
		System.out.println("Invalid Age ...");
	}
}
public class ExceptionHandling_03 {
	public static void main(String args[]) throws InvalidAgeException
	{
		int age;
		String name;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age : ");
		age = sc.nextInt();
		System.out.println("Enter the name :");
		name = sc.next();
		if(age>=18||age<60)
		{
			throw new InvalidAgeException();
		}
		System.out.println("Name : "+ name +" "+" Age : "+ age);
		
	}
}
