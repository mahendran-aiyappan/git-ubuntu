package org.woodworks;

public class Factorial
{
	static long recursive(int number)
	{
		if (number==0)
			return 1;
		else 
			return recursive(number-1) * number;
	}

	static long iterative( int number)
	{
		long result=1;
		for (int i=number; i>0; i--)
		{
			result *= i;
		}
		return result;
	}

}
