/*Program to enter ten integers and
 *check whether all the entered numbers 
 *are even numbers or not.
 */
import java.util.*;
public class All_Even
{
    public static void main()
    {
        Scanner scan=new Scanner(System.in);
        int a=0,b=0;
        System.out.println("Enter ten integers :-");
        for (int i=1;i<=10;i++)
        {
            int num=scan.nextInt();
            a++;
            if (num%2==0)
            b++;
        }
        if (a==b)
        
            System.out.println("All the entered numbers are even.");
        else
        System.out.println("All the entered numbers are not even.");
    }
}
        