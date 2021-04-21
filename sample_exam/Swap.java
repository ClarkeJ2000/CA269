public class Swap
{
	public static <TYPE> void swap(TYPE [] array, int i, int j)
	{
		TYPE tmp = array[i];
		array[i] = array[j];
		array[j] = tmp;
	}
}