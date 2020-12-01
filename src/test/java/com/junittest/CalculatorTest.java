package com.junittest;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import static org.mockito.Mockito.when;


@RunWith(MockitoJUnitRunner.class)
public class CalculatorTest {
	
	@InjectMocks
	Calculator cc=new Calculator();
	
	@Mock
	CalculatorService calcService;
	

	@Test
	public void testAdd() {
		//System.out.println("Not yet implemented");
		
		//int i=cc.add(3, 4);
		
		//assert i<5 :"test failed value should be less than 5";
		when(calcService.add(10,20)).thenReturn(30);
		//test the add functionality
		Assert.assertEquals(cc.add(10, 20),40,0);
	}

	@Test
	public void testSub() {
		System.out.println("Not yet implemented");
	}

	@Test
	public void testMult() {
		System.out.println("Not yet implemented");
	}

	@Test
	public void testDiv() {
		System.out.println("Not yet implemented");
	}

}
