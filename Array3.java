/**To find and display the sum
 * of a set of integers entered
 * by the user using BlueJ method.
 */
class Array3
{
    static void main(int n[])
    {
        int len=n.length;
        int i,sum=0;
        for (i=0;i<len;i++)
        {
            sum=sum+n[i];
        }
        System.out.println(sum);
    }
}