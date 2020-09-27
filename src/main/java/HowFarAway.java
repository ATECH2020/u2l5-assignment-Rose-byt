//Imports the Scanner
import java.util.Scanner;

public class HowFarAway 
{
    public static void main(String[] args)
    {
      //Adds a new Scanner
      Scanner in = new Scanner(System.in);

      //Provides a variable of latitude and longitude
      double theLatitude = 0.0, theLongitude = 0.0;
      double startLatitude, startLongitude;
      double endLatitude, endLongitude;
      double other;
      double GeoLocation;

      /*Asks the user to input the latitude and longitude
      for both the starting location and the ending location*/
      System.out.println("Enter the latitude of the starting location: ");
      startLatitude = in.nextDouble();
      System.out.println("Enter the longitude of the starting location: ");
      startLongitude = in.nextDouble();
      System.out.println("Enter the latitude of the ending location: ");
      endLatitude = in.nextDouble();
      System.out.println("Enter the longitude of the ending location: ");
      endLongitude = in.nextDouble();

      //Adds a new construction
      GeoLocation philip = new GeoLocation(startLatitude,endLongitude);

      //Computes the distance in miles between the two locations
      other = philip.getLatitude() + philip.getLongitude();

      //Prints out the distance
      System.out.println("The distance is " + philip.distanceFrom(other) + " miles.");

    }//Ends the main constructor
}//Ends the HowFarAway class