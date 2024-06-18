import java.util.*;
class ArraySearch_Function
{
    boolean search(int m[],int ns)
    {
        int pos=-1;
        for (int i=0;i<10;i++)
        {
            if (m[i]==ns)
            {
                pos++;
                break;
            }
        }
        if (pos!=-1)
        return(true);
        else
        return(false);
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        ArraySearch_Function obj = new ArraySearch_Function();
        int num[]=new int[10];
        System.out.println("Enter 10 numbers line by line:");
        for (int i=0;i<10;i++)
        num[i]=sc.nextInt();
        System.out.println("\nEnter the number that you want to search from your input:");
        int srch=sc.nextInt();
        if (obj.search(num,srch))
        System.out.println("\n"+srch+" is PRESENT in your list.");
        else
        System.out.println("\n"+srch+" is NOT PRESENT in your list !!");
    }
}