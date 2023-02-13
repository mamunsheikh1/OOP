package Loop;

import java.util.Scanner;

public class Frequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		    System.out.print("Enter any number: ");
		    int num = sc.nextInt();
		    int[] digits = new int[10];
		    
		    int temp = num;
		    while (temp > 0) 
		    {
		      int digit = temp % 10;
		      digits[digit]++;
		      temp /= 10;
		    }
		    
		    System.out.println("Frequency of each digit in " + num + " is:" );
		    for (int i = 0; i <= 9; i++) {
		      System.out.println("Frequency of " + i + " is = " + digits[i]);
		    }
	}

}
