package Programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Que_2DistinctMarks {
	public static void main(String[] args) {
		
	
	List<Integer>slist=Arrays.asList(304,871,87,78,78);
	List<Integer> hy=slist.stream().distinct().sorted().collect(Collectors.toList());
System.out.println(hy);
}
}

