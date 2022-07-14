package assignment8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ItemTest {

	public static void main(String[] args) {
		ApplicationContext obj = new ClassPathXmlApplicationContext("applicationContext.xml");
		Item i1=(Item) obj.getBean("itembean");
		i1.show();
		System.out.println("***********************************************");
		i1.ascending();
		System.out.println("**********************************************");
		i1.descending();
		System.out.println("****************************************");
		i1.removeduplicate();
	}
}
