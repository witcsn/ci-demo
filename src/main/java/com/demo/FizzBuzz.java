package com.demo;

public class FizzBuzz 
{
    String processNumber(int num)
	{
		if(num%15 == 0 )
		{
			return "FizzBuzz";
		}
		if(num%3 == 0 )
		{
			return "Fizz";
		}
		if (num%5 == 0)
		{
			return "Buzz";	
		}
		return String.valueOf(num);
	}
	
	String processNumbers (int[] numList)
	{
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < numList.length; i++)
		{
			result.append(processNumber(numList[i]));
			if (i < numList.length-1)
			{
				result.append(", ");
			}
		}

		return result.toString();
	}

}
