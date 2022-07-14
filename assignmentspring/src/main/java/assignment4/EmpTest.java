package assignment4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpTest {

	public static void main(String args[])
	{
		ApplicationContext ObjCtx=new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee Objemp= (Employee)ObjCtx.getBean("emp");
		Objemp.printEmp();
	}
}
