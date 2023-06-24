import java.util.Scanner;

public class _24_SearchElementInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter No of n = ");
		
		int n=sc.nextInt();
		
		int arr[]= new int[n];
		System.out.print("Enter "+n+" Elements = ");
		
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		System.out.print("Enter key= ");
		
		int key=sc.nextInt();
		int res =-1;
		for(int i=0;i<n;i++)
		{
			if(arr[i]==key){
				res =i;
			}
		
		}
	
		System.out.println("Index ="+res);
		

	}

}
