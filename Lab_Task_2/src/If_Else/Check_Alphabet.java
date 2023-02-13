package If_Else;
import java.util.Scanner;

public class Check_Alphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

	    System.out.print("Enter an character: ");
	    char character = scanner.next().charAt(0);

	    if ((character >= 'a' && character <= 'z') || (character >= 'A' && character <= 'Z')) 
	    {
	      System.out.println(character + " is an alphabet");
	    } else 
	    {
	      System.out.println(character + " is not an alphabet");
	    }
	}

}
