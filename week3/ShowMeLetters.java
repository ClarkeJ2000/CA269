public class ShowMeLetters
{
	public static String showLetters(String s, String letters)
	{
		if(letters.length() == 0)
		{
			letters = letters + "£";
		}
		String result = "";

		int i = 0;
		int j = 0;
		while(i<s.length())
		{
			j=0;
			while(j<letters.length()-1)
			{
				if(s.charAt(i) == letters.charAt(j))
				{
					break;
				}
				j++;
			}

			if(s.charAt(i)==letters.charAt(j))
			{
				result = result + s.charAt(i);
			}
			i++;
		}
		return result;
	}
}