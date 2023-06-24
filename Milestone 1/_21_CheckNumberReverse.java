import java.util.Scanner;

public class _21_CheckNumberReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter N =");
		int n=sc.nextInt();
		int check=0,rem=0;
		while(n!=0){
			rem = n%10;
			check = check *10 +rem;
			n =n/10;
		}
			System.out.println(check);
		
	}

}
