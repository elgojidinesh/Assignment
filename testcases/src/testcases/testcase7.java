package testcases;

public class testcase7 {
	public static int palindrome(int orgno) {
	int rev=0;
	int num=orgno;
	 	while(num!=0) {
	 		rev=rev*10+num%10;
	 		num=num/10;
	 		if(num==rev);
	 	}
		
		
		return rev;
		
	}

}
