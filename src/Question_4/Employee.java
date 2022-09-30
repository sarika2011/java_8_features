package Question_4;

public class Employee {
	
	public String name;
	
	public Long salary;
	
	public String city;

	public Employee(String name, Long salary, String city) {
		super();
		this.name = name;
		this.salary = salary;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", city=" + city + "]";
	}
	
	

}
