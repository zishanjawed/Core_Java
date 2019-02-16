@FunctionalInterface
interface JustForFun
{
	void dispaly1();
	default void display2()
	{
		System.out.println("Hi, I am DEFAULT Method of the Funtional Interface");
	}
	static void display3()
	{
		System.out.println("Hi, I am the STATIC method of the functional Intrface");
	}
	
}
public class LembdaDemo4 {
	public static void main(String[] args) {
		JustForFun j = ()->System.out.println("Hi, I am the ABSTRACT method of the Functional Interface");
		j.dispaly1();
		j.display2();
		JustForFun.display3();
	}

}
