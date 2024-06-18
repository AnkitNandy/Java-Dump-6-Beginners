/**To input an integer and
 * check whether all digits
 * are in ascending order or not.
 */
import java.util.*;
public class Ascending_Digits_Checking
{
    public static void main()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter an integer to see if all its digits are in ascending order :-");
        int num=scan.nextInt();
        System.out.println();
        int n=num;
        int a=0,b=0;
        int digit,d=n%10;
        while (n!=0)
        {
            digit=n%10;
            a++;
            if (d>=digit)
            b++;
            n=n/10;
        }
        if (a==b)
        System.out.println("All the digits of "+num+" are IN ASCENDING ORDER.");
        else
        System.out.println("All the digits of "+num+" are NOT IN ASCENDING ORDER.");
    }
}