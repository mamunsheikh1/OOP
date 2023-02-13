package If_Else;
import java.util.Scanner;

public class Profit_Loss {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.print("Enter cost price: ");
	    double costPrice = sc.nextDouble();
	    System.out.print("Enter selling price: ");
	    double sellingPrice = sc.nextDouble();
	    double profit = sellingPrice - costPrice;
	    if (profit > 0) 
	    {
	      System.out.println("The profit is: " + profit);
	    } 
	    else if (profit < 0) 
	    {
	      System.out.println("The loss is: " + -profit);
	    } 
	    else 
	    {
	      System.out.println("There is no profit or loss.");
	    }
	}

}
