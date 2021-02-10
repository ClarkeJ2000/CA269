import java.util.Scanner;

public class OnlyAverage
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("How many numbers: ");
        int num = in.nextInt();
        
        System.out.print("Enter " + num + " numbers: ");
        double count = 0;

        // Read in the numbers (note that they could be floating point)
        int i = 0;
        while(i<num)
        {
            double n = in.nextDouble();
            count = count + n;
            i++;
        }
        // and calculate the average (or calculate the average as you read the numbers => no need for an array)
            
        System.out.println("The average is " + sum / num);
    }
}