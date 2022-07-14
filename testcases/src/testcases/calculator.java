package testcases;

public class calculator {
	
	public static int addtion(int a,int b) {
		int resulte;
		resulte=a+b;
		return resulte;
		}
	public static int subtraction(int a,int b) {
		int resulte;
		resulte=a-b;
		return resulte;
		}
	public static int multiplication(int a,int b) {
		int resulte;
		resulte=a*b;
		return resulte;
		}
	
	public static double  division(double a,double b) throws ArithmeticException{
		double resulte;
		if(a>0 &&b>0) {
			
	return	resulte=a/b;
		}else {
		return 0;
	}
		
		
		}
	
	public static double  squareroot(int a) {
		double resulte;
		return resulte=Math.sqrt(a);
		}
	public static double  power(int a,int b) {
		double resulte;
		if(a>0 && b>0) {
		
		return resulte=Math.pow(a, b);
		}else {
			return 0;
		}
	
		}
	public static double  modulus(int a,int b) {
		double resulte;
		return resulte=a%b;
		}
	public  static double cuberoot(int a) {
		double resulte;
		if(a>0) {
			return resulte= Math.cbrt(a);
		}
		else {
			return 0;
		}
	}
}
