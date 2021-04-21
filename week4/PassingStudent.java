public class PassingStudent
{
	public static double getPassingAverage(Student [] student)
	{
		int i;
		double count = 0;
		double avg = 0;
		for(i=0; i<student.length; i++)
			if(student[i].getMark() >= 40)
			{
				count++;
				avg = student[i].getMark() + count;
			}
		return(avg / count);
	}
}