/**WAP to input 10 integers
 * into an integer array
 * and find the average of
 * two-digit numbers only.
 */
import java.util.*;
class Array12
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        int n[]=new int[10];
        double avg=0.0;
        int sum=0,cnt=0;
        System.out.println("Enter ten integers :-");
        for (int i=0;i<10;i++)
        {
            n[i]=sc.nextInt();
            if (n[i]>=10 && n[i]<100)
            {
                sum=sum+n[i];
                cnt++;
            }
        }
        avg=(double)sum/cnt;
        System.out.println();
        System.out.println("Average of two-digit numbers=\n"+avg);
    }
}