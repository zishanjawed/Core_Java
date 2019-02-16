@FunctionalInterface
interface Printable
{
	void display();
}
public class Lemda1 {
	public static void main(String ...strings){
		Printable p = ()->System.out.println("\tHello\n\tHi\n\tBye");
		p.display();
	}
}