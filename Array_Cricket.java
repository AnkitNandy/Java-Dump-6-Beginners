/**Store the runs scored by 11 Indian Cricket Players
 * in an innings along with their names. Now display
 * the name of the cricketer who has made the highest
 * score in that innings along with the runs.
 */
import java.util.*;
class Array_Cricket
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        String name[]=new String[11];
        int runs[]=new int[11];
        for (int i=0;i<11;i++)
        {
            System.out.println("Enter the name of the cricketer :");
            name[i]=sc.next();
            System.out.println("Enter the number of runs scored by him in the innings :");
            runs[i]=sc.nextInt();
            System.out.println("____________________________________________________________________________________");
        }
        int large=0;
        String n="";
        for (int i=0;i<11;i++)
        {
            if (i==0)
            large=runs[i];
            if (runs[i]>large)
            {
                large=runs[i];
                n=name[i];
            }
        }
        System.out.println("Highest Scorer:-");
        System.out.println("NAME\t\t\tNUMBER OF RUNS MADE");
        System.out.println(n+"\t\t\t"+large);
    }
}
            