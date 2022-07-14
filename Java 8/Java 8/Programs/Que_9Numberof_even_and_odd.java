package Programs;

import java.util.function.Predicate;

public class Que_9Numberof_even_and_odd {
public static void main(String[] args) {
	int c[]= {45,23,44,54,79};
	int evenno=0;
	int oddno=0;
	Predicate<Integer> aslist=n->(n%2==0);
for(int i=0;i<c.length;i++) {
	if(aslist.test(c[i])) {
		evenno++;
	}else
			oddno++;
	}
	System.out.println("total Oddno = "+oddno);
	System.out.println(" Total Evenno = "+evenno);
}
}

