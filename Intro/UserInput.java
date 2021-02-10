import java.util.Scanner;
public class UserInput
{
	public static void main(String [] args)
	{
		Scanner keyboardinput = new Scanner(System.in);
		System.out.println("Enter username: ");
		String username = keyboardinput.nextLine();
		System.out.println("Hello, "  + username);

	}
}