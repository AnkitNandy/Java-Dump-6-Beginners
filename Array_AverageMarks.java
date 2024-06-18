/**A class teacher wants to store the marks obtained in
 * English, Maths and Science of her class having 40 students.
 * Input marks in English, Science and Maths by using three
 * single dimensional arrays. Calculate and print them:
 * i) Average marks secured by each student.
 * ii) Class average in each subject.
 *     (Class average is the average marks obtained
 *     by 40 students in a particular subject.)
 */
import java.util.*;
class Array_AverageMarks
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("There are 40 students\n");
        int e[]=new int[40];
        int m[]=new int[40];
        int s[]=new int[40];
        int sumeng=0,summat=0,sumsc=0;
        double avg[]=new double[40];
        double ce=0.0,cm=0.0,cs=0.0;
        for (int i=0;i<40;i++)
        {
            System.out.println("For Student "+(i+1)+",\nEnter marks in English :");
            e[i]=sc.nextInt();
            System.out.println("Enter marks in Maths :");
            m[i]=sc.nextInt();
            System.out.println("Enter marks in Science :");
            s[i]=sc.nextInt();
            System.out.println("___________________________________________________________________________________");
            avg[i]=(double)(e[i]+m[i]+s[i])/3.0;
            sumeng=sumeng+e[i];
            summat=summat+m[i];
            sumsc=sumsc+s[i];
        }
        ce=sumeng/40.0;
        cm=summat/40.0;
        cs=sumsc/40.0;
        System.out.println("\nClass Average in English = "+ce);
        System.out.println("\nClass Average in Maths = "+cm);
        System.out.println("\nClass Average in Science = "+cs);
        System.out.println("\nSTUDENT NUMBER\t\t\tAVERAGE MARK");
        for (int i=0;i<40;i++)
        {
            System.out.println((i+1)+"\t\t\t"+avg[i]);
        }
    }
}