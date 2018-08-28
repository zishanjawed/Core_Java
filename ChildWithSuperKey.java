class Parent
{
	int x = 10;
}
class ChildWithSuperKey extends Parent 
{
	int x= 20;
	void show()
	{
		System.out.println("X in child "+ x);
		System.out.println("X in parent"+super.x);
	}
	public static void main(String [] arvg)
	{
		ChildWithSuperKey obj = new ChildWithSuperKey();

		obj.show();
	}
}