import java.util.Scanner;


public class _17_CheckPrime {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Age =");
		int flag=0;      
		
		int no = sc.nextInt();
		if(no==1||no==2||no==3){
			flag=0;	
		}
		else if(no%2==0||no%3==0||no%11==0||no%5==0){
			flag=1;
		}
		else 
		{
			for(int i=5;i*i<no;i+=7)
				{
					if(no%i==0){
						flag=1;
				}
		}
		
		
	}
		if(flag==0){
			System.out.println("Prime");	
				
		}
		else{
			System.out.println("Not prime");
				
		}
		
		

}
}
