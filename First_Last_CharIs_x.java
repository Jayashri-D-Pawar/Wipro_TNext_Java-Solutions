import java.util.*;
public class First_Last_CharIs_x {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = "";
		if(s1.charAt(0)=='x'&&s1.charAt(s1.length()-1)=='x')
		{
			s2  =s1.substring(1,s1.length()-1);
		}
		else
		{
			s2 = s1;
			
		}
		System.out.println(s2);

	}

}
