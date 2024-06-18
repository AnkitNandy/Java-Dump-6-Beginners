/**To input an integer and
 * check whether all digits
 * in it are Prime or not.
 */
import java.util.*;
public class All_Prime_Digits
{
    public static void main()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter an integer to see if all digits in it are prime or not :-");
        int num=scan.nextInt();
        System.out.println();
        int n=num;
        int i,digit;
        int a=0,b=0;
        while (n!=0)
        {
            int cnt=0;
            digit=n%10;
            a++;
            for (i=1;i<=digit;i++)
            {
                if (digit%i==0)
                cnt++;
            }
            if (cnt==2)
            b++;
            n=n/10;
        }
        if (a==b)
        System.out.println("All the digits in "+num+" are PRIME.");
        else
        System.out.println("All the digits in "+num+" are NOT PRIME.");
    }
}