package Fundamentals;

import java.util.Scanner;

public class Basic_all_Data_Types {
	  public static void main(String[] args) 
	  {
	    Scanner input = new Scanner(System.in);
	    System.out.print("Enter a integer Number: ");
	    int numInt = input.nextInt();	    
	    System.out.print("Enter a float NUmber: ");
	    float numFloat = input.nextFloat();	    
	    System.out.print("Enter a double Number: ");
	    double numDouble = input.nextDouble();	    
	    System.out.print("Enter a character: ");
	    char ch = input.next().charAt(0);	    
	    System.out.print("Enter a string: ");
	    String str = input.next();
	    
	    System.out.println("\nInteger: " + numInt);
	    System.out.println("Float: " + numFloat);
	    System.out.println("Double: " + numDouble);
	    System.out.println("Character: " + ch);
	    System.out.println("String: " + str);
	  }
}
