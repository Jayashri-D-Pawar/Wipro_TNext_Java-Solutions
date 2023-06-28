class InvalidCountryException extends Exception{
	public InvalidCountryException()
	{
		super();
		System.out.println("Invalid Country Exception..");
	}
}
public class UserRegistration {

	void registerUser(String userName, String userCountry) throws InvalidCountryException
	{
		if(userCountry!="India")
		{
			throw new InvalidCountryException();
		}
		if(userCountry=="India")
		{
			System.out.println("User Registration Done Successfully...");
		}
	}
	public static void main(String[] args) throws InvalidCountryException {
		// TODO Auto-generated method stub
		UserRegistration user = new UserRegistration();
		try{
		user.registerUser("Mickey", "India");
		}
		catch(InvalidCountryException e)
		{
			
		}

	}

}
