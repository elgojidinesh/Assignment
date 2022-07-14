package testcases;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

		class ItemCheckTest {

		    @Test
		    void test() {
		        ItemCheck i=new ItemCheck(1, "Pen", 200,500,LocalDate.of(2022, 11, 23),LocalDate.of(2023, 2, 10));

		                assertEquals(true,i.createObject(i));
	}
	
		
	}
	


