import java.util.Random;

public class TestCompartment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		Compartment compartment[] = new Compartment[10];
		
		
		for(int i=0;i<10;i++)
		{
			int comptype = random.nextInt(4)+1;
			
			switch(comptype)
			{
			case 1:compartment[i]=new FirstClass();
			break;
			case 2:compartment[i]=new Ladies();
			break;
			case 3:compartment[i]=new General();
			break;
			case 4:compartment[i]=new Luggage();
			break;
			default:System.out.println("Invalid Compartment...");
			}
			System.out.println(compartment[i].noitce());
		}
		
	}

}
