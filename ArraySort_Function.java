import java.util.*;
class ArraySort_Function
{
    int i,j,t;
    int m[]=new int[10];
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 10 integers line by line:");
        for (int i=0;i<10;i++)
        m[i]=sc.nextInt();
    }
    void arrange()
    {
        int smallindex=0,swap=0;
        for (int i=0;i<9;i++)
        {
            smallindex=i;
            for (int j=i+1;j<10;j++)
            {
                if (m[j]<m[smallindex])
                smallindex=j;
            }
            swap=m[i];
            m[i]=m[smallindex];
            m[smallindex]=swap;
        }
    }
    void display()
    {
        System.out.println("\nYour input in Ascending Order:");
        for (int i=0;i<10;i++)
        System.out.println(m[i]);
    }
    public static void main()
    {
        ArraySort_Function obj = new ArraySort_Function();
        obj.input();
        obj.arrange();
        obj.display();
    }
}