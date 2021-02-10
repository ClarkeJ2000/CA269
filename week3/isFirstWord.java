public class isFirstWord
{
	public static boolean containsLetter(String s, char c)
	{
		int i;
		for(i=0;i<s.length();i++)
		{
			if(s.charAt(i)==c)
			{
				return true;
			}
		}
		return false;
	}
}