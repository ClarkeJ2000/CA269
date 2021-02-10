public class Arrays{
	public static void main(String [] args)
	{
		int [] luckynumbers = {4, 23, 3454, 565, 1};
		luckynumbers[0] = 90;
		System.out.println(luckynumbers[0]);
		System.out.println(luckynumbers[1]);
		System.out.println(luckynumbers.length); 

		int [][] numberGrid = { {1, 2}, {3, 4} };
		numberGrid[0][1] = 90;

		System.out.println(numberGrid[0][0]);
		System.out.println(numberGrid[0][1]);		
	

		
	}
}