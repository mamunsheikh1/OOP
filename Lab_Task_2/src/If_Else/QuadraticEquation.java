package If_Else;

import java.util.Scanner;

public class QuadraticEquation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

		    System.out.print("Enter the coefficient of x^2 (a): ");
		    double a = scanner.nextDouble();

		    System.out.print("Enter the coefficient of x (b): ");
		    double b = scanner.nextDouble();

		    System.out.print("Enter the constant term (c): ");
		    double c = scanner.nextDouble();

		    double discriminant = b * b - 4 * a * c;
		    double root1, root2;
		    if (discriminant > 0) 
		    {
		      root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
		      root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
		      System.out.println("The roots of the equation (" + a + "x^2 + " + b + "x + " + c + ") are real and distinct: " + root1 + " and " + root2);
		    } 
		    else if (discriminant == 0) 
		    {
		      root1 = -b / (2 * a);
		      System.out.println("The roots of the equation (" + a + "x^2 + " + b + "x + " + c + ") are real and equal: " + root1);
		    } 
		    else 
		    {
		      System.out.println("The roots of the equation (" + a + "x^2 + " + b + "x + " + c + ") are complex and unequal");
		    }
	}

}
