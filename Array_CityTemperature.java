/**Accept names of 10 cities and their temperature
 * in two different arrays. Print the city with 
 * highest temperature and with lowest temperature.
 */
import java.util.*;
class Array_CityTemperature
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        String city[]=new String[10];
        double temp[]=new double[10];
        double min=0,max=0;
        String high="",low="";
        for (int i=0;i<10;i++)
        {
            System.out.println("Enter the name of a city :");
            city[i]=sc.next();
            System.out.println("Enter the temperature experienced here :");
            temp[i]=sc.nextDouble();
            System.out.println("_____________________________________________________________________________________");
            if (i==0)
            {
                max=temp[i];
                min=temp[i];
            }
            if (temp[i]>max)
            high=city[i];            
            else if (temp[i]<min)
            low=city[i];
        }
        System.out.println("\nCity experiencing the highest temperature : "+high);
        System.out.println("\nCity experiencing the lowest temperature : "+low);
    }
}