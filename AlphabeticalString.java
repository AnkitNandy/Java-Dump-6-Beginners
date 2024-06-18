/**WAP to enter a string. Print the string in
 * alphabetical order of its letters.
 */
import java.util.*;
class AlphabeticalString
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s=sc.nextLine();
        s=s.trim();
        for (char ch1='A';ch1<='Z';ch1++)
        {
                for (int i=0;i<s.length();i++)
                {
                    char ch=s.charAt(i);
                    if ((ch==ch1)||(ch==Character.toLowerCase(ch1)))
                    System.out.print(ch);
                }
        }
    }
}