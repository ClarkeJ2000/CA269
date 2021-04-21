public class BestStudent
{
	public static Student getBestStudent(Student [] student)
	{	
		best = student[0];
		int i;
		for(i=1; i < student.length; i++)
		{
			if(student.getMark() > best.getMark())
			{
				best = student[i];
			}
		}
	return best;
	}
}