class Person{
	String name;
	Person(String name)
	{
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
class Employee extends Person{
	
	double annual_salary;
	String nat_insurance_no;
	int yr;
	Employee(String name , double annual_salary, String nat_insurance_no, int yr)
	{
		super(name);
		this.annual_salary = annual_salary;
		this.nat_insurance_no  = nat_insurance_no;
		this.yr = yr;
	}
	public double getAnnual_salary() {
		return annual_salary;
	}
	public void setAnnual_salary(double annual_salary) {
		this.annual_salary = annual_salary;
	}
	public String getNat_insurance_no() {
		return nat_insurance_no;
	}
	public void setNat_insurance_no(String nat_insurance_no) {
		this.nat_insurance_no = nat_insurance_no;
	}
	public int getYr() {
		return yr;
	}
	public void setYr(int yr) {
		this.yr = yr;
	}
	
}
public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee("Bhagyashri Badgujar",50000.0,"123-456-789" ,2012);
		System.out.println("Employee Name : "+e1.getName());
		System.out.println("Anual Salary : "+e1.getAnnual_salary());
		System.out.println("National Insurance Number : "+e1.getNat_insurance_no());
		System.out.println("Start Year : "+e1.getYr());

	}

}
