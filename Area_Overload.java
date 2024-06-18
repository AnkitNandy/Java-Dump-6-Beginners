import java.util.*;
class Area_Overload
{
    double area(double a,double b,double c)
    {
        double a1=0.0;
        double s = (a+b+c)/2.0;
        a1 = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        return(a1);
    }
    double area(int a,int b,int height)
    {
        double a2 = (1.0/2.0)*height*(a+b);
        return(a2);
    }
    double area(double diagonal1,double diagonal2)
    {
        double a3 = (1.0/2.0)*(diagonal1*diagonal2);
        return(a3);
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        Area_Overload obj = new Area_Overload();
        System.out.println("Enter the three sides of Scalene Triangle line by line:");
        double x=sc.nextDouble();
        double y=sc.nextDouble();
        double z=sc.nextDouble();
        System.out.println("\nArea of Scalene Triangle is "+obj.area(x,y,z)+" square units.");
        System.out.println("\nEnter length, btreadth & height of Trapezium line by line:");
        int p=sc.nextInt();
        int q=sc.nextInt();
        int r=sc.nextInt();
        System.out.println("\nArea of Trapezium is "+obj.area(p,q,r)+" square units.");
        System.out.println("\nEnter two diagonals of a Rhombus line by line:");
        double d1=sc.nextDouble();
        double d2=sc.nextDouble();
        System.out.println("\nArea of Rhombus is "+obj.area(d1,d2)+" square units.");
    }
}