public class reverseArgs
{
	public static void main(String [] args)
	{
		int i;
		for(i>0; i = args.length-1; i--)
		{
			System.out.println("args[ " + i + "] = " +args[i]);
		}
	}
}