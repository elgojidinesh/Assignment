package assignment12;

public class Employee {

	
	String ename;
	int salary;
	int id;
	String department;
	public Employee(String ename, int salary, int id, String department) {
		super();
		this.ename = ename;
		this.salary = salary;
		this.id = id;
		this.department = department;
	}
	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", salary=" + salary + ", id=" + id + ", department=" + department + "]";
	}

	

	
	



	
	
	

}
