package Programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Que_10_toMap_ToSet {
	public static void main(String[] args) 
	{
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee(1, "dinesh"));
		employeeList.add(new Employee(2, "elgoji"));
		employeeList.add(new Employee(3, "Chetan"));
		employeeList.add(new Employee(4, "Dev"));
		employeeList.add(new Employee(5, "Elegent"));
		employeeList.add(new Employee(6, "Fish"));
		employeeList.add(new Employee(7, "Gone"));
		employeeList.add(new Employee(8, "harini"));
		employeeList.add(new Employee(9, "Ink"));
		employeeList.add(new Employee(10, "Jagan"));

		System.out.println("====Converting list to map====");
		Map<Integer, String> map = employeeList.stream().collect(Collectors.toMap(E1->E1.getId(), E2->E2.getName()));
		System.out.println(map);

		System.out.println("====Converting list to set====");

		Set<Employee> Set = employeeList.stream().collect(Collectors.toSet());
		for (Employee emp : Set)
			System.out.println("Employee id = " + emp.id + " Employee name = " + emp.name);
	}
}
