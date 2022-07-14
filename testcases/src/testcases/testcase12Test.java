package testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testcase12Test {

	@Test
	void test() throws CloneNotSupportedException {
		testcase12 s1=new testcase12(101, "dinesh");
		testcase12 s2=(testcase12) s1.clone();
	assertEquals(true, testcase12.checkclone(s1, s2));
	}

}
