/**Create a method to accept
 * a String type array as
 * parameter and print the
 * smallest word in it.
 */
class Array13
{
    static void smallest_word(String s[])
    {
        String small="";
        System.out.println("Inputs :-");
        for (int i=0;i<s.length;i++)
        {
            System.out.println(s[i]);
            if (i==0)
            small=s[i];
            else
            {
                if (s[i].length()<small.length())
                small=s[i];
            }
        }
        System.out.println("_________________________________________________________________________________________");
        System.out.println("Smallest word is =\n"+small);
    }
}