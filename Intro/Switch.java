public class Switch
{
	public static void main(String [] args)
	{
		char myGrade = 'A';
		switch(myGrade)
		{
			case 'A':
			System.out.println("You pass");
			break;
			case 'F':
			System.out.println("You Fail");
			break;
			default:
			System.out.println("Invalid Grade");
		}
	}
}