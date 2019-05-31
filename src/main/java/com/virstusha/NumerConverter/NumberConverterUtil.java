package com.virstusha.NumerConverter;

import com.virtusha.Exceptions.InvalidNumberException;
import com.virtusha.enums.Other;
import com.virtusha.enums.Tens;
import com.virtusha.enums.Unit;

public class NumberConverterUtil {

	public static String numberToWord(long number) {
		if(number<0)
			return "MINUS"+" "+numberToWord(-number);
		if (number < 20)
			return Unit.values[(int)number].name();
		if (number < 100)
			return Tens.valuesMap.get((int)(number / 10)).name()
					+ (number % 10 != 0 ? " " + numberToWord(number % 10) : "");
		if (number < 1000)
			return Unit.values[(int)number / 100].name()
					+ " "
					+ Other.HUNDRED.name()
					+ (number % 100 != 0 ? " " + numberToWord(number % 100)
							: "");
		if (number < 1000000)
			return numberToWord(number / 1000)
					+ " "
					+ Other.THOUSAND.name()
					+ (number % 1000 != 0 ? " " + numberToWord(number % 1000)
							: "");
		if (number < 1000000000)
			return numberToWord(number / 1000000)
					+ " "
					+ Other.MILLION.name()
					+ (number % 1000000 != 0 ? " "
							+ numberToWord(number % 1000000) : "");
		else
			throw new InvalidNumberException("Enter numer Less than billion");

	}
}
