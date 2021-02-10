public class If
{
	public static void main(String [] args)
	{
		boolean isStudent = false;
		boolean isSmart = false;

		if(isStudent && isSmart){
			System.out.println("You are a Student");
		}
		else if(isStudent && !isSmart){
			System.out.println("You are not a smart Student");
		}
		else{
			System.out.println("You are not a student and not smart");
		}
		
	}
}