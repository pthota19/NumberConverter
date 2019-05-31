package com.virtusha.NumberConverterTests;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.virstusha.NumerConverter.NumberConverterUtil;

@RunWith(Parameterized.class)
public class NumberConveterTest {
	private long input;
	private String expected;
	
	
	public NumberConveterTest(long input,String expected)
	{
		this.input=input;
		this.expected=expected;
		
	}
	
	@Parameterized.Parameters
	   public static Collection<Object[]> primeNumbers() {
	      return Arrays.asList(new Object[][] {
	         { 0, "ZERO" },
	         {12,"TWELVE"},
	         {123,"ONE HUNDRED TWENTY THREE"},
	         {1234,"ONE THOUSAND TWO HUNDRED THIRTY FOUR"},
	         {12345,"TWELVE THOUSAND THREE HUNDRED FOURTY FIVE"},
	         {123456,"ONE HUNDRED TWENTY THREE THOUSAND FOUR HUNDRED FIFTY SIX"},
	         {1234567,"ONE MILLION TWO HUNDRED THIRTY FOUR THOUSAND FIVE HUNDRED SIXTY SEVEN"},
	         {12345678,"TWELVE MILLION THREE HUNDRED FOURTY FIVE THOUSAND SIX HUNDRED SEVENTY EIGHT"},
	         {123456789,"ONE HUNDRED TWENTY THREE MILLION FOUR HUNDRED FIFTY SIX THOUSAND SEVEN HUNDRED EIGHTY NINE"},
	         {-1234567,"MINUS ONE MILLION TWO HUNDRED THIRTY FOUR THOUSAND FIVE HUNDRED SIXTY SEVEN"}
	      });
	   }
	   
	   @Test
	   public void numberToWordTest()
	   {
		  String result= NumberConverterUtil.numberToWord(input);
		  Assert.assertEquals(expected,result);
	   }

	   
}

