class Dadaji
{
	int x = 10 ;
}

class Parent extends Dadaji 
{
	int x = 20;
}

class ChildWithSuperKeyword extends Parent
{
	int x = 30;
	void show()
	{
		System.out.println("X in Child : " + x);
		System.out.println("X in parent : " + super.x);
		System.out.println("X in dadaji : " + ((Dadaji)this).x);
	}
	
	public static void main(String [] arvg)
	{
		ChildWithSuperKeyword obj = new ChildWithSuperKeyword();
		obj.show();

	}

}