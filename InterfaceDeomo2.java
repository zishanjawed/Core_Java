package Java_by_Navin_reddy;

public class InterfaceDeomo2 {
	public static void main(String ...strings )
	{
		ImpiMarkup obj = new ImpiMarkup();
		if (obj instanceof MarkupInterface)
		{
			obj.configration();
		}
		else
		{
			System.out.println("You are not authorized");
		}
	}
	
	

}
interface MarkupInterface 
{
	
}
class ImpiMarkup implements MarkupInterface
{
	void configration ()
	{
		System.out.println("You are authorized ....");
	}
	
}