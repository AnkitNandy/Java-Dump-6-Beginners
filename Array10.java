/**WAP to input 10 numbers in an integer array
 * and print the smallest prime number if any
 * in the array.(note that there may not be any
 * prime number in the array and therefore getting
 * the smallest prime number is beyond question
 * and therefore you need to print a relevant 
 * message to show its absence).
 */
import java.util.*;
class Array10
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        int n[]=new int[10];
        int i,small=0,cnt1=0,cnt2=0;
        System.out.println("Enter ten numbers :-");
        for (i=0;i<10;i++)
        {
            n[i]=sc.nextInt();
            cnt1=0;
            if (i==0)
            small=n[i];
            for (int j=1;j<=n[i];j++)
            {
                if (n[i]%j==0)
                cnt1++;
            }
            if (cnt1==2)
            {
                cnt2++;              
                if (n[i]<small)
                {
                    small=n[i];
                }
            }
        }
        if (cnt2!=0)
        System.out.println("Smallest prime number =\n"+small);
        else
        System.out.println("There is not prime number present in your input!!!");
    }
}