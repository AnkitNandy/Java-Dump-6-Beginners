/**A company announces Dearness Allowances and Special Allowances for
 * their employees as per this tariff:-
 *       BASIC           DEARNESS ALLOWANCE          SPECIAL ALLOWANCE
 * upto Rs 10000               - 15%                        - 5%
 * Rs 10001 to 20000           - 20%                        - 8%
 * Rs 20001 to 30000           - 25%                        - 10%
 * Rs 30001 and above          - 30%                        - 12%
 */
import java.util.*;
public class AnotherSalaryProgram
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int basic;
        System.out.println("Enter basic salary of an employee:-");
        basic=sc.nextInt();
        double da=0,sa=0,gs=0;
        if (basic>0&&basic<=10000)
        {
            da=basic*0.15;
            sa=basic*0.05;
        }
        if (basic>10000&&basic<=20000)
        {
            da=basic*0.20;
            sa=basic*0.08;
        }
        if (basic>20000&&basic<=30000)
        {
            da=basic*0.25;
            sa=basic*0.10;
        }
        if (basic>30000)
        {
            da=basic*0.30;
            sa=basic*0.12;
        }
        gs=basic+da+sa;
        System.out.println("Basic     DA     Spl. Allowance     Gross Salary");
        System.out.println(+basic);
        System.out.println("         "+da);
        System.out.println("                       "+sa);
        System.out.println("                                        "+gs);
    }
}
        