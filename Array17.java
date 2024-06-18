/**Input 10 numbers into an integer array
 * and interchange the largest number
 * with the smallest number within the
 * array and print the modified array. 
 * Assume that there is only one largest
 * and smallest number.
 */
import java.util.*;
class Array17
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        int n[]=new int[10];
        int small=0,large=0;
        System.out.println("Enter ten integers :-");
        for (int i=0;i<10;i++)
        {
            n[i]=sc.nextInt();
            if (i==0)
            {
                small=n[i];
                large=n[i];
            }
            if (n[i]<small)
            small=n[i];
            else if (n[i]>large)
            large=n[i];
        }
        System.out.println("\nModified Array =");
        for (int i=0;i<10;i++)
        {
            if (n[i]==small)
            {
                n[i]=large;
            }
            else if (n[i]==large)
            {
                n[i]=small;
            }
            System.out.println(n[i]);
        }
    }
}
            