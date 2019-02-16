@FunctionalInterface
interface Returnnable
{
	int getLenght(String s);
}
public class LembdaDemo3 {
	public static void main(String[] args) {
		Returnnable r1 = (s)-> {return s.length();};
		Returnnable r2 = (y)-> y.length();
		int L1 = r1.getLenght("Zishan");
		int L2 = r2.getLenght("Zishan Jawed");
		System.out.printf("The values of L1 is %d and L2 is %d\n",L1,L2);
		System.out.println(L1==L2);//Checking the Reference 
		Integer l1 = new Integer(L1);
		Integer l2 = new Integer(L1);
		System.out.println(l1.equals(l2));//Checking the Content
		
		
		
	}

}
