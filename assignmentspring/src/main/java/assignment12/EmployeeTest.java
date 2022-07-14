package assignment12;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeTest {
	public static void main(String[] args) {

	       List<Employee> list = new ArrayList<>();

	        ApplicationContext context =  new ClassPathXmlApplicationContext("applicationContext.xml");

	        Employee employee1 = context.getBean("emp1bean",Employee.class);
	        Employee employee2 = context.getBean("emp2bean",Employee.class);

	        list.add(employee1);
	        list.add(employee2);

	        Employee max = list.stream().max((s1 , s2) -> s1.salary > s2.salary ? 1: -1).get();
	        System.out.println("Maximum EmployeeTest of dep : " + max);

	        //Print name of employees having highest EmployeeTest
	        System.out.println("\nPrint name of employees having highest EmployeeTest : "+max.ename);

	        Double avg = list.stream().collect(Collectors.averagingDouble(e -> e.salary));
	        List<Employee> minavg = list.stream().filter(m -> m.salary < avg).collect(Collectors.toList());

	        System.out.println("\nName of employee having EmployeeTest less than or equal to average EmployeeTest");
	        for(Employee e : minavg) {
	            System.out.println("Name of employee : "+e.ename+" , "+"Salary : "+e.salary);
	        }
	        List<String> department1 = list.stream().map(s -> s.department).distinct().collect(Collectors.toList());
	        for (String dept : department1) {
	            Double avg1 = list.stream().filter(a -> a.department.equals(dept)).collect(Collectors.averagingDouble(d -> d.salary));
	            System.out.println("\nAverage Salary of each department : \nAverage Salary : "+avg1+ " Department : "+dept);

	        }

	    }
	}
		

