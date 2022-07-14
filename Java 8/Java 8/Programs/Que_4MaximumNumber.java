package Programs;

import java.util.Arrays;
import java.util.List;

public class Que_4MaximumNumber {
	public static void main(String[] args) {

		List<Integer> slist = Arrays.asList(304, 651, 87, 78, 98);
		Integer j = slist.stream().max(Integer::compare).get();
		System.out.println("maximum number of List is " + j);
		System.out.println("============================");
		Integer e3 = slist.stream().max((e1, e2) -> e1.intValue() > e2.intValue() ? 1 : -1).get();
		System.out.println("Maximum number = " + e3);
	
	}
}
