/**Store 6 elements in an array P,
 * and 4 elements in an array Q and
 * produce a third array R, containing
 * all elements of array P and Q.
 * Display the resultant array.
 * P[]        Q[]         R[]
 *  4         19           4
 *  6         23           6
 *  1          7           1
 *  2          8           2
 *  3                      3
 *  10                     10
 *                         19
 *                         23
 *                         7
 *                         8
 */                       
import java.util.*;
class Array21
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        String P[]=new String[6];
        String Q[]=new String[4];
        String R[]=new String[10];
        System.out.println("Enter the elements of array P :-");
        for (int i=0;i<6;i++)
        P[i]=sc.nextLine();
        System.out.println("Enter the elements of array Q :-");
        for (int i=0;i<4;i++)
        Q[i]=sc.nextLine();
        int c=0;
        for(int i=0;i<10;i++)
        {
            if (i>=0 && i<6)
            R[i]=P[i];
            else if (i<10)
            {
                R[i]=Q[c];
                c++;
            }
        }
        System.out.println("\nElements of array R ( R[] ):");  
        for(int i=0;i<10;i++)
        System.out.println(R[i]);
    }
}