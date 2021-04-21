public class SumArgs
{
	public static void main(String [] args)
	{
		int i;
		int total = 0;
		for(i=0; i<args.length; i++)
		{
			total = total + Integer.parseInt(args[i]);
		}
		System.out.println("The sum of all the args is " + total + ".");
	}

}