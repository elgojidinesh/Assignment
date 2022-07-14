package testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


	class EvenNoOfArrayTest {

	    @Test
	    public void evenoddsolve() {
	        assertEquals(6,EvenNoOfArray.CountingEvenOdd(new int[] {2,6,4,6,3,22,4,5,3,3,45}));
	    }

	
	
}
