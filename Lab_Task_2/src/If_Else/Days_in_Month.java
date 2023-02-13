package If_Else;

import java.util.Scanner;

public class Days_in_Month {
	public static void main(String[] args) 
	{
	    Scanner scanner = new Scanner(System.in);
	    System.out.print("Enter month number (1-12): ");
	    int monthNum = scanner.nextInt();
	    int[] dIm = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	    if (monthNum >= 1 && monthNum <= 12) 
	    {
	      System.out.println("Number of days in month: " + dIm[monthNum - 1]);
	    } 
	    else 
	    {
	      System.out.println("Invalid month number");
	    }
	 }
}
