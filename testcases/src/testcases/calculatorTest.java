package testcases;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class calculatorTest {

	@Test
	void test() {
    assertEquals(130,calculator.addtion(10, 120));
    
	}
	@Test
	void test1() {
		assertEquals(0.0, calculator.division(6, 0));
	}

	@Test
	void test2() {
		assertEquals(-0, calculator.multiplication(0, 10));
	}
	@Test
	void test3() {
		assertEquals(-25, calculator.subtraction(-15, 10)); 
	}
	@Test
	void test4() {
		assertEquals(2.23606797749979, calculator.squareroot(5));
	}
	@Test
	void test5() {
		assertEquals(25, calculator.power(5, 2));
	}@Test
	void test6() {
		assertEquals(15, calculator.modulus(55, 20));
		
	}
	@Test
	void test7() {
		assertEquals(1.709975946676697, calculator.cuberoot(5));
		
}}
