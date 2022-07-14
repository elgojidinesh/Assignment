package assignment7;

import org.springframework.context.ApplicationContext;	
import org.springframework.context.support.ClassPathXmlApplicationContext;

	public class ArrayTest {
	public static void main(String[] args) {
		 ApplicationContext obj = new ClassPathXmlApplicationContext("applicationContext.xml");
		Array obj1= (Array) obj.getBean("arraybean1");
		obj1.merge();
	}
	}