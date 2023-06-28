import java.util.Scanner;

class NegativeNumberException extends Exception {
    public NegativeNumberException()
    {
        // Call constructor of parent Exception
        super();
        System.out.println("Negative Number Exception");
    }
}
class ValuesOutOFRangeRangeException extends Exception {
    public ValuesOutOFRangeRangeException()
    {
        // Call constructor of parent Exception
        super();
        System.out.println("Values Out Of Range Exception");
    }
}
public class ExceptionHandling2 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 2; i++) {
			String name = "";
			int subA = 0;
			int subB = 0;
			int subC = 0;
			
			try {				
				name = sc.nextLine();
				
				if (sc.hasNextInt())
					subA = sc.nextInt();
				else
					throw new NumberFormatException();
				
				if (sc.hasNextInt())
					subB = sc.nextInt();
				else
					throw new NumberFormatException();
				
				if (sc.hasNextInt())
					subC = sc.nextInt();
				else
					throw new NumberFormatException();
				
				if (subA < 0) throw new NegativeNumberException();
				if (subA > 100) throw new ValuesOutOFRangeRangeException();
				
				if (subB < 0) throw new NegativeNumberException();
				if (subB > 100) throw new ValuesOutOFRangeRangeException();
				
				if (subC < 0) throw new NegativeNumberException();
				if (subC > 100) throw new ValuesOutOFRangeRangeException();
				
				
			}
		
			catch (ArithmeticException e) {
				System.out.println(e.getMessage());
			} catch (NegativeNumberException e) {
				System.out.println(e.getMessage());
			} catch (ValuesOutOFRangeRangeException e) {
				System.out.println(e.getMessage());
			}
			
			System.out.println("Name: " + name);
			System.out.println("Marks of subject A: " + subA);
			System.out.println("Marks of subject B: " + subB);
			System.out.println("Marks of subject C: " + subC);
		}
		
		

	}

}
