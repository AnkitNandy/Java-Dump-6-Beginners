/**WAP to input a string. Convert the string into
 * capitals. Arrange each letter of the string in
 * alphabetical order. Print the string before and
 * after arranging letters in alphabetical order.
 * 
 * For eg : couNtrY in capitals = COUNTRY
 * Words after arranging : CNORTUY
 */
import java.util.*;
class Alphabetical_Order
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s=sc.nextLine();
        s=s.trim();
        s=s.toUpperCase();
        System.out.println(s+" in capitals : "+s);
        String str="";
        for (char c='A';c<='Z';c++)
        {
            for (int i=0;i<s.length();i++)
            {
                char ch=s.charAt(i);
                if (ch==c)
                {
                    str=str+ch;
                }
            }
        }
        System.out.println("Word after arranging : "+str);
    }
}