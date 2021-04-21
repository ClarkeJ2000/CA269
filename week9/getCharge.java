class getCharge 
{
	private Movie _movie;
	private int _daysRented;

	public Rental(Movie movie, int daysRented) 
	{
		_movie = movie;
		_daysRented = daysRented;
	}

	public int getDaysRented()
	{
		return _daysRented;
	}

	public Movie getMovie()
	{
		return _movie;
	}

	public String toString()
	{
		return this.getMovie() + " [" + this.getDaysRented() + "]";
	}

	public double getCharge()
	{
		double total = 0;
		switch(_movie.getPriceCode())
		{
			case Movie.REGULAR;
		}
	}

} 