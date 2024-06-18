/**To find the sum of even numbers 
 * among  10 integers using an array.
 */
import java.util.*;
class Array4
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        int n[]=new int[10];
        int sum=0;
        System.out.println("Enter ten numbers :-");
        for (int i=0;i<10;i++)
        {
            n[i]=sc.nextInt();
            if (n[i]%2==0)
            sum=sum+n[i];
        }
        System.out.println("Sum of even numbers =\n"+sum);
    }
}