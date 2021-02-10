public class Exception
{
	public static void main(String [] args)
	{
		try{
			int division = 10/0;
		}catch(ArithmeticException e){
			System.out.println(e);
		}//catch(Exception e){

		//}
	}
}