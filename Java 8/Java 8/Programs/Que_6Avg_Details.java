package Programs;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Que_6Avg_Details {
public static void main(String[] args) {
	List<Item>aslist=new ArrayList();
	aslist.add(new Item(1,"Pen", 1200));
	aslist.add(new Item(2,"Pencil", 1500));
	aslist.add(new Item(3,"T.V",8900));
	Double avg = aslist.stream().collect(Collectors.averagingDouble(e -> e.price));

System.out.println("Average number is"+avg);
System.out.println("===============================");


List<Item> minimumavg= aslist.stream().filter(e1 -> e1.price <avg).map(e1->e1).toList();

for(Item a:aslist) {
	
	System.out.println(a.name+" "+a.price);
}
}
}
