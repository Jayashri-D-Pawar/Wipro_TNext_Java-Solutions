import java.util.Scanner;

public class _31_RearrangArraybyEvenOdd {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No of n = ");
		
		int n=sc.nextInt();
		int arr[]= new int[n];
		System.out.println("Enter "+n+" Elements = ");
		
		for(int i=0;i<n;i++)	
			arr[i]=sc.nextInt();

		int l=0;
		int h=n-1;
		while(l<=h){
			while(arr[l]%2==0){
				l++;
			}
			while(arr[h]%2!=0){
				h--;
			}
		
			if(l<=h){
				int temp =arr[l];
				arr[l]=arr[h];
				arr[h]=temp;
			}
			l++;
			h--;
		}
		for(int k=0;k<n;k++)
			System.out.print(arr[k]+" ");
	
	}

}
