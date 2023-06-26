import java.util.*;
public class Returns_NewString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String s1 = sc.next();
		int len = s1.length();
		if(len%2==0)
		{
			//int count = 0;
			int i=1;
			while(s1.charAt(i)>='a'&&s1.charAt(i)<='z'){
				i++;
			}
			
			System.out.println(s1.substring(0,i));
			
		}
		System.out.println(len);
		//System.out.println(s1.substring(1,s1.length()-1));
		
	}
	

}
