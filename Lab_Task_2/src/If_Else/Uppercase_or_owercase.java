package If_Else;

import java.util.Scanner;

public class Uppercase_or_owercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
	    System.out.print("Enter a character: ");
	    char character = scanner.next().charAt(0);
	    if (character >= 'A' && character <= 'Z') 
	    {
	      System.out.println(character + " is uppercase");
	    } 
	    else if (character >= 'a' && character <= 'z') 
	    {
	      System.out.println(character + " is lowercase");
	    } 
	    else 
	    {
	      System.out.println(character + " is not an alphabet");
	    }
	}

}
