import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    System.out.print("Input upper limit: ");
	    int n = scan.nextInt();
	    int sum = 0;
	    for (int i = 1; i <= n; i++) 
	  {
	      sum += i;
	  }
	    System.out.println("Sum of natural numbers from 1 to " + n + " is: " + sum);

	}

}
