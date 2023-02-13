package Fundamentals;

import java.util.Scanner;

public class Days_Conversion {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
	    
	    System.out.print("Enter the number of days: ");
	    int days = input.nextInt();
	    
	    int years = (days / 365);
	    int weeks = (days % 365) / 7;
	    int remainingDays  = days - ((years * 365) + (weeks * 7));
	    
	    System.out.println("\nThe number of years is: " + years);
	    System.out.println("The number of weeks is: " + weeks);
	    System.out.println("The number of days is: " + remainingDays);

	}

}
