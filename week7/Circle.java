public class Circle extends Shape
{
	public double radius1;

	public Circle(String name, double radius)
	{
		super(name);
		radius1 = radius;
	}

	public double area();
	{
		return Math.PI * (radius1 * radius1);
	}
}