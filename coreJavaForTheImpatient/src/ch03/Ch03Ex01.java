package ch03;

public class Ch03Ex01 {
	
	public static double average(Measurable[] objects)
	{
		double sum = 0.0;
		for( Measurable m : objects )
			sum += m.getMeasure();
		return (double)sum / objects.length;
	}
	
	public static void main(String[] args) {
		Employee[] employeeList = new Employee[5];
		employeeList[0] = new Employee("Lee", 100);
		employeeList[1] = new Employee("Seo", 300);
		employeeList[2] = new Employee("Choi", 150);
		employeeList[3] = new Employee("Park", 200);
		employeeList[4] = new Employee("Kim", 180);
		
		double a =average(employeeList);
		
		System.out.println(a);
	}
}
