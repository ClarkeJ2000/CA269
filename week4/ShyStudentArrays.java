public class ShyStudentArrays
{
	private static void print(Student [] student)
	{
		int i;
		for(i=0; i < student.length; i++)
		{
			System.out.println(student[i].getMark() + " (" + student[i].getName() + ")");
		}
	}
}