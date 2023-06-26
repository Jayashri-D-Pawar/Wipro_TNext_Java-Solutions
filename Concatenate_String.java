import java.util.*;

public class Concatenate_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st String : ");
		String s1 = sc.next();
		System.out.println("Enter 2nd String : ");
		String s2 = sc.next();
		String s3 = s1 + " "+s2;
		//System.out.println(s1.concat(s2).toLowerCase());
		System.out.println(s3.toLowerCase());
		char c = s1.charAt(s1.length()-1);
		System.out.println(c);
		if(c==s2.charAt(0))
		{
			 s3 = s1.concat(s2.substring(1,s2.length()));
		}
		else
		{
			s3 = s1.concat(s2);
		}
		System.out.println(s3);
		
	}

}
