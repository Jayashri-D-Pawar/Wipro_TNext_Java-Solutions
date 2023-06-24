import java.util.Scanner;

public class _28_SuccesorSum {

	public static void main(String str[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No of n = ");
		
		int n=sc.nextInt();
		int arr[]= new int[n];
		System.out.println("Enter "+n+" Elements = ");
		
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
//		System.out.println("6 founded"+i+"->"+arr[i]);
//		
	
	
		int sum=0;
		
		int i=0;
		while(i<n){
			if(arr[i]==6 &&i<n-1){
				while(arr[i]!=7){
					i++;
				}
				i++;
			}else{
				sum+=arr[i];
				i++;
			}
		}
		

		System.out.println("Sum ="+sum);
		
	
	}
}
