import java.util.Scanner;

public class MathOperation {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		try{
			int arr[] = new int[5];
			int sum=0,avg=0;
			for(int i=0;i<5;i++)
			{
				arr[i] = sc.nextInt();
				sum = sum + arr[i];
				
			}
			avg = sum/5;
			System.out.println(sum);
			System.out.println(avg);
			
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(NumberFormatException e)
		{
			System.out.println(e);
		}
		
	}

}
