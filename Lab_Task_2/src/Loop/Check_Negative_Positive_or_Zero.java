package Loop;
import java.util.Scanner;

public class Check_Negative_Positive_or_Zero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

	    System.out.print("Enter a number: ");
	    int number = scanner.nextInt();

	    if (number > 0) 
	    {
	      System.out.println(number + " is a positive number");
	    } else if (number < 0) 
	    {
	      System.out.println(number + " is a negative number");
	    } else {
	      System.out.println(number + " is zero");
	    }
	}

}
