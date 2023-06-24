import java.util.Scanner;

public class _32_CopyMiddleElement {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No of n = ");
		
		int n=sc.nextInt();
		int arr[]= new int[n];
		System.out.println("Enter 1st array "+n+" Elements = ");
		for(int i=0;i<n;i++)	
			arr[i]=sc.nextInt();
		int arr2[]= new int[n];
		
		System.out.println("Enter 1st array "+n+" Elements = ");
		for(int i=0;i<n;i++)	
			arr2[i]=sc.nextInt();
	
		int res[]= new int[2];
		res[0]=arr[1];
		res[1] = arr2[1];
		
		for(int i=0;i<res.length;i++){
			System.out.println(res[i]+" ");
						
		}
	
	}

}
