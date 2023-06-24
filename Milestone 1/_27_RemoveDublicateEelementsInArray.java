import java.util.Scanner;

public class _27_RemoveDublicateEelementsInArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter No of n = ");
		
		int n=sc.nextInt();
		int arr[]= new int[n];
		System.out.print("Enter "+n+" Elements = ");
		
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		
		
		int i=0;
		for(int j=1;j<n;j++){
			while(arr[i]!=arr[j]){
				arr[++i]=arr[j];
			}
		}
		System.out.println();
		
		n = i+1;
		for(int k=0;k<n;k++)
			System.out.print(arr[k]+"\t");
		
		
	}

}
