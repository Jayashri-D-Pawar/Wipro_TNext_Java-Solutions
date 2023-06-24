import java.util.Scanner;

public class _26_TwoMaxAndMinNumbersInArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter No of n = ");
		
		int n=sc.nextInt();
		int arr[]= new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		
		int min= arr[1],max=arr[1];
		int min2 =arr[0],max2=arr[0];
		for(int i=1;i<n;i++)
		{
			if(arr[i]<min){
				if(arr[i]<min2){
					min2=min;
					min= arr[i];
				}
			}

			if(arr[i]>max){
				if(arr[i]>max2){
					max2=max;
					max= arr[i];
				}
			}
			
		}
	
		System.out.println("Max (1) ="+max+" (2) ="+max2);
		System.out.println("min (1) ="+min+" (2) ="+min2);
		}

}
