package FileHandling;

@FunctionalInterface
interface Demo
{
	public static void main(String[] args) {
		System.out.println("This is the main mmethod of Functional Interface");
		Demo.display();
	}
    void show();
    static void display()
    {
    	System.out.println("This is the static method of Functional display");
    }
    default void defaultMethod()
    {
    	System.out.println("This is the Default method of Dunctional Interface");
    }
	
}


public class FunctionalInterfaceDemo3 implements Demo
{
	//public void show()
	//{
		//System.out.println("This is the Abstract method of Functional Interface");
	//}
	public static void main(String[] args) {
		System.out.println("This is the main method of the class which implwmwnts the Functional Interface ");
		FunctionalInterfaceDemo3 obj = new FunctionalInterfaceDemo3();
		obj.defaultMethod();
		Demo.display();
		
	}

}
