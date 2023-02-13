package Loop;

import java.util.Scanner;

public class Fast_And_Last_Digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    System.out.print("Input number: ");
	    int num = sc.nextInt();
	    int lastDigit = num % 10;
	    int firstDigit = num;
	    while (firstDigit >= 10) 
	    {
	      firstDigit /= 10;
	    }
	    System.out.println("First digit: " + firstDigit);
	    System.out.println("Last digit: " + lastDigit);
	}

}
