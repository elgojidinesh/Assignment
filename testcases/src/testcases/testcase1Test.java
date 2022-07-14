package testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testcase1Test extends testcase1{

	@Test
	void test() {
		testcase1 as=new testcase1();
		assertEquals(10,testcase1.Hcf(100, 10));
		
	}

}
