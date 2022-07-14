package Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Que_1AvgMarks_que {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter numbers");
	List<Integer>aslist=new ArrayList<Integer>();
	
	for(int i=0;i<=5;i++) {
		int c=sc.nextInt();
		aslist.add(c);
		
	}
	
for(int d:aslist) {
	System.out.println(d);
}
	Double avgvalue=aslist.stream().collect(Collectors.averagingInt(e->e));
System.out.println("average value is = "+avgvalue);

}
}