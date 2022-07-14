package Programs;

import java.util.ArrayList;
import java.util.List;

public class Que_5Max_lengthofString {
	public static void main(String[] args) {
		String[] a = { "raju", "arjun", "janaki" };

		List<Integer> slist = new ArrayList<Integer>();
		for (String g : a) {
			int temp = 0;
			char[] b = g.toCharArray();
			for (char ch : b) {
				temp++;

			}
			slist.add(temp);

		}

		Integer Maximumnum = slist.stream().max((e1, e2) -> e1 > e2 ? 1 : -1).get();
		int index = slist.indexOf(Maximumnum);
		System.out.println("Maximum length of name is " + a[index] + " length is = " + Maximumnum);

	}
}
