public class StudentArray3
{
	public static void print(Student [] student)
	{
		int i;
		for(i=0; i<student.length; i++)
		{
			System.out.println(student[i].name + " (" + student[i].mark + ")");

		}
	}
}