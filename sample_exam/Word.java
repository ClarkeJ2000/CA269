public class Word
{
	public String showLetters(String s, String letters)
	{
		char [] words = new char[s.length()];
		int i;
		for(i=0; i < s.length(); i++)
		{
			words[i] = "_";
		}
		int j;
		for(j=0; j<s.length(); j++)
		{
			int k;
			for(k=0; k<letter.length(); k++)
			{
				if(s.charAt(i) == letter.charAt(k))
				{
					words[j] = word.charAt(j);
				}
			}
			String str = new String(words);
			return str;
		}
	}
}