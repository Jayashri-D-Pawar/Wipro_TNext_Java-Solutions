
public class _18_PrimeNumberPrinting {

	public static void main(String[] args) {

		for(int no =10;no<=99;no++){
			int flag=0;      
			if(no==1||no==2||no==3){
				flag=0;	
			}
			else if(no%2==0||no%3==0||no%11==0||no%5==0){
				flag=1;
			}
			else 
			{
				for(int i=5;i*i<no;i+=7)
					{
						if(no%i==0){
							flag=1;
					}
			}
			
			
		}
			if(flag==0){
				System.out.println(no);	
					
			}
					}

	}

}
