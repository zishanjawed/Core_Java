class Parent
{   /*
	class that contains two  int type data members and show member function

	*/
	Integer x;
	Integer y;
	void show()
	{	/* 
			input: void 
			output: print values of x and y 
		*/
		System.out.println("The value of X : " + x);
		System.out.println("The value of Y : " + y);
	}
}
class Child extends Parent
{
	/*
	Child class that extend parent class and use parent data members (x,y) and member function to print two 
	int type values entered at run time 

	*/
	void setValues(int x, int y)
	{	/*
			input : x and y both int type and set these values to the parent data member x,y 
			output : void
		*/
		this.x = x;
		this.y = y;
	}
	public static void main(String [] argv)
	{
		Child c = new Child();
		// the arvg contain nameOfProgram at index 0 , at index 1: 1st value and at 2 :2nd value
		c.setValues(Integer.parseInt(argv[0]),Integer.parseInt(argv[1]));
		c.show();
	}
}