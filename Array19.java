/**WAP to input an integer array A[] of n size.
 * Store all even integers of array A[] from left to right
 * and all odd integers from right to left on another 
 * array B[]. Print both the arrays in two different lines
 * in the below format:
 * A[]={32,35,2,45,37,22,14,19};
 * B[]={32,2,22,14,19,37,45,35};
 */
import java.util.*;
class Array19
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array A[]:");
        int n=sc.nextInt();
        System.out.println("Enter "+n+" values of array A[]:");
        int A[]=new int[n];
        int B[]=new int[n];
        int i,j;
        for (i=0;i<n;i++)
        A[i]=sc.nextInt();
        for (i=0,j=0;i<n;i++)
        {
            if (A[i]%2==0)
            {
                B[j]=A[i];
                j++;
            }
        }
        int k=j;
        for (i=n-1;i>=0;i--)
        {
            if (A[i]%2!=0)
            {
                B[k]=A[i];
                k++;
            }
        }
        System.out.print("A[] = {");
        for (i=0;i<n;i++)
        {
            System.out.print(A[i]+",");
            if (i==n-1)
            System.out.print("}");
        }
        System.out.print("\nB[] = {");
        for (i=0;i<n;i++)
        {
            System.out.print(B[i]+",");
            if (i==n-1)
            System.out.print("}");
        }
    }
}       