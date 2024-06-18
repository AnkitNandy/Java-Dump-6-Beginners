/*To input 10 integers and check if all the
 *entered integers are same or not.
 */
import java.util.*;
public class All_Same
{
    public static void main()
    {
        Scanner scan=new Scanner(System.in);
        int a=0,b=0;
        int num,n;
        System.out.println("Enter ten integers :-");
        num=scan.nextInt();
        for (int i=1;i<=9;i++)
        {
            n=scan.nextInt();
            if (num==n)
            b++;
        }
        System.out.println();
        if (9==b)
        System.out.println("All the entered integers are SAME.");
        else
        System.out.println("All the entered integers are NOT SAME.");
    }
}