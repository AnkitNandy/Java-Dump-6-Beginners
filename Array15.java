/**WAP to input 10 numbers
 * into an integer array 
 * and replace all prime
 * numbers in it (if any)
 * by 0 and then print the
 * modified array.
 */
import java.util.*;
class Array15
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        int n[]=new int[10];
        int i,j,cnt=0;
        System.out.println("Enter ten integers :-");
        for (i=0;i<10;i++)
        {
            n[i]=sc.nextInt();
            cnt=0;
            for (j=1;j<=n[i];j++)
            {
                if (n[i]%j==0)
                cnt++;
            }
            if (cnt==2)
            {
                n[i]=0;
            }
        }
        System.out.println("__________________________________________________________________________________________");
        System.out.println("Modified Array =\n");
        for (i=0;i<10;i++)
        System.out.println(n[i]);
    }
}