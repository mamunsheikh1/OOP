package Fundamentals;

import java.util.Scanner;

public class Power_of_a_Number {

	public static void main(String[] args) {

		  Scanner input = new Scanner(System.in);
		    
		    System.out.print("Enter the base: ");
		    double base = input.nextDouble();
		    int baseRounded = (int) Math.round(base);
		    System.out.print("Enter the exponent: ");
		    double exponent = input.nextDouble();
		    int exponentRounded = (int) Math.round(exponent);
		    double power = Math.pow(base, exponent);
		    int powerRounded = (int) Math.round(power);
		    System.out.println("\n" + baseRounded + "^" + exponentRounded + " = " + powerRounded);

	}

}
