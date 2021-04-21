public abstract class Greeting
{
	public Animal(String name)
	{
		this.name = name;
	}
	abstract String hello();

	public String greeting()
	{
		return hello() + ", my name is " + name;
	}
	private String name;
}