package Programs;

import java.util.ArrayList;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;


public class Que_3EmployeeNameUnique {
	public static void main(String[] args) {
		List<String> a1 = new ArrayList<String>();
		a1.add("dinesh");
		a1.add("Nikhil");
		a1.add("dinesh");
		a1.add("Dipesh");
	List<String> hy=a1.stream().distinct().sorted().collect(Collectors.toList());
	System.out.println(hy);
	}
	
}                