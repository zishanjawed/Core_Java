package com.zishan.video69;

public class ObjCounter {
	static int counter = 0;
	ObjCounter()
	{
		++counter;
	}
	public static void main(String[] args) {
		
		ObjCounter obj1 = new ObjCounter();
		ObjCounter obj2 = new ObjCounter();
		ObjCounter obj3 = new ObjCounter();
		System.out.println("The total number of object created is "+ counter);
	}
	

}
