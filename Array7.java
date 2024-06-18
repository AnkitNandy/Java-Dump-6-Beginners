/**Input 10 numbers into 
 * an integer array and
 * count the number of
 * 5-digit numbers that
 * are present in the array.
 */
import java.util.*;
class Array7
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        int num[]=new int[10];
        int cnt=0;
        System.out.println("Enter ten integers :-");
        for (int i=0;i<10;i++)
        {
            num[i]=sc.nextInt();
            if (num[i]>=10000 && num[i]<=99999)
            cnt++;
        }
        System.out.println();
        System.out.println("Number of five-digit numbers=\n"+cnt);
    }
}