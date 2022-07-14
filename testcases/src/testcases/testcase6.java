package testcases;

public class testcase6 {
	public static int vowelcount(String str) {
		char[]chars=str.toCharArray();
		int count=0;
		for(char c:chars)
		switch(c){
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			count++;
			break; 
		}
		
		
		return count;
		
		
	}

}
