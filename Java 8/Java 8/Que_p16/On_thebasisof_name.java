package Que_p16;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class On_thebasisof_name {
public static void main(String[] args) {
	List<Item>slist=new ArrayList<Item>();
	slist.add(new Item("Pen", "Stationary", "2002-1-23", "2022-5-13", 2341));
	slist.add(new Item("Shirt", "Cloth", "2000-1-8", "2022-5-1", 2300));
	slist.add(new Item("Laptop", "Company", "1997-6-18", "2022-2-11", 7300));
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter name");
	String b=sc.next();
	
	List<Item>s1=slist.stream().filter(s->s.name.equals(b)).collect(Collectors.toList());
	for(Item s2:s1) 
		System.out.println(s2.name+", "+s2.catagory+", "+s2.dom+", "+s2.doe+", "+s2.price);
}
}
