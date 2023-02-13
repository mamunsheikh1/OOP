package If_Else;

import java.util.Scanner;

public class Vowel_or_Consonant {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

	    System.out.print("Enter a character: ");
	    char character = scanner.next().charAt(0);

	    if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u'
	        || character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U') 
	    {
	      System.out.println(character + " is a vowel");
	    } 
	    else if ((character >= 'a' && character <= 'z') || (character >= 'A' && character <= 'Z')) 
	    {
	      System.out.println(character + " is a consonant");
	    } 
	    else 
	    {
	      System.out.println(character + " is not an alphabet");
	    }
	}

}
