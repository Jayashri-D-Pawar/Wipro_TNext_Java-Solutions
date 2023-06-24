import java.util.Scanner;

public class _22_SumAvgofArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int sum=0;
		System.out.println("Enter N =");
		int n=sc.nextInt();
		int arr[]= new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();

		for(int i=0;i<n;i++)
			sum+=arr[i];
	
		System.out.println("Sum ="+sum);
		System.out.println("Avg ="+(sum/n));
		
	}

}
