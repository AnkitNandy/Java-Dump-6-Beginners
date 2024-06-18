/**Input two integers and check whether it forms
 * an Amicable Pair or not. An amicable pair is 
 * such that the sum of the factors excluding itself
 * of one number is the other number and also the
 * sum of the factors excluding itself of the
 * other number is this number.
 * Example :-
 * 220 = 1+2+4+5+10+11+20+22+44+55+110 equal to 284, and 
 * 284 = 1+2+4+71+142 equal to 220.
 */
import java.util.*;
public class Amicable_Pair
{
    public static void main()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter two integers to check if they form an Amicable Pair or not :-");
        int a=scan.nextInt();
        int b=scan.nextInt();
        int i,j;
        int sum1=0,sum2=0;
        for (i=1;i<a;i++)
        {
            if (a%i==0)
            sum1=sum1+i;
        }
        for (j=1;j<b;j++)
        {
            if (b%j==0)
            sum2=sum2+j;
        }
        if (sum1==b && sum2==a)
        System.out.println(a+" and "+b+" both forms AN AMICABLE PAIR.");
        else
        System.out.println(a+" and "+b+" are NOT AN AMICABLE PAIR.");
    }
}