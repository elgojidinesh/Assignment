package assignment6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class VowelTest {

	public static void main(String[] args) {
		
		ApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
		Vowel vowel=(Vowel)context.getBean("que6");
		vowel.result();
	}
}
