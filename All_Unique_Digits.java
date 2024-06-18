/**To input an integer and
 * check whether all the digits
 * in it are Unique or not.
 */
import java.util.*;
public class All_Unique_Digits
{
    public static void main()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter an integer to see if all digits in it are unique or not :-");
        int num=scan.nextInt();
        System.out.println();
        int digit=0;
        int a=0,b=1;
        int n=num;
        int d=n%10;
        while (n!=0)
        {
            digit=n%10;
            a++;
            if (d!=digit)
            b++;
            n=n/10;
        }
        if (a==b)
        System.out.println("All the digits in "+num+" are UNIQUE.");
        else
        System.out.println("All the digits in "+num+" are NOT UNIQUE.");
    }
}