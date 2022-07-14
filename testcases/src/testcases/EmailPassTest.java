package testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmailPassTest {

	@Test
	void test() throws Exception {
		assertEquals(true,EmailPass.checkdetails("dinesh@123", "12345678"));
	}

}
