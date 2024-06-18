/**To input 10 numbers into a
 * floating point array and find
 * the average of all numbers 
 * present in it.
 */
import java.util.*;
class Array5
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        float num[]=new float[10];
        double avg=0.0,sum=0.0;
        System.out.println("Enter ten numbers (can be decimals):-");
        for (int i=0;i<10;i++)
        {
            num[i]=sc.nextFloat();
            sum=sum+num[i];
            avg=sum/10;
        }
        System.out.println();
        System.out.println("Average of these numbers=\n"+avg);
    }
}