package Daywise_Assignments.Day2;
import java.util.Scanner;

// Calculate simple interest using principal, rate and time.
public class Simple_interest {
	public static void main(String[] args) {
		Scanner user_input = new Scanner(System.in);
		
		System.out.println("Enter the principal amount: ");
		double principal = user_input.nextDouble();
		
		System.out.println("Enter number of months: ");
		double months = user_input.nextDouble();
		
		System.out.println("Enter rate of interest: ");
		double interest = user_input.nextDouble();
		
		
		double simple_interest = (principal*months*interest)/100;
		
		System.out.printf("Simple Interest is %.2f",simple_interest);
		
	}

}
