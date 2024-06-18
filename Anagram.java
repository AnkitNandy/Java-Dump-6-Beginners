/**An anagram is a word or a phrase made by transposing the letters
 * of another word or phrase; for example, "parliament" is an anagram
 * of "partial men," and "software" is an anagram of "swear oft".
 * Write a program that figures out whether one string is an anagram 
 * of another string. The program should ignore white space and punctuation.
 */
import java.io.*;
class Anagram
{
    static void main()throws IOException
    {
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter two strings to check if one is an anagram of another one :-");
        String s1=buf.readLine();
        String s2=buf.readLine();
        System.out.println();
        s1=s1.trim();
        s2=s2.trim();
        char c1;
        int k=0;
        int len=s1.length();
        if (len!=s2.length())
        k=0;
        else
        {
            for (int i=0;i<len;i++)
            {
                if (Character.isLetter(s1.charAt(i)))
                {
                    c1=s1.charAt(i);
                    if (s2.contains(Character.toString(c1)))
                    k=1;
                    else
                    k=0;
                }
            }
        }
        if (k==1)
        System.out.println("One string IS AN ANAGRAM of another string.");
        else
        System.out.println("One string is NOT AN ANAGRAM of another string.");
    }
}