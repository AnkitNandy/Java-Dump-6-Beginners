/**The annual exam result of 3 students of a class X-D
 * of St.Xaviers is tabulated as follows:
 * ROLL NO.        SUBJECT A        SUBJECT B        SUBJECT C
 * --------        ---------        ---------        ---------
 * Read the data and determine:
 * (i) Total marks obtained by each student.
 * (ii) Highest marks in each subject and
 *      roll number of the student who 
 *      obtains it.
 * (iii) Highest total marks and the roll
 *       number of the student who 
 *       obtains it.
 */
import java.util.*;
class Array_Marks
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        int rno[]=new int[3];
        int a[]=new int[3];
        int b[]=new int[3];
        int c[]=new int[3];
        int maxa=0,maxb=0,maxc=0,i;
        int ra=0,rb=0,rc=0,r=0;
        int sum=0;
        for (i=0;i<3;i++)
        {
            System.out.println("Enter the roll number of student "+(i+1)+" :");
            rno[i]=sc.nextInt();
            System.out.println("Enter his/her marks in Subject A :");
            a[i]=sc.nextInt();
            System.out.println("Enter his/her marks in Subject B :");
            b[i]=sc.nextInt();
            System.out.println("Enter his/her marks in Subject C :");
            c[i]=sc.nextInt();
            System.out.println("__________________________________________________________________________________\n");
        }
        System.out.println();
        for (i=0;i<3;i++)
        System.out.println("Total marks obtained by student of roll number "+rno[i]+" = "+(a[i]+b[i]+c[i]));
        for (i=0;i<3;i++)
        {
            if (a[i]>maxa)
            {
                maxa=a[i];
                ra=rno[i];
            }
            if (b[i]>maxb)
            {
                maxb=b[i];
                rb=rno[i];
            }
            if (c[i]>maxc)
            {
                maxc=c[i];
                rc=rno[i];
            }
        }
        System.out.println("\n  Roll Number : "+ra+"\t\t"+rb+"\t\t"+rc);
        System.out.println("      Subject : A\t\tB\t\tC");
        System.out.println("Highest Marks : "+maxa+"\t\t"+maxb+"\t\t"+maxc);
        for (i=0;i<3;i++)
        {
            if ((a[i]+b[i]+c[i])>sum)
            {
                sum=a[i]+b[i]+c[i];
                r=rno[i];
            }
        }
        System.out.println("\nA student of roll number "+r+" obtains the highest total marks of "+sum);
    }
}