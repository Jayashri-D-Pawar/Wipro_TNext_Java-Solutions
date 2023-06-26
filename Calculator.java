
public class Calculator {
	static int powerInt(int num1, int num2)
	{
		
		//System.out.println();
		return (int) (Math.pow(num1, num2));
		
	}
	static double powerDouble(double num1,int num2)
	{
		return (Math.pow(num1, num2));
	}
	public static void main(String args[])
	{
		Calculator c1 = new Calculator();
		System.out.println(" "+c1.powerInt(2, 2));
		System.out.println(" "+c1.powerDouble(10.2, 2));
	}
	/*public static void main(String args[])
	{
		int input1 = 5;
		int op = 0;
		if(input1<0)
		{
			op = (input1%100)/10;
		}
		else if(input1 < 10)
		{
			op =-1;
		}
		else
		{
			op = (input1%100)/10;
			
		}
		if(op==-1){
			System.out.println((op));
		}
		else{
			
		
		System.out.println(Math.abs(op));
	}}*/
	}



