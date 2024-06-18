/**Store 10 different city names
 * and their capitals in two
 * different single dimensional
 * arrays. Display the names 
 * along with their capitals in
 * the given format:
 * Country Name        Capital
 * xxxxxxxxxxxx        xxxxxxx
 * xxxxxxxxxxxx        xxxxxxx
 */
import java.util.*;
class Array_CityFormat
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        String city[]=new String[10];
        String capital[]=new String[10];
        for (int i=0;i<10;i++)
        {
            System.out.println("Enter the name of a city:");
            city[i]=sc.nextLine();
            System.out.println("Enter its capital:");
            capital[i]=sc.nextLine();
            System.out.println("___________________________________________________________________________________");
        }
        System.out.println("\nRequired format of your input:");
        System.out.println("Country Name\t\t\tCapital");
        for (int i=0;i<10;i++)
        {
            System.out.println(city[i]+"\t\t\t\t"+capital[i]);
        }
    }
}