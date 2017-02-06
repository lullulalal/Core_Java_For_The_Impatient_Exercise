package ch03;

public class Employee implements Comparable<Employee>, Measurable {
    private String name;
    private double salary;
        
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    
    public Employee(double salary) {
        this.name = "";
        this.salary = salary;
    }        
    
    public Employee(String name) {
        this.name = name;
    } 
    
    public Employee() {
        this("", 0);
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;    
    }
    
    public String getName() {
        return name;
    }
    
    public double getSalary() {
        return salary;
    }
    
    public int compareTo(Employee other) {
        return Double.compare(salary, other.salary);
    }
    
    public double getMeasure() {
    	return salary;
    }
    
    public String toString() {
       return "" + name + salary; 
    }
}