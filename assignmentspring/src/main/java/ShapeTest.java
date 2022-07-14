import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import assignment14.Circle;
import assignment14.Rectangle;
import assignment14.Square;

public class ShapeTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		System.out.println("**********************CIRCLE**************");
		Circle circle=context.getBean("cirID",Circle.class);
		System.out.println("CIRCLE AREA :-  " +circle.area());
		System.out.println("CIRCLE-RADIUS :-  "+circle.side());
		
		
		System.out.println("*****************RECTANGLE*************");
		Rectangle rectangle=context.getBean("recID",Rectangle.class);
		System.out.println("RECTANGLE AREA :-  "+rectangle.area());
		System.out.println("RECTANGLE SIDE :-  "+rectangle.side());
		
		
		System.out.println("*********************SQUARE***********************");
		Square square=context.getBean("SQUAREID",Square.class);
		System.out.println("SQUARE AREA :-  "+square.area());
		System.out.println("SQUARE SIDE:-  "+square.side());
	}
}
