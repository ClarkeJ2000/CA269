public class RegularPrice2 extends Price
{
	public double getCharge(int _daysRented)
	{
		if(_daysRented > 2)
		{
			return 2 + ((_daysRented - 2) * 1.5);
		}
		return 2;
	}
}