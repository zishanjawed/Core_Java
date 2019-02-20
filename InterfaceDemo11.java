 package Java_by_Navin_reddy;
 interface Abc
 {
	 void show(String str);
 }
 class Impuls implements Abc
 {
	 public void show(String str)
		{
			System.out.println("Calling show method with : "+str);
			
		}

	
}

public class InterfaceDemo11 {
	
	public static void main(String[] args) {
		Impuls obj = new Impuls();
		obj.show("The child class's object");
		Abc obj1 = new Impuls();
		obj1.show("Interface object");
		Abc obj3 = new Abc(){
			public void show(String str)
			{
				System.out.println("Calling with the help of annonymous calss");
			}
		};
		obj3.show("");
		Abc obj4 = (String str)->System.out.println("Calling show method with :" + str);
		obj4.show("The help of lambda expression ");
		
	}

}
