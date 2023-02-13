package Loop;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
	     System.out.print("Enter a number: ");
	     int num = input.nextInt();
	     int reverse = 0;
	     int originalNum = num;
	     while (num != 0) {
	         reverse = reverse * 10 + num % 10;
	         num /= 10;
	     }
	     System.out.println("The reverse of " + originalNum + " is " + reverse);

	}

}
