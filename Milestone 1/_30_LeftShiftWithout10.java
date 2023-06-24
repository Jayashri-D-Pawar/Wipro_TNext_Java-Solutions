import java.util.Scanner;

public class _30_LeftShiftWithout10 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No of n = ");
		
		int n=sc.nextInt();
		int arr[]= new int[n];
		System.out.println("Enter "+n+" Elements = ");
		
		for(int i=0;i<n;i++)	
			arr[i]=sc.nextInt();
		int i=0;
		int j=0;
		while(j<n){
			if(arr[j]!=10){
				arr[i++]=arr[j];
				
			}
			
				j++;
				
		}
		if(i<n){
			while(i<n){
				arr[i++]=0;
			}
		}

		
		for(int k=0;k<n;k++)
			System.out.print(arr[k]+" ");
		
	
	}

}
