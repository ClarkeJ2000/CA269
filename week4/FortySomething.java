public class FortySomething
{
	public static void printForties(Student [] student)
	{
		int i;
		for(i=0; i<student.length; i++)
		{
			if(student[i].getMark() >= 40 && student[i].getMark() <= 49)
			{
				System.out.println(student[i].getMark() + " (" + student[i].getName() + ")");
			}
		}
	}
}