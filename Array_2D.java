package com.Zishan.c1;

public class Array_2D {
	int A[][] = new int[2][3];
	void setter(int[][]x)
	{
		this.A= x;
	}
	void prinValue()
	{
		for (int i[]:this.A)
		{
			for (int j :i)
			{
				System.out.print(" "+j);
			}
			System.out.println();
		}
			
	}

	public static void main(String...x)
	{
		Array_2D obj1 = new Array_2D();
		Array_2D obj2 = new Array_2D();
		int b[][] = {
						{1,3,4},{4,5,6}
					};
		int c[][] = {
				{9,7,8},{7,0,10}
			};
		obj1.setter(b);
		obj2.setter(c);
		obj1.prinValue();
		obj2.prinValue();
		
		
	}

}
