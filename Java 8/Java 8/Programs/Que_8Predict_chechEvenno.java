package Programs;


import java.util.Scanner;
import java.util.function.Predicate;

public class Que_8Predict_chechEvenno {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number");
	int a=sc.nextInt();
	Predicate<Integer> evenno=n->(n%2==0);
	if(evenno.test(a))
		System.out.println(a+" = Evenno");
	else
		System.out.println(a+"Oddno");
}
}