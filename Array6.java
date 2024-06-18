/**To input 10 numbers into an
 * integer array and find the
 * sum of even as well as odd
 * numbers separately.
 */
import java.util.*;
class Array6
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        int n[]=new int[10];
        int sumeven=0,sumodd=0;
        System.out.println("Enter ten integers :-");
        for (int i=0;i<10;i++)
        {
            n[i]=sc.nextInt();
            if (n[i]%2==0)
            sumeven=sumeven+n[i];
            else
            sumodd=sumodd+n[i];
        }
        System.out.println();
        System.out.println("Sum of even numbers = "+sumeven+"\n"+"Sum of odd numbers = "+sumodd);
    }
}