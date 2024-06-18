/**The annual examination results of 50 students in a class 
 * in a single dimensional array is as follows:
 * Roll No        Subject A        Subject B        Subject C
 * .......        .........        .........        .........
 * .......        .........        .........        .........
 * .......        .........        .........        .........
 * Find:
 * (a) Average marks obtained by each student.
 * (b) Print the roll number and the average
 *     marks of the students whose average is 
 *     above 80.
 * (c) Print the roll number and the average
 *     marks of the students whose average is
 *     below 80.
 */
import java.util.*;
class Array_Examination
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        int rno[]=new int[50];
        int a[]=new int[50];
        int b[]=new int[50];
        int c[]=new int[50];
        double avg[]=new double[50];
        for (int i=0;i<50;i++)
        {
            System.out.println("Enter the roll number of student "+(i+1)+":");
            rno[i]=sc.nextInt();
            System.out.println("Enter given student's marks in Subject A:");
            a[i]=sc.nextInt();
            System.out.println("Enter given student's marks in Subject B:");
            b[i]=sc.nextInt();
            System.out.println("Enter given student's marks in Subject C:");
            c[i]=sc.nextInt();
            System.out.println("____________________________________________________________________________________");
            avg[i]=(double)(a[i]+b[i]+c[i])/3.0;
            System.out.println("\nAverage marks obtained by student "+(i+1)+" = "+avg[i]);
        }
        System.out.println("\nStudents with average marks above 80 :-");
        System.out.println("ROLL NUMBER\t\t\tAVERAGE MARK");
        for (int i=0;i<50;i++)
        {
            if (avg[i]>80)
            System.out.println(rno[i]+"\t\t\t"+avg[i]);
        }
        System.out.println("\nStudents with average marks below 80 :-");
        System.out.println("ROLL NUMBER\t\t\tAVERAGE MARK");
        for (int i=0;i<50;i++)
        {
            if (avg[i]<80)
            System.out.println(rno[i]+"\t\t\t"+avg[i]);
        }
    }
}