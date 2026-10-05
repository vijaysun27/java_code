package Daywise_Assignments.Day2;
import java.util.Scanner;

public class simple_calc {
	public static void main(String[] args) {
		Scanner user_input = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int num1 = user_input.nextInt();
		
		System.out.println("Enter second number: ");
		int num2 = user_input.nextInt();
		
		user_input.nextLine();
		System.out.println("What would you want to find?");
		System.out.println("S for Sum, D forDifference,P for Product,Q for Quotient, R for Remainder");
		String calc_type = user_input.nextLine();
		
		if(calc_type.equals("S")) {
			System.out.println("Sum of the given numbers is: "+(num1+num2));
		}
		else if(calc_type.equals("D")) {
			System.out.println("Difference between given two numbers is: "+(num1-num2));
		}
		else if(calc_type.equals("P")) {
			System.out.println("Product of two numbers is: "+(num1*num2));
		}
		else if(calc_type.equals("Q")) {
			System.out.println("Quotient of 2 numbers: "+(num1/num2));
		}
		else if(calc_type.equals("R")) {
			System.out.println("Remainder is: "+(num1%num2));
		}
		else {
			System.out.println("Operation not found. Choose any one from below");
			System.out.println("S for Sum, D for Difference,P for Product,Q for Quotient, R for Remainder");
		}
	}

}
