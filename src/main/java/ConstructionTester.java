//Imports a Scanner
import java.util.Scanner;

public class ConstructionTester
{
    public static void main(String[] args)
    {
        //Creates a new Scanner
        Scanner in = new Scanner(System.in);

        //Adds a variable and a value to it
        double lumberCost = 8;
        double windowCost = 11;
        double taxRate, total;
        int boards, windows;

        //Prompts the user to enter the taxRate, boards, and windows
        System.out.println("Enter the sales tax rate: ");
        taxRate = in.nextDouble();
        System.out.println("How many boards do you need? ");
        boards = in.nextInt();
        System.out.println("How many windows do you need?");
        windows = in.nextInt();

        //Creates a new Construction
        Construction bobby = new Construction(lumberCost, windowCost, taxRate);

        //Adds the lumberCost and windowCost for the total and prints it out
        total = bobby.lumberCost(boards) + bobby.windowCost(windows);
        System.out.println("Total: " + total);

        //Prints out the grandTotal
        System.out.println("Grand Total: " + bobby.grandTotal(total));

    }//ends the main method
}//ends the ConstructionTester class
