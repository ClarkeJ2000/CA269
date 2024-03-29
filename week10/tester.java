public class Main
{
    public static void main(String [] args)
    {
        Movie movie = new Movie("Charlie and the chocolate Refactory", Movie.CHILDRENS);
        
        int numDays = 1;
        Rental rental = new Rental(movie, numDays);

        double charge = rental.getCharge();
        int frp = rental.getFrequentRenterPoints();
        
        if(charge != movie.getCharge(numDays) || frp != movie.getFrequentRenterPoints(numDays))
        {
            System.out.println("Your program needs to call the Movie methods.");
        }
        else
        {
            System.out.println(charge);
            System.out.println(frp);
        }
    }
}