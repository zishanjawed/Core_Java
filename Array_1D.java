package com.Zishan.c1;

public class CatchWithMultipleParameter {
	
	static public void main(String ... a)
	{
		int A []= new int[4];
		int B[]= {1,3,4,5};
		for (int i =0;i<A.length; i++)
		{
			A[i] = i+2;
			B[i]= i+5;
		}
		System.out.println("1 D Array");
		System.out.println("Array A  :");
		for (int i : A)
		{
			System.out.print(i);
		}
		System.out.println();
		System.out.println("Array B  :");
		for (int i : B)
		{
			System.out.print(i);
		}
		System.out.println();
		
		
		
	
	}

}
