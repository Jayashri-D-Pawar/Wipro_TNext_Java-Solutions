import java.util.Scanner;

public class Combination_First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st String :");
		String s1 = sc.next();
		System.out.println("Enter 2nd String :");
		String s2 = sc.next();
		String s3 = "";
		int l1= s1.length();
		int l2 = s2.length();
		int i=0;
		while(i<l1 &&i<l2){
			s3+=s1.charAt(i);
			s3+=s2.charAt(i);
			i++;
		}
		int j=i;
		if(i<l1){
			while(i<l1){
				s3+=s1.charAt(i);
			
				i++;	}
		}
		if(j<l2){
			while(i<l1){
				
				s3+=s2.charAt(i);
				j++;	}
		}
		
		System.out.println(s3);
	}

}
