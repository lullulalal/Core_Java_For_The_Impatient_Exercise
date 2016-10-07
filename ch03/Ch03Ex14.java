import java.util.Arrays;
import java.util.Comparator;

public class Ch03Ex14 {

	public static void main(String[] args) {
		Employee[] employeeList = new Employee[15];
		
		employeeList[0] = new Employee("Lee", 125);
		employeeList[1] = new Employee("Seo", 300);
		employeeList[2] = new Employee("Choi", 125);
		employeeList[3] = new Employee("Park", 200);
		employeeList[4] = new Employee("Kim", 180);
		employeeList[5] = new Employee("Ha", 180);
		employeeList[6] = new Employee("No", 400);
		employeeList[7] = new Employee("Jung", 500);
		employeeList[8] = new Employee("Yoo", 523);
		employeeList[9] = new Employee("Do", 125);
		employeeList[10] = new Employee("Kang", 125);
		employeeList[11] = new Employee("Kwon", 125);
		employeeList[12] = new Employee("Yun", 125);
		employeeList[13] = new Employee("Chae", 125);
		employeeList[14] = new Employee("Cha", 125);
		
		/*Comparator<Employee> bySalary = Comparator
				.comparing(Employee::getSalary)
				.thenComparing( (e1, e2) -> {
					return (int)(e1.getName().charAt(0) - e2.getName().charAt(0)); 
				});*/
		
		Comparator<Employee> bySalary2 = Comparator
				.comparing(Employee::getSalary)
				.thenComparing(Employee::getName);
		
		//Arrays.sort(employeeList, bySalary2);
		
		//reverse order
		Arrays.sort(employeeList, bySalary2.reversed());
		
		for (Employee e : employeeList)
			System.out.println(e);
		
	}

}
