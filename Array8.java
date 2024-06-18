/**Create a method to accept a
 * float type array as parameter
 * and print the average of these 
 * largest and smallest number.
 */
class Array8
{
    static void main(float n[])
    {
        float large=n[0],small=n[0];
        double avg=0.0;
        for (int i=0;i<n.length;i++)
        {
            if (n[i]>large)
            large=n[i];
            else if (n[i]<small)
            small=n[i];
        }
        System.out.println("Smallest = "+small+"\n"+"Largest = "+large);
        avg=(large+small)/2.0;
        System.out.println("Average of largest and smallest number=\n"+avg);
    }
}