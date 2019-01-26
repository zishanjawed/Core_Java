package com.Zishan.c1;

public class Polymorphism {

	void justForFun(int... a)
	{
		System.out.println("Here are the values you have passed");
		for (int i : a)
		{
			System.out.print(" "+ i);
		}
		System.out.println();
	}
	
	public static void main(String...x)
	{
		Polymorphism obj = new Polymorphism();
		obj.justForFun(5);
		obj.justForFun(5,3);
		obj.justForFun(6,4,5,3);
		int[] i = {1,3,4,5,6};
		obj.justForFun(i);
		
		
	}
}
