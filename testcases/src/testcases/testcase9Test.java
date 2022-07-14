package testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testcase9Test extends testcase9 {

	@Test
	void test() {
		testcase9 as=new testcase9();
		assertEquals("qwerREWhello", testcase9.simbleremove("qwer@#$REWhello"));
	}

}
