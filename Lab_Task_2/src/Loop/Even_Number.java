package Loop;

import java.util.Scanner;

public class Even_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.print("Input Upper Range: ");
	    int n = sc.nextInt();
	    for (int i = 2; i <= n - 1; i += 2) 
	    {
	      System.out.print(i + ", ");
	    }
	    if (n % 2 == 0) 
	    {
	      System.out.println(n);
	    }

	}

}
