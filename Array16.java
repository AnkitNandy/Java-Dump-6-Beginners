/**The annual examination results of 5 students in
 * a class are tabulated as follows:
 * ROLL NO.    SUBJECT A    SUBJECT B    SUBJECT C
 * -------     ---------    ---------    ---------
 * WAP to read the data, calculate and display the
 * following:
 * (a) Average mark obtained by each student
 * (b) Print the roll number and average mark of
 *     the students whose average mark is above 80
 * (c) Print the roll number and average mark of 
 *     the students whose average mark is below 40.
 */
import java.util.*;
class Array16
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        int rollno[]=new int[5];
        int a[]=new int[5];
        int b[]=new int[5];
        int c[]=new int[5];
        int i;
        double average[]=new double[5];
        for (i=0;i<5;i++)
        {
            System.out.println("Roll No =");
            rollno[i]=sc.nextInt();
            System.out.println("Subject A =");
            a[i]=sc.nextInt();
            System.out.println("Subject B =");
            b[i]=sc.nextInt();
            System.out.println("Subject C =");
            c[i]=sc.nextInt();
            System.out.println("_____________________________________________________________________________________");
            average[i]=(double)(a[i]+b[i]+c[i])/3;
        }
        System.out.println("\nTabulated Input :-\n");
        System.out.println("ROLL NO.\t\tSUBJECT A\t\tSUBJECT B\t\tSUBJECT C\t\tAVERAGE MARK");
        for (i=0;i<5;i++)
        {
            System.out.println(rollno[i]+"\t\t"+a[i]+"\t\t\t\t"+b[i]+"\t\t\t\t"+c[i]+"\t\t\t\t"+average[i]+" marks");
        }
        System.out.println("\nStudents Scoring Average Marks Greater Than 80:");
        System.out.println("ROLL NO.\t\tAVERAGE MARK");
        for (i=0;i<5;i++)
        {
            if (average[i]>80)
            System.out.println(rollno[i]+"\t\t"+average[i]+" marks");
        }
        System.out.println("\nStudents Scoring Average Marks Below 40:");
        System.out.println("ROLL NO.\t\tAVERAGE MARK");
        for (i=0;i<5;i++)
        {
            if (average[i]<40)
            System.out.println(rollno[i]+"\t\t"+average[i]+" marks");
        }
    }
}