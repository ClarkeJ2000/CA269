import java.util.ArrayList;
public class ArrayL{
	public static void main(String [] args)
	{
		ArrayList<String> friends = new ArrayList<String>();
		friends.add("Oscar");
		friends.add("Angela");
		friends.add("Kevin");

		System.out.println(friends.toString());
		System.out.println(friends.get(0));
		System.out.println(friends.contains("Oscar"));
		System.out.println(friends.size());
	}
}