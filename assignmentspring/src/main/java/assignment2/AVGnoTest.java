package assignment2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AVGnoTest {
	public static void main(String args[])
	{
		ApplicationContext Context =new ClassPathXmlApplicationContext("applicationcontext.xml");
		AVGno avgno =Context.getBean("avgId",AVGno.class);
		
		avgno.avgFind();
	}

}
