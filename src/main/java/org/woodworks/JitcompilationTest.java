
package org.woodworks;

import java.util.Random;

public class JitcompilationTest
{
	private static int blackhole;
	public static void main(String args[])
	{
		int[] numbers = randoms(5_000);


		for (int i=0; i<100; ++i)
		{
			long start = System.nanoTime();
			int result = sum(numbers);
			long end = System.nanoTime();
			System.out.printf("\t%d\t%d\n",result, end-start);
		}
	}

	public static int[] randoms(int number)
	{
		int[] returnValue = new int[number];
		Random random = new Random();
		for (int i=0; i<number; ++i)
		{
			returnValue[i]=random.nextInt();
		}
		return returnValue;
	}

	public static int sum(int[] numbers)
	{
		int sum = 0;
		for (int i=0;i<numbers.length;i++)
		{
			sum += numbers[i];
		}
		return sum;
	}
}