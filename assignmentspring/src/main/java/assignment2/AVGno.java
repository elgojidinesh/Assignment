package assignment2;

import java.util.List;
import java.util.stream.Collectors;

public class AVGno {
	List<Integer>num;

	@Override
	public String toString() {
		return "AVGno [num=" + num + "]";
	}
public void setNum(List<Integer> num) {
		this.num = num;
	}

public  List<Integer>getNum()
{ 
	return num;
	}

public void avgFind() {
	
	double avg = num.stream().collect(Collectors.averagingDouble(i -> i));
	System.out.println("Average of number : "+avg);
}
}
