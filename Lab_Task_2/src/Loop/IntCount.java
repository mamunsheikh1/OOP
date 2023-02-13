package Loop;

import java.util.Scanner;

public class IntCount {

	public static void main(String[] args) {

	    Scanner sc = new Scanner(System.in);
	    System.out.print("Input an integer: ");
	    int num = sc.nextInt();
	    int count = 0;
	    while (num != 0) 
	    {
	      num /= 10;
	      count++;
	    }
	    System.out.println("Number of digits: " + count);

	}

}
