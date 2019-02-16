@FunctionalInterface
interface Add
{
	void sum(int a , int b);
}
public class LembdaDemo2 {
	public static void main(String[] args) {
		Add a = (x, y)-> System.out.println(x+y);
		a.sum(20, 30);
	}

}
