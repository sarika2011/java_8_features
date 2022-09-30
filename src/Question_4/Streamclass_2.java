package Question_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;

/*Given a list of objects of following class:
           class Employee{
           String fullName;
           Long salary;
           String city;
           }
          Get list of all unique firstNames of employees where their salary is less than 5000 and who live in delhi.
          Note: Full name is concatenation of first name, middle name and last name with single space in between.  
*/
public class Streamclass_2 {
	
	public static <T> Predicate<T> distinctByKey(Function<? super T, Object> keyExtractor) {
        Map<Object, Boolean> map = new ConcurrentHashMap<>();
        return t -> map.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
    }	
	
	public static void main(String[] args) {
	
		List<Employee> employees = new ArrayList<>();
		
		employees.add(new Employee("Raj sharma", 200L, "delhi"));
	    employees.add(new Employee("Karan Gupta", 300L, "delhi"));
	    employees.add(new Employee("Sarika Gupta", 20000L, "Lucknow"));
	    employees.add(new Employee("Raj Shobit", 200L, "delhi"));
	    employees.add(new Employee("Hardik taneja", 20000L, "Kolkata"));
	    employees.add(new Employee("sumit kumar", 20000L, "delhi"));
	    employees.add(new Employee("Raj sharma", 2000L, "Pune"));
	    
	    employees.stream()
	    	.filter(emp -> emp.salary<5000 && emp.city.equals("delhi"))
	    	.filter(distinctByKey(emp -> emp.name.split(" ")[0]))
	    	.forEach(System.out::println);
	
	}

}
