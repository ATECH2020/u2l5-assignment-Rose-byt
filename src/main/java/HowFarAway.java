//Imports the Scanner
import java.util.Scanner;

public class HowFarAway 
{
    public static void main(String[] args)
    {
      //Adds a new Scanner
      Scanner in = new Scanner(System.in);

      //Provides a variable of latitude and longitude
      double theLatitude, theLongitude;

      /*Asks the user to input the latitude and longitude
      for both the starting location and the ending location*/
      System.out.println("Enter the latitude of the starting location: ");
      theLatitude = in.nextDouble();
      System.out.println("Enter the longitude of the starting location: ");
      theLongitude = in.nextDouble();
      System.out.println("Enter the latitude of the ending location: ");
      theLatitude = in.nextDouble();
      System.out.println("Enter the longitude of the ending location: ");
      theLongitude = in.nextDouble();

      //Adds a new construction
      GeoLocation philip = new GeoLocation(theLatitude, theLongitude);

      //Computes the distance in miles between the two locations
      
      
      //Prints out the distance


    }//Ends the main constructor
}//Ends the HowFarAway class