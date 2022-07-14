package assignment1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class RoleTest {
	public static void main(String args[])
	{
		ApplicationContext Obj=new ClassPathXmlApplicationContext("applicationContext.xml");
		Role  Obj1= (Role)Obj.getBean("que");
		 Obj1.show();
	}
}

	

