package com.Zishan.c1;

public class Multicatch {
	public static void main(String ... a)
	{
		int [] i = new int[3];
		try{
			//System.out.println(1/0);
			System.out.println(i[5]);
		}
		catch(ArithmeticException | ArrayIndexOutOfBoundsException  e )
		{
			System.out.print(e);
		}
	}
	

}
