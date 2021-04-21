import java.util.*;

class Customer
{
	private String _name;
	private List <Rental> _rentals;

	public Customer (String name, List <Rental> rentinglist)
	{
		_name = name;
		_rentals = rentinglist;
	}

	public String getName()
	{
	return _name;
	}

	public List<Rental> getRentals()
	{
	return _rentals;
	}

	public String toString()
	{
		return _name + ": " + _rentals.toString();
	}
}