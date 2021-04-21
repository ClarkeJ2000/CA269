public class Max
{
	static <TYPE> int max(Thing i, Thing j)
	{
		if(i.greaterThan(j))
		{
			return i;
		}
		return j;
	}
}