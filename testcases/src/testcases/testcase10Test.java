package testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testcase10Test {

	@Test
	void test() {
		assertEquals("apple-orange-banana-lemon",testcase10.addwords(new String[]{"apple","orange","banana","lemon"}));
	}

}
