package com.Zishan.c1;

public class Array_3D {
	int A[][][];
	String str;
	void setter(int a[][][])
	{
		this.A = a;
	}
	void printValue(String str)
	{
		this.str= str;
		
		System.out.println("Here is your 3D array");
		System.out.println(str);
		for (int i[][]:A)
		{
			for (int j[]:i)
			{
				for (int k : j)
				{
					System.out.print(k+" ");
				}
				System.out.println();
			}
		System.out.println();
		}
		System.out.println();
		System.out.println();
	}
	public static void main(String ... x)
	{
		Array_3D  obj1 = new Array_3D();
		Array_3D  obj2 = new Array_3D();
		int a[][][] = {
							{
								{1,2,3,4},{2,3,4,5},{2,5,6,7}
							},
							{
								{1,2,3,4},{2,3,4,5},{2,5,6,7}
							},
							{
								{1,2,3,4},{2,3,4,5},{2,5,6,7}
							}
					  };
		int b[][][] = {
				{
					{11,21,31,41},{21,31,41,51},{21,51,61,71}
				},
				{
					{12,42,35,44},{12,13,41,51},{21,51,61,71}
				},
				{
					{11,21,31,14},{12,31,14,15},{12,151,16,17}
				}
		  };
		obj1.setter(a);
		obj2.setter(b);
		obj1.printValue("This is 1st Array");
		obj2.printValue("This is secound Array");
	}
	
	

}
