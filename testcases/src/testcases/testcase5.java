package testcases;

public class testcase5 {
	public static int pythagoras(int a,int b,int c) {
		int max=a;
		if(b>max) {
			max=b;
			}
		if(c>max) {
			max=c;
		}
	if(max==a) {
		boolean flag=(a*a)==(b*b)+(c*c);
		}
	else if(max==b){
		boolean flag=(b*b)==(a*a)+(c*c);	
		}else if(max==c) {
			boolean flag=(c*c)==(a*a)+(b*b);
		}
		
		
		return c;
		
	}

}
