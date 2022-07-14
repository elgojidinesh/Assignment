package assignment4;

public class Employee {
	private int empid;
	private String ename;
	private int esalary;
	Department objdep;
	
	public Employee() {
		super();
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getEsalary() {
		return esalary;
	}
	public void setEsalary(int esalary) {
		this.esalary = esalary;
	}
	public Department getObjdep() {
		return objdep;
	}
	public void setObjdep(Department objdep) {
		this.objdep = objdep;
	}
	
	void printEmp()
	{
		
//		System.out.println("EMPLOYEE DEPARTMENT ID: "   +objdep.getDid());
//		System.out.println("DEPARTMENT NAME: "    +objdep.getDname());
		
		System.out.println("Department Detail :");
		System.out.println(objdep);
		System.out.println("EMLOYEE ID: "+empid);
		System.out.println("EMPLOYEE NAME: "+ename);
		System.out.println("EMPLOYEE SALARY: "   +esalary);
	}
	
}
