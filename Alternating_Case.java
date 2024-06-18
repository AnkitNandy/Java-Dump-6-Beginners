/**Input a string. Print the new string
 * after converting every alternate letter
 * into uppercase and the next immediate
 * letter into lowercase. The special
 * characters remain the same.
 */
import java.util.*;
class Alternating_Case
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string :-");
        String s=sc.nextLine();
        s=s.trim();
        System.out.println();
        char c;
        int cnt=1;
        String str="";
        for (int i=0;i<s.length();i++)
        {
            c=s.charAt(i);
            if (Character.isLetter(c))
            {
                if (cnt%2==0)
                str=str+(Character.toLowerCase(c));
                else
                str=str+(Character.toUpperCase(c));
                cnt++;
            }
            else
            str=str+c;
        }
        System.out.println("New String formed by alternating the cases of the alphabets, we get =\n"+str);
    }
}