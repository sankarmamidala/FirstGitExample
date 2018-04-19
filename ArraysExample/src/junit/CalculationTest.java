package junit;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.Arrays.Calculation;
import com.Arrays.Sum;

public class CalculationTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println(" loading before the class");
	}

//	@Test
//	public void test() {
//		fail("Not yet implemented");
//	}

	@Test
	public void testCalcation() {
		Calculation cal = new Calculation();
	int c=	cal.addOrSubtract(5, 6, true);
	
	assertEquals(11, c);
		
	}
	
	@Test
	public void testCalcationNeg() {
		Calculation cal = new Calculation();
	int c=	cal.addOrSubtract(6, 5, false);
	
	assertEquals(1, c);
		
	}
	 
	@Test(expected=NullPointerException.class)
	public void testCalcationExc() {
		Calculation cal = new Calculation();
	int c=	cal.addOrSubtract(null, 5, false);
	
	assertEquals(1, c);
		
	}
	
	
	
	@Test
	public void test() {
		Sum cal = new Sum();
	int c=	cal.sum(2, 10);
	
	assertEquals(12, c);
		
	}
	
	
	
	
	
}
