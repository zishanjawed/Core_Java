public class EnumDemo3 {
	enum Month{
		JAN,FAB,MARCH,APR,MAY,JUNE,JUL,AUG,SEPT,OCT,NOV,DEC
	}
	public static void main(String ...s)
	{
		Month m = Month.JUNE;
		System.out.println(m+" Comes at "+m.ordinal());
	
	}
}

