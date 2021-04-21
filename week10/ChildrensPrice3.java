public class ChildrensPrice3 extends ChildrensPrice3
{
	public double getCharge(int _daysRented)
	{
		if(_daysRented > 3)
		{
			return 1.5 + ((_daysRented) * 1.5)
		}
		return 1.5;
	}
	public int getFrequentRenterPoints(int points)
	{
		return 1;
	}
}