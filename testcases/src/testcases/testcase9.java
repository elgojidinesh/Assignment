package testcases;

public class testcase9 {
	public static String simbleremove(String str) {
		
	String convertedstring=str.replaceAll("[^a-z,A-z]", "");
		
		return convertedstring;
		
	}
	public static void main(String[] args) {
		System.out.println(testcase9.simbleremove("this$%#%#car"));
	}

}
