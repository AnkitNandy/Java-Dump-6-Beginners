import java.util.*;
class Armstrong_Function
{
    int Armstrong(int n)
    {
        int d=0,s=0,a=n;
        while (a!=0)
        {
            d=a%10;
            s = s+(d*d*d);
            a=a/10;
        }
        if (s==n)
        return 1;
        else
        return 0;
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        Armstrong_Function obj = new Armstrong_Function();
        if (obj.Armstrong(num)==1)
        System.out.println("\nAn Armstrong Number.");
        else
        System.out.println("\nNOT an Armstrong Number!");
    }
}