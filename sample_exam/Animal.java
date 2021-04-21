public class Animal
{
	String name;
	public Animal(String aname)
	{
		name = aname;
	}

	public String greeting()
	{
		return "Hello, my name is " + name;
	}
}