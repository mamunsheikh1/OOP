package Fundamentals;

import java.util.Scanner;

public class Basic_Input_Output {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
	        char grade;

	        System.out.print("Enter student grade: ");
	        grade = input.next().charAt(0);

	        System.out.println("The Grade is: "+grade);	

	}

}
