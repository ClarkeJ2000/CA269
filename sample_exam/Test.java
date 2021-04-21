import java.util.Scanner;

public class Test
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int [] rev = new int[num];
        int i;
        for(i=0; i<num; i++)
        {
            rev[i] = in.nextInt();
        }
        int len = num-1;
        for(i = len; i>=0; i--)
        {
            System.out.println(" " + rev[i]);
        }  
        System.out.println();           
    }
}