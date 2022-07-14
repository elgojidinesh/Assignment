package assignment5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MaxTest {

	public static void main(String[] args)
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationcontext.xml");
			FindMax findMax =context.getBean("maxID",FindMax.class);
			findMax.maxNum();
		}
	}

