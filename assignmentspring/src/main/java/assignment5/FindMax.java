package assignment5;

import java.util.List;

public class FindMax {

	List<Integer> max;
	
	public List<Integer>getMax()
	{
		return max;
		
	}
	public void setMax(List<Integer>max)
	{
		this.max=max;
	}
	public void maxNum()
	{
		//int findMax = max.stream().max(m1,m2)->m1.intValue() >m2.intValue()?1: -1).get();
		
		int findMax = max.stream().max((m1, m2) -> m1.intValue() > m2.intValue() ?1: -1).get();
		
		System.out.println("maximum of number" +findMax);
	}
}
