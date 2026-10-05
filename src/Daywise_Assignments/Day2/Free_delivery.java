package Daywise_Assignments.Day2;
import java.util.Scanner;

//Use ternary to mark an order as "Free Delivery"; when amount >= 999.

public class Free_delivery {
	public static void main(String[] args) {
		Scanner user_input=new Scanner(System.in);
		
		System.out.println("Enter order amount: ");
		double order_amount = user_input.nextDouble();
		
		System.out.println(order_amount>=999? "Eligible for free delivery":"Orders less than Rs.999 are not eligible for free delivery");
	}

}
