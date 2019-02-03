enum Month{
	JAN,FAB,MARCH,APR,MAY,JUNE,JUL,AUG,SEPT,OCT,NOV,DEC
}
public class EnumDemo1 {
	public static void main(String...a){
		Month m = Month.JAN;
		Month A[] = Month.values();
		System.out.println(m);
		for (Month i :A )
		{
			System.out.print(i+"\t");
		}
	}

}
