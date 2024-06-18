/**An airline announces discount on tickets 
 * depending upon destination chosen by the passenger from:-
 *       DESTINATION              RATE OF TICKET( PER PERSON)
 *         America                         Rs. 50000
 *        Singapore                        Rs. 20000
 *          Japan                          Rs. 40000
 *        Thailand                         Rs. 30000
 *        The discount will be given as per the given criteria:-
 *       TICKET AMOUNT              DISCOUNT ON TOTAL AMOUNT
 *      About Rs. 200000                     25 %
 *   Rs. 150001 to Rs. 200000                20 %
 *   Rs. 100001 to Rs. 150000                15 %
 *     Less than Rs. 100000                  10 %
 * Input name of the passenger/group head(in case of more than 1 passenger),
 * number of passengers and destination code viz:- A or a for America, S or s for Singapore, 
 * J or j for Japan, and T or t for Thailand. Calculate the total ticket amount and
 * discount amount. Find the net balance to be paid excluding the discount.
 * Print name, discount, total ticket amount, number of passengers,
 * destination code and the net amount to be paid.
 */ 
import java.util.*;
public class Airline
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        String name="";
        int num,amt=0;
        double disc=0,netamt=0;
        char des; 
        System.out.println("WELCOME TO THE AIRLINE!!");
        System.out.println("Enter the number of passengers travelling:-");
        num=sc.nextInt();
        System.out.println("Enter the name of "+num+" passengers(separate each name by pressing ENTER KEY):-");
        for(int i=1;i<=num+1;i++)
        {
            name=sc.nextLine();
        }
        System.out.println();
        System.out.println("Press 'A' or 'a' to go to America.");
        System.out.println("Press 'S' or 's' to go to Singapore.");
        System.out.println("Press 'J' or 'j' to go to Japan.");
        System.out.println("Press 'T' or 't' to go to Thailand.");
        System.out.println("Enter your destination choice:-");
        des=sc.next().charAt(0);
        if (des=='A'||des=='a')
        amt=50000*num;
        else if (des=='S'||des=='s')
        amt=20000*num;
        else if (des=='J'||des=='j')
        amt=40000*num;
        else if (des=='T'||des=='t')
        amt=30000*num;
        else
        System.out.println("Wrong Choice Entered!!!\nTry Again.");
        if (amt>200000)
        disc=amt*25/100;
        if (amt>=150001&&amt<=200000)
        disc=amt*20/100;
        if (amt>=100001&&amt<=150000)
        disc=amt*15/100;
        if (amt<=100000)
        disc=amt*10/100;
        netamt=amt-disc;
        System.out.println();
        System.out.println("BILL");
        System.out.println("Any one of the passengers:- "+name+".");
        System.out.println("Number of passengers:- "+num+".");
        if (des=='A'||des=='a')
        System.out.println("Destination:- America.");
        if (des=='S'||des=='s')
        System.out.println("Destination:- Singapore.");
        if (des=='J'||des=='j')
        System.out.println("Destination:- Japan.");
        if (des=='T'||des=='t')
        System.out.println("Destination:- Thailand.");
        System.out.println("Ticket Amount:- Rs. "+amt+".");
        System.out.println("Discount:- Rs. "+disc+".");
        System.out.println("Net amount to be paid:- Rs. "+netamt+".");
    }
}