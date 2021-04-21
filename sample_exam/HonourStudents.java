public class HonourStudents
{
	public static void print(Student [] student)
	{
		int i;
		for(i=0; i<student.length; i++)
		{
			if(student[i].getMark() >= 55)
			{
				System.out.println(student[i].getMark() + "(" + student[i].getName() + ")");
			}
		}
	}
}