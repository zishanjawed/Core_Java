@FunctionalInterface
interface OddOrEven
{
	String getOddOrEven(int n);
}
@FunctionalInterface
interface Printables
{
	void printDetaile(String s);
}

public class LambdaDemo4 {
	public static void main(String[] args) {
		OddOrEven o = (a)->{
			if (a%2==0)
				return "Even";
			else
				return "Odd";
		};
		Printables p = (s)-> System.out.println("The Number is " + s);
		String str = o.getOddOrEven(10);
		p.printDetaile(str);
		String str2 = o.getOddOrEven(15);
		p.printDetaile(str2);
		
		
		
	}

}
