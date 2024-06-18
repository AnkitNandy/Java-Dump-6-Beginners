/**Enter 10 words into a
 * String type array and
 * print only those words
 * which end with 'A' or 'a'.
 */
import java.util.*;
class Array18
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        String s[]=new String[10];
        System.out.println("Enter ten words :-");
        for (int i=0;i<10;i++)
        {
            s[i]=sc.nextLine();
        }
        System.out.println("\nWords which end with 'A' or 'a':");
        for (int i=0;i<10;i++)
        {
            char c=s[i].charAt(s[i].length()-1);
            if (c=='a'||c=='A')
            System.out.println(s[i]);
        }
    }
}