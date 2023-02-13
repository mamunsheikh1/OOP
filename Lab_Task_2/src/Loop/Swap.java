package Loop;

import java.util.Scanner;
import static java.lang.Math.pow;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.print("Input any number: ");
	        Scanner in = new Scanner(System.in);
	        int x = in.nextInt();
	        int z = x;
	        int k = 0;
	        int i =0;
	        int num1, num2, num3, num4;
	        while(z>0)
	        {
	            k++;
	            z = z/10;
	        }
	        i = x%10;

	         num1 = (int) (i * pow(10,k-1));
	         num2 = (int) (x /pow(10,k-1));
	         num3 = num1 + num2;
	         num3 = num3 - i;
	         num4 = (int) (x% pow(10,k-1));
	         num3 = num3+num4;
	         System.out.println("The Original Number: " +x);
	        System.out.print("Number after swapping first and last digit: " +num3);
	}

}
