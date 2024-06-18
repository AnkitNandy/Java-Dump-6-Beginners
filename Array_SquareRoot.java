/**Store 20 numbers in a single dimensional array.
 * Now, display only those numbers having a complete
 * square root.
 */
import java.util.*;
class Array_SquareRoot
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        int num[]=new int[20];
        System.out.println("Enter 20 numbers:-");
        for (int i=0;i<20;i++)
        num[i]=sc.nextInt();
        System.out.println("\nNumbers having complete square root :");
        for (int i=0;i<20;i++)
        {
            if ((Math.sqrt(num[i]))%1==0)
            System.out.println(num[i]);
        }
    }
}