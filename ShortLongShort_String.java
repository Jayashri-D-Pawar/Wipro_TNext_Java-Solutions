import java.util.*;
public class ShortLongShort_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st string :");
		String s1 = sc.next();
		System.out.println("Enter 2nd string :");
		String s2 = sc.next();
		String s3 = "";
		if(s1.length()==s2.length())
		{
			System.out.println(0);
		}
		else if(s1.length()>s2.length())
		{
			s3 = s2+s1+s2;
			
		}
		else
		{
			s3 = s1+s2+s1;
		}
		System.out.println(s3);
			
	}

}
