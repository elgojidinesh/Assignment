package testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testcase7Test extends testcase7 {

	@Test
	void test() {
		testcase7 as=new testcase7();
		assertEquals(12321, testcase7.palindrome(12321));
		
	}

}
