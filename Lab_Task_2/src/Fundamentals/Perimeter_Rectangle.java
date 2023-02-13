package Fundamentals;

import java.util.Scanner;

public class Perimeter_Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    Scanner input = new Scanner(System.in);		    
	    System.out.print("Enter the radius of the circle: ");
	    double radius = input.nextDouble();
	    double diameter = 2 * radius;
	    double circumference = 2 * 3.1416 * radius;
	    double area = 3.1416 * radius * radius;
	    System.out.println("Diameter: " + diameter);
	    System.out.println("Circumference: " + circumference);
	    System.out.println("Area: " + area);

	}

}
