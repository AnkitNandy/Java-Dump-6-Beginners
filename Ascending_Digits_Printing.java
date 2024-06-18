/**To pass an integer as argument and
 * form a new number by having the 
 * digits arranged in ascending order.
 */
public class Ascending_Digits_Printing
{
    public static void main(int num)
    {
        int i,digit,n;
        System.out.println("Printing "+num+" in Ascending Order, we get =");
        for (i=0;i<=9;i++)
        {
            n=num;
            while (n!=0)
            {
                digit=n%10;
                if (digit==i)
                {
                    System.out.print(i);
                }
                n=n/10;
            }
        }
    }
}