public class Date
{
    private int day;
    private int month;
    private int year;
    
    public String toString()
    {
        return day + "/" + month + "/" + year;
    }
    public Date()
    {
    	day = 21;
    	month = 9;
    	year = 2015;
    }
}