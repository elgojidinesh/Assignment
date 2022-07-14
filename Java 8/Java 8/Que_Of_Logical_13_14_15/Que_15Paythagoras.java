package Que_Of_Logical_13_14_15;

public class Que_15Paythagoras {
public static void main(String[] args) {
	

int a[]= {3,4,5,12,13,4,8,45,89};
int temp=0;
for(int i=0;i<a.length-3;i++) {
	
	int b= a[i]*a[i];
	int c=a[i+1]*a[i+1];
	int d=a[i+2]*a[i+2];
	if(b==c+d||c==b+d||d==b+c) {
		temp++;
		System.out.println("Paythagoras theorem satisfying pair= "+a[i]+" "+a[i+1]+" "+a[i+2]);
	}
}
	System.out.println("Total Number of pair = " +temp);
	
}
}

