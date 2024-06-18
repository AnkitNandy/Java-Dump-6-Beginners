/**WAP to input ten numbers
 * into an integer array and
 * print the position of the
 * largest number.
 */
import java.util.*;
class Array9
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        int n[]=new int[10];
        int largest=0;
        System.out.println("Enter ten integers :-");
        for (int i=0;i<10;i++)
        {
            n[i]=sc.nextInt();
            if (n[i]>largest)
            {
                largest=n[i];
            }
        }
        System.out.println("Largest number = "+largest);
        System.out.println("The positions are :-");
        for (int i=0;i<10;i++)
        {
            if (largest==n[i])           
            System.out.println(i);
        }
    }
}