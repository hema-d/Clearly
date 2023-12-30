package testngconceptclearly;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Aeertionsinjava {
	
	SoftAssert asser=new SoftAssert();

@Test
	
	void demo() {
	 
	asser.assertFalse(false);
	asser.assertEquals("Hema", "Happy");
			System.out.println("hema");
			asser.assertAll();
		}
	}


