package Loop;

import java.util.Scanner;
public class DigitSum 
{
	  public static void main(String[] args) 
	  {
		    Scanner input = new Scanner(System.in);
		    System.out.print("Enter any number to find sum of its digit: ");
		    int number = input.nextInt();
		    int sum = 0;
		    while (number != 0) 
		    {
		      int lastDigit = number % 10;
		      sum = sum + lastDigit;
		      number = number / 10;
		    }
		    System.out.println("Sum of the given digits is = " + sum);
	  }
}