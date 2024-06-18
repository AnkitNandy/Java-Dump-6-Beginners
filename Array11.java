/**Accept an integer array 
 * as parameter and count the 
 * number of positive,
 * negative and zeroes in it.
 */
class Array11
{
    static void main(int n[])
    {
        int positive=0,negative=0,zero=0;
        System.out.println("Inputs :-");
        for (int i=0;i<n.length;i++)
        {
            System.out.println(n[i]);
            if (n[i]>0)
            positive++;
            else if (n[i]<0)
            negative++;
            else
            zero++;
        }
        System.out.println("________________________________________________________________________________________  ");
        System.out.println("Number of positive integers = "+positive);
        System.out.println("Number of negative integers = "+negative);
        System.out.println("Number of zeroes = "+zero);
    }
}