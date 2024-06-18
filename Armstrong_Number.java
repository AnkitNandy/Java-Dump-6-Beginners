/**To pass an integer as argument
 * and check whether it is an
 * Armstrong Number or not.
 * Numbers whose sum of the cube 
 * of its digit is equal to the
 * number itself are called 
 * Armstrong Numbers.
 * Example :-
 *        3     3     3
 * 153 = 1  +  5  +  3
 */
public class Armstrong_Number
{
    public static void main(int num)
    {
        int digit;
        int sum=0;
        int n=num;
        while (n!=0)
        {
            digit=n%10;
            sum=sum+(int)(Math.pow(digit,3));
            n=n/10;
        }
        if (sum==num)
        System.out.println(num+" is an ARMSTRONG NUMBER.");
        else
        System.out.println(num+" is NOT AN ARMSTRONG NUMBER.");
    }
}