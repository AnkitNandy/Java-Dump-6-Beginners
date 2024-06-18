/**Input a string. Count and display
 * the frequency of each letter in
 * the alphabetical order in which
 * it is present in the string into
 * a tabulated format.
 */
import java.util.*;
class Alphabetical_Frequency
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string :-");
        String s=sc.nextLine();
        System.out.println();
        s=s.trim();
        s=s.toUpperCase();
        System.out.println("CHARACTER\t\t\t\tFREQUENCY");
        for (char c1='A';c1<='Z';c1++)
        {
            int cnt=0;
            for (int i=0;i<s.length();i++)
            {
                char c2=s.charAt(i);
                if (Character.isLetter(c2) && c2!=' ')
                {
                    if (c2==c1)
                    cnt++;
                }
            }
            if (cnt>0)
            System.out.println(c1+"\t\t\t\t\t"+cnt);
        }
    }
}
            