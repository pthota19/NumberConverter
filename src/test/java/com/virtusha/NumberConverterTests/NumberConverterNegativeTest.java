package com.virtusha.NumberConverterTests;

import org.junit.Test;

import com.virstusha.NumerConverter.NumberConverterUtil;
import com.virtusha.Exceptions.InvalidNumberException;

public class NumberConverterNegativeTest {
	
	@Test(expected=InvalidNumberException.class)
	public void testWithBillion()
	{
		NumberConverterUtil.numberToWord(9999999999l);
		
	}

}

