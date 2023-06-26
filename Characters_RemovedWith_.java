import java.util.*;
public class Characters_RemovedWith_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		int i=0;
		String s2="";
		while(s1.charAt(i)!='*'){
			i++;
		}
		s2+=s1.substring(0,i-1);

		s2+=s1.substring(i+2,s1.length());
		System.out.println(s2);
	}

}
