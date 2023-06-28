import java.util.Scanner;

public class ExceptionHandling1 {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		try{
			for(int i=0;i<n;i++)
			{
				arr[i] = sc.nextInt();
			}
			int index;
			System.out.println("Enter a particular index number : ");
			index = sc.nextInt();
			System.out.println(arr[index]);
			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		catch(NumberFormatException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	
}
