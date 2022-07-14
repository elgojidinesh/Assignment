package Programs;

import java.util.ArrayList;
import java.util.List;

public class Que_12Maxnumber_In_array {
public static void main(String[] args) {
	List<Integer>slist=new ArrayList<Integer>();
	Max u=(int a[])->{
		for(int i=0;i<a.length;i++) {
			slist.add(a[i]);
			
		}
		Integer Maximum_number = slist.stream().max((e1, e2) -> e1 > e2 ? 1 : -1).get();
		System.out.println("Maximum number in Array = "+Maximum_number);
	};
	u.maxArray(new int[]{76,890,87,56,78});
}
}
