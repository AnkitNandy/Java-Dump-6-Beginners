/**To input an integer and check whether
 * all digits in it are even or not.
 */
import java.util.*;
public class All_Even_Digits
{
    public static void main()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter an integer to check if all digits in it are even or not :-");
        int num=scan.nextInt();
        System.out.println();
        int a=0,b=0;
        int digit=0;
        int n=num;
        while (num!=0)
        {
            digit=num%10;
            a++;
            if (digit%2==0)
            b++;
            num=num/10;
        }
        if (a==b)
        System.out.println("All the digits in "+n+" are EVEN.");
        else
        System.out.println("All the digits in "+n+" are NOT EVEN.");
    }
}