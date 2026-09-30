package Daywise_Assignments.Day2;
import java.util.Scanner;

public class check_integer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a num: ");
		int num = sc.nextInt();
		if (num>0) {
			System.out.println("Number is a positive integer");
		}
		else if (num==0) {
			System.out.println("Number is Zero");
		}
		else if(num<0) {
			System.out.println("Number is a negative integer");
		}
		else {
			System.out.println("Invalid Number");
		}
		
	}

}
