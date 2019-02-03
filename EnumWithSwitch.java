enum Month{
	JAN,FAB,MARCH,APR,MAY,JUNE,JUL,AUG,SEPT,OCT,NOV,DEC
}
public class EnumWithSwitch {
	public static void main(String ... a){
	Month m = Month.JAN;
			
	switch(m){
	
		case JAN:
			System.out.println("This is JANUARY");
		break;
		
		case FAB:
			System.out.println("This is FEBUARY ");
		break;
		
		case MARCH:
			System.out.println("This is MARCH");
		break;

		case APR:
			System.out.println("This is APRIL");
		break;
		
		case JUNE:
			System.out.println("This is MAY");
		break;
		
		default:
			System.out.println("It's JUNE");
		

	}
	}
}
