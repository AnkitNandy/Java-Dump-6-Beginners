/**Create a method to accept
 * an array as parameter and
 * print the position of the
 * second largest number in it.
 */
class Array14
{
    static void second_largest(int n[])
    {
        int l=0,sl=0;
        System.out.println("Inputs :-");
        for (int i=0;i<n.length;i++)
        {
            System.out.println(n[i]);
            if (i==0)
            l=n[i];
            else
            {
                if (n[i]>l)
                {
                    sl=l;
                    l=n[i];
                }
                else if (n[i]>sl)
                sl=n[i];
            }
        }
        System.out.println("__________________________________________________________________________________________");
        System.out.println("Second Largest Number = "+sl);
        System.out.println("Positions of "+sl+" =");
        for (int i=0;i<n.length;i++)
        {
            if (n[i]==sl)
            System.out.println(i+1);
        }
    }
}
                    