package If_Else;
import java.util.Scanner;

public class Week_Day {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

	    System.out.print("Enter week number (1-7): ");
	    int weekNum = scanner.nextInt();

	    String[] daysOfWeek = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };

	    if (weekNum >= 1 && weekNum <= 7) {
	      System.out.println(daysOfWeek[weekNum - 1]);
	    } else {
	      System.out.println("Invalid week number");
	    }
	}

}
