package FileHandling;

@FunctionalInterface
public interface MainWithodClass {
	void show();
	public static void main(String ...strings )
	{
		
		System.out.println("Running main from inside the Interface without any class");
		
	}
	default void  dispaly()
	{
		System.out.println("This is a default method of the interface ");
		
	}
	
}
