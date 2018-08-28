class Aggeragation 
{
	String name;
	int id;
	Address add;
	Aggeragation(String name, int id, Address add)
	{
		this.name = name;
		this.id = id;
		this.add = add;
	}

	void printDetails()
	{
		System.out.println("Name : " + name + " ID : "+ id + " city : "+ add.city + " state : "+ add.state);
	}

	public static void main(String[] arvg)
	{
		 Address add = new Address("New Delhi", "Delhi");
		 Aggeragation obj = new Aggeragation("Zishan",67, add);
		 obj.printDetails();

	}

}