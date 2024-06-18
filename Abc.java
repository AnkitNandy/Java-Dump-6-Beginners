class Xyz
{
    int a,b;
    void getval(int x,int y)
    {
        a=x;//a=2 for ob1, and a=4 for ob2
        b=y;//b=3 for ob1, and b=6 for ob2
    }
    void sumobj(Xyz p,Xyz q)//xyz p = 2,3 and xyz q = 4,6
    {
        this.a = p.a+q.a;//2+4
        this.b = p.b+q.b;//3+6
    }
    void display()
    {
        System.out.println("Sum of a : "+a);
        System.out.println("Sum of b : "+b);
    }
}
public class Abc
{
    public static void main()
    {
        Xyz ob1 = new Xyz();
        Xyz ob2 = new Xyz();
        Xyz ob3 = new Xyz();
        ob1.getval(2,3);
        ob2.getval(4,6);
        ob3.sumobj(ob1,ob2);
        ob3.display();
    }
}