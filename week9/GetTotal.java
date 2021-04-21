import java.util.*;

class GetTotal
{
	private String _name;
	private List<Rental> _rentals;

	public GetTotal (String name, List<Rental> rentinglist)
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

	public String statement() {
 		double totalAmount = 0;
 		int frequentRenterPoints = 0;
 		String result = "";
 		for(Rental rental:_rentals) {
 			double thisAmount = 0;
 			thisAmount = getTotal(rental);
 			frequentRenterPoints++;
 			if((rental.getMovie().getPriceCode() == Movie.NEW_RELEASE) && rental.getDaysRented()>1)
 			{
 				frequentRenterPoints++;
 			}
 			result += "  " + rental.getMovie().getTitle()+ "  " + String.valueOf(thisAmount) + "\n";
 			totalAmount += thisAmount;
 		}
 		result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
 		result += "You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points\n";
 		return result;
 	}

	public double getTotal(Rental rented)
	{
		double thisAmount=0;
		switch(rented.getMovie().getPriceCode())
		{
			case Movie.REGULAR:
				thisAmount += 2;
				if(rented.getDaysRented()>2)
				{
					thisAmount += (rented.getDaysRented()-2) * 1.5;
				}
				break;

	 		case Movie.NEW_RELEASE:
 				thisAmount += rented.getDaysRented() * 3;
 				break;

 			case Movie.CHILDRENS:
 				thisAmount += 1.5;
 				if(rented.getDaysRented() > 3)
 				{	
 					thisAmount += (rented.getDaysRented() - 3) * 1.5;
 				}
 				break;
 			}
 		return thisAmount;
	}
}