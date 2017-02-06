package ch03;

public class Ch03Ex02 {
	
	public static double average(Measurable[] objects)
	{
		double sum = 0.0;
		for( Measurable m : objects )
			sum += m.getMeasure();
		return (double)sum / objects.length;
	}
	
	public static Measurable largest(Measurable[] objects)
	{
		Measurable rtnMaxSalary = null;
		double maxSalary = 0.0;
		for( Measurable m : objects ) {
			if ( m instanceof Employee)
			{
				Employee e = (Employee)m;
				if ( maxSalary < e.getSalary() ) {
					maxSalary = e.getSalary();
					rtnMaxSalary = e;
				}
			}
		}
		return rtnMaxSalary;
	}
	
	public static void main(String[] args) {
		Employee[] employeeList = new Employee[5];
		employeeList[0] = new Employee("Lee", 100);
		employeeList[1] = new Employee("Seo", 300);
		employeeList[2] = new Employee("Choi", 150);
		employeeList[3] = new Employee("Park", 200);
		employeeList[4] = new Employee("Kim", 180);
		
		Measurable a = largest(employeeList);
		Employee ea = (Employee)a;
		
		System.out.println(ea.getName());
		System.out.println(ea.getSalary());
	}
}
