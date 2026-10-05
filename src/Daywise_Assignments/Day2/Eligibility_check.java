package Daywise_Assignments.Day2;
import java.util.Scanner;

//Write an eligibility check: age >= 18 AND income >= 25000.

public class Eligibility_check {
	public static void main(String[] args) {
		Scanner user_input = new Scanner(System.in);
		
		System.out.println("Enter your completed age: ");
		int age = user_input.nextInt();
		
		System.out.println("Enter your income: ");
		double salary = user_input.nextDouble();
		
		if (age>=18 && salary>=25000) {
			System.out.println("Eligible for loan");
		}
		else
		{
			System.out.println("Not eligible for loan");
		}
	}

}
