package assignment14;

public class Rectangle implements Shape {
	private  double length;
	private double breadth;
	
	

	public Rectangle(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public double area() {
		
		return length*breadth;
	}

	@Override
	public double side() {
		
		return 2*(length+breadth);
	}

}
