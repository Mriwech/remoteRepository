package edu.esprit.test;

import org.junit.Assert;
import org.junit.Test;

import edu.esprit.calculator.Calculator;



public class CalculatorTest {
	
	@Test	
	public void itSouldRetur10(){
			Long[] params = {1l,2l,3l,4l};
			Calculator calc = new Calculator();
			Long actual = calc.add(params);
			Long expected = 10l;
			
			Assert.assertEquals(expected,actual);
			
			}
		}
