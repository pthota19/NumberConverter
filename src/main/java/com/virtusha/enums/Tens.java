package com.virtusha.enums;

import java.util.HashMap;
import java.util.Map;

public enum Tens {
	TWENTY(2), THIRTY(3), FOURTY(4), FIFTY(5), SIXTY(6), SEVENTY(7), EIGHTY(8), NINETY(
			9);
	private int place;

	Tens(int place)
	{
		this.place=place;
	}

	public static final Map<Integer,Tens> valuesMap;
	
	static
	{
		valuesMap= new HashMap<>();
		Tens[] values=Tens.values();
		for(Tens val:values)
		{
			valuesMap.put(val.place, val);
		}
	}

}
