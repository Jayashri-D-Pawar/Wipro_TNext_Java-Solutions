import java.util.*;
public class CopiesOf_1st_2Char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String :");
		String s1 = sc.next();
		int len = s1.length();
		
		String n2 = s1.substring(0,2); 
		int i = 0;
		String s3 = new String();
		while(i<len)
		{
			s3 += n2;
			i++;
			
		}
		System.out.println(s3);
		
	}

}
