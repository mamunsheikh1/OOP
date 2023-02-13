package Fundamentals;

import java.util.Scanner;

public class Basic_Arithmetic {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		    
		    System.out.print("Enter first number: ");
		    double num1 = input.nextDouble();
		    
		    System.out.print("Enter second number: ");
		    double num2 = input.nextDouble();
		    
		    System.out.println("10Addition: " + (num1 + num2));
		    System.out.println("Subtraction: " + (num1 - num2));
		    System.out.println("Multiplication: " + (num1 * num2));
		    System.out.println("Division: " + (num1 / num2));
		    System.out.println("Modulus: " + (num1 % num2));

	}

}
