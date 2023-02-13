package Fundamentals;

import java.util.Scanner;

public class Angles_of_Triangle {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		    
		    System.out.print("Enter the length of side A: ");
		    double a = input.nextDouble();
		    
		    System.out.print("Enter the length of side B: ");
		    double b = input.nextDouble();
		    double C = 180 - (a + b);
		    
		    System.out.println("\nAngle A: " + a);
		    System.out.println("Angle B: " + b);
		    System.out.println("Angle C: " + C);
	}

}
