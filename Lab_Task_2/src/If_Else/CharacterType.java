package If_Else;

import java.util.Scanner;

public class CharacterType {
	 public static void main(String[] args) 
	  {
	    Scanner scanner = new Scanner(System.in);

	    System.out.print("Enter a character: ");
	    char character = scanner.next().charAt(0);

	    if (character >= 'a' && character <= 'z' || character >= 'A' && character <= 'Z') 
	    {
	      System.out.println(character + " is an alphabet");
	    } 
	    else if (character >= '0' && character <= '9') 
	    {
	      System.out.println(character + " is a digit");
	    } 
	    else 
	    {
	      System.out.println(character + " is a special character");
	    }
	  }

}
