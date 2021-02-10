public class AllDone
{
	public static boolean allDone(String word, String guess)
	{
		int guess_index = guess.length();
		int wordLen = word.length();

		int c;
		int matches = 0;
		for(c=0;c<guess_index;c++)
		{
			for(int i = 0; i < word.length(); i++)
			{
				if(word.charAt(i)==guess.charAt(c))
				{
					matches++;
				}
			}
		}
		if(matches == wordLen)
		{
			return true;
		}
		return false;
	}
}