package testcases;

import org.junit.platform.engine.support.descriptor.CompositeTestSource;


	
		
//		int len=name1.length();
//		String rev;
//		for(int i=len-1;i>=0;i--) {
//			rev=name1.charAt(i);
//			if(name1.equals(name2)) {
//				System.out.println(true);
//			}
//			else {
//				System.out.println(false);
//			}
//		}
//		
//		return name2;
//		StringBuffer st=new StringBuffer();
//		StringBuilder name1=st.reverse();
//	
//	String rev="";
//	//if(str1.compareTo(rev)==0);
//	char a[]=str1.toCharArray();
//	int len=a.length;
//	for(int i=len-1;i>=0;i--) 
//		rev=rev+a[i];
//		if(rev.compareTo(str2)==0) {
//			return true;
//		}else {
//			return false;
//		}
////		rev.compareTo(str2) ;
////		
////	}
////		
////		
////		return str2;
//	
//	
//	}
//
//}
	

		public class pallindrome {

		    public static boolean palin1(String s1,String s2)
		    {
		        int i=0;
		        char s[]=s1.toCharArray();
		        int j=s.length-1;
		        while(i<j)
		        {
		            char temp=s[i];
		            s[i]=s[j];
		            s[j]=temp;
		            i++;
		            j--;
		        }
		        String str = new String(s);
		        if(str.equals(s2) && str.equals(s1))
		        {
		            System.out.println(s1 + "is palindrom");
		            return true;
		        }else
		        {
		            System.out.println(s1 + "is not");
		        return false;
		        }
		    }

		    public static void main(String[] args) {
		        pallindrome.palin1("mom", "mom");
		    }

		} 

