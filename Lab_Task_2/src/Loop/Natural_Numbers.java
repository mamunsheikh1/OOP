package Loop;

import java.util.Scanner;

public class Natural_Numbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	    System.out.print("Input Upper Limit: ");
	    int n = sc.nextInt();
	    for (int i = 1; i <= n; i++) 
	    {
	      System.out.print(i);
	      if (i < n) 
	      {
	        System.out.print(", ");
	      }
	    }

	}

}
