import java.util.Collections;

public class ReverseMethod
{
	public static void reverse(int [] num)
	{
		for(int i = 0; i < num.length / 2; i++)
		{
			int temp = num[i];
			num[i] = num[num.length - i - 1];
			num[num.length - i - 1] = temp;
		}
	}
    // Create a static void method called reverse which takes an array of ints
}