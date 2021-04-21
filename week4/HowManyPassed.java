public class HowManyPassed
{
	public static int numberPasses(Student [] student)
	{
		int i;
		int students = 0;
		for(i=0; i<student.length; i++)
		{
			if(student[i].getMark() >= 40)
			{
				students++;
			}
			return students;
		}
	}
}