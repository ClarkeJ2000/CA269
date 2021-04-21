import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class EvenOdd
{
	public static void main(String [] args)
	{
		Scanner in = new Scanner(System.in);
		List<Integer> even = new ArrayList<Integer>();
		List<Integer> odd = new ArrayList<Integer>();

		System.out.println("Enter numbers: ");
		int i = in.nextInt();

		while(i != -1)
		{
			if(i % 2 == 0)
			{
				even.add(i);
			}
			else if(i % 2 != 0)
			{
				odd.add(i);
			}
			i = in.nextInt();
		}

	System.out.println("Odd: " + odd);
	System.out.println("Even: " + even);
	}
}