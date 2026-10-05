package Daywise_Assignments.Day2;
import java.util.Scanner;

//Check whether a number is divisible by both 3 and 5 using logical operators.
public class div_3_and_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int num = sc.nextInt();
		
		if (num%3==0 && num%5==0) {
			System.out.println("Given number is divisible by 3 and 5");
		}
		else if (num%3==0) {
			System.out.println("Given number is divisible only by 3");
		}
		else if (num%5==0)
		{
			System.out.println("Given number is divisible only by 5");
		}
		else {
			System.out.println("Given number is neither divisible by 5 nor by by 3");
		}
		
	}

}
