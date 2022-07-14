package testcases;

public class EvenNoOfArray {
	public static int CountingEvenOdd(int arr[]) {
	    int evencount=0;
	    int oddcount=0;

	    for(int i=0; i<arr.length;i++)
	    {
	        if((arr[i] & 1) == 1)
	            oddcount++;
	        else
	            evencount++;
	    }
	    System.out.println("Number of even" + "elements = " +evencount);
	    return evencount;

	}
	public static void main(String[] args) {
	    System.out.println(EvenNoOfArray.CountingEvenOdd(new int[] {2,6,4,6,3,22,4,5,3,3,45}));
	}
	}
