package objectClonning;

public class ObjectClonning {

	public static void main(String[] args) {
	
		Abc obj = new Abc();
		obj.i = 10;
		obj.j = 20;
		
		// Shallow copy
		Abc obj1 = obj;
		System.out.println("Shallow Copy");
		System.out.println("obj "+obj);
		System.out.println("obj1 "+obj1);
		
		// Deep copy
		System.out.println("Deep Copy");
		Abc obj3 = new Abc();
		obj3.i = obj.i;
		obj3.j = obj.i;
		System.out.println("obj "+obj);
		System.out.println("obj3 "+ obj3);
	
		// Cloning object
		System.out.println("Cloning y using the Clone method");
		Abc obj4 = new Abc();
		try {
			obj4 = (Abc) obj.clone();
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
		}
		System.out.println("obj "+obj);
		System.out.println("obj4 "+obj4);
	
	}
}

class Abc implements Cloneable  //Cloneable is marker Interface 
{
	int i;
	int j;
	
	@Override 
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	
	@Override
	public String toString()
	{
		return "Abc {"+"i, j: "+i+" "+j+ "}"; 
	}
}