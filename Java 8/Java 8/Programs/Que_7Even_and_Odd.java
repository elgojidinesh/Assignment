package Programs;

import java.util.ArrayList;
import java.util.List;

public class Que_7Even_and_Odd {
	public static void main(String[] args) {
		List<Item> aslist = new ArrayList();
		aslist.add(new Item(1, "Pen", 1200));
		aslist.add(new Item(2, "Pencil", 1503));
		aslist.add(new Item(3, "T.V", 89));
		List<Float> cheak = aslist.stream().filter(w -> w.price % 2 == 0).map(w -> w.getPrice()).toList();
		System.out.println("Even number are = " + cheak);

	}
}
