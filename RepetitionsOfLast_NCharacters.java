import java.util.Scanner;

public class RepetitionsOfLast_NCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String :");
		String s1 = sc.next();
		System.out.println("Enter the count :");
		int i = sc.nextInt();
		int len = s1.length();
		
		String n2 = s1.substring(s1.length()-3,s1.length()); 
		
		
		String s3 = new String();
		while(i<=len)
		{
			s3 += n2;
			i++;
			
		}
		System.out.println(s3);

	}

}
