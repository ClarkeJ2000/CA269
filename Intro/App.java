/* 
%f -> Double or float
%d -> Integer
%s -> String
%c -> character
%b -> boolean
*/

public class App{
	public static void main(String [] args)
	{
		int inttoString = Integer.parseInt("50");
		String greeting = "hello";
		System.out.println(greeting.length() );
		System.out.println(greeting.indexOf("o") );
		System.out.println(greeting.substring(2) );
		System.out.println(greeting.substring(1, 3) );


		int num = 10;
		System.out.println( Math.pow(2, 3));
	}
}