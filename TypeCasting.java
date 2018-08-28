class Pops
{
	int x = 5;
}

class Dadaji extends Pops 
{
	int x = 10;
}

class Parent extends Dadaji 
{
	int x = 20;
}

class TypeCasting extends Parent
{
	int x = 30;
	void show()
	{
		System.out.println("X in Child : " + x);
		System.out.println("X in parent : " + super.x);
		System.out.println("X in dadaji : " + ((Dadaji)this).x);
		System.out.println("X in Dadaji's father :" + ((Pops)this).x);
	}
	
	public static void main(String [] arvg)
	{
		TypeCasting obj = new TypeCasting();
		obj.show();

	}

}