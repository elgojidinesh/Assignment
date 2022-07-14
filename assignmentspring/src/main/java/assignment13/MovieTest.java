package assignment13;

import java.math.BigInteger;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MovieTest {
	public static void main(String[] args) {

		ApplicationContext obj = new ClassPathXmlApplicationContext("applicationContext.xml");
		movie vm=(movie) obj.getBean("rating");
		vm.show();


}
}
