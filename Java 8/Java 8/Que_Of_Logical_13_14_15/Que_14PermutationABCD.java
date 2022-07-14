package Que_Of_Logical_13_14_15;

import java.util.Scanner;

public class Que_14PermutationABCD {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter Charrectors");
	String str=sc.next();
	int n= str.length();
	
Que_14PermutationABCD per=new Que_14PermutationABCD();
per.permute(str,0,n-1);


	}
private void permute(String str,int s,int e) {
	if(s==e)
		System.out.println(str);
	else {
		for(int i=s;i<=e;i++) {
			str=swap(str,s,i);
			permute(str,s+1,e);
			str=swap(str,s,i);
			
			
		}
	}
		
}
public String swap(String s,int i,int j) {
	char cnt;
	char[] chararr=s.toCharArray();
	cnt=chararr[i];
	chararr[i]= chararr[j];
	chararr[j]=cnt;
	
	return String.valueOf(chararr);
	

}
}
