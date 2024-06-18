/**Copy the values of an array and
 * reverse them in the same variable.
 */
class Array22
{
    static void main()
    {
        int i,j,n,temp;
        int arr[]={12,5,31,24,65,34};
        n=arr.length;
        i=0;
        for (j=n-1;j>i;j--)
        {
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
        }
        for (i=0;i<n;i++)
        System.out.println(arr[i]);
    }
}