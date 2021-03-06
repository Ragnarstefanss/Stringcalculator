package is.ru.stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

	public static void main(String args[]) {
      org.junit.runner.JUnitCore.main("is.ru.stringcalculator.CalculatorTest");
    }

	@Test
	public void testEmptyString() {
		assertEquals(0, Calculator.add(""));
	}

	@Test
	public void testOneNumber() {
		assertEquals(1, Calculator.add("1"));
	}

	@Test
	public void testTwoNumbers() {
		assertEquals(3, Calculator.add("1,2"));
	}	

	@Test
    public void testMultipleNumbers(){
    	assertEquals(11, Calculator.add("1,2,3,5"));
    }

    @Test
    public void testNewLine(){
    	assertEquals(6, Calculator.add("1\n2,3"));
    }

    @Test
    public void testTwoNewLines(){
    	assertEquals(21, Calculator.add("4,5\n8\n4"));
    }

    @Test
    public void testNegativeNumbers(){
    	assertEquals(2, Calculator.add("-1,2"));
    }

    @Test
    public void testTwoNegativeNumbers(){
    	assertEquals(5, Calculator.add("2,-4,3,-5"));
    }

    @Test
    public void biggerThan1000(){
    	assertEquals(2, Calculator.add("1000,2"));
    }

    @Test
    public void MultipleNumbersBiggerThan1000(){
    	assertEquals(104, Calculator.add("2,5000,2,100,1500"));
    }
}