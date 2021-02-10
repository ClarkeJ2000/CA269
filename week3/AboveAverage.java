//
// Supplied code to help ensure there will be no output formatting issues.
//
import java.util.Scanner;


public class AboveAverage
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("How many numbers: ");
        int num = in.nextInt();
        
        // Create an array
        double [] l = new double[num];
        System.out.print("Enter " + num + " numbers: ");

        // Now read in the numbers
        double count = 0;
        // Read in the numbers (note that they could be floating point)
        int i = 0;
        while(i<num)
        {
            double n = in.nextDouble();
            count = count + n;
            l[i] = n;
            i++;
        }
        double avg = count/num;
        // Print out the numbers greater than the average
        System.out.println("The above average numbers are:");
        // You can use the following code to print out one number
        for(i = 0; i < num; i++)
        {
        if (avg < l[i])
        {
        System.out.print(" " + l[i]); // You may want to put this in a loop.
        }
    }
        System.out.println(); // Should finish with a new line
    }
}