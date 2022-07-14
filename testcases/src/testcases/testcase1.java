package testcases;

public class testcase1 {
public static int Hcf(int a,int b) {
	int g=0;
	for(int i=1;i<=a ||i<=b;i++) {
		if(a%i==0&&b%i==0) 
			g=i;
		
		
		
	}
//	System.out.println(""+g);
	return g;
	
}
//public static void main(String[] args) {
//	testcase1 as=new testcase1();
//	as.Hcf(50, 60);
//}
}
