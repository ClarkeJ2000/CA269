import java.util.Scanner;


public class Reverse
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        //take in first number, how many numbers that will be in the list
        int num = in.nextInt();
        //make a list called l that will contain integers and will be length num
        int [] numbers = new int[num];
        // Read in the numbers for the list using while loop
        int i = 0;
        while(i<num)
        {
            int n = in.nextInt();
            numbers[i] = n;
            i++;
        }
         
        int [] revl = new int[num];
        
        i = 0;
        int j = num-1;
        while(i<num)
        {
            revl[i] = numbers[j];
            i++;
            j--;
        }
        
        System.out.print("How many numbers: Enter " + num + " numbers: The numbers reversed are:");
                
        for(i = 0; i < num; i++)
        {
        System.out.print(" " + revl[i]);
        // finish with new line
        System.out.println();
        }
    }
}