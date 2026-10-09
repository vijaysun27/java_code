package Daywise_Assignments.Day2;
import java.util.Scanner;

// Build an e-commerce discount rule: VIP = 10%, standard = 5%, but only when cart >= 2000.

public class E_commerce_payment_calc {
	public static void main(String[] args) {
		Scanner user_input = new Scanner(System.in);
		
		double cart_price = 2500;
//		boolean vip_member = true;
//		boolean standard_member = true;
		double vip_disc = cart_price*0.10;
		double standard_disc = cart_price*0.05;
		
		//double vip_member_final_bill = cart_price+vip_disc;
		//double standard_member_final_bill = cart_price+standard_disc;
		System.out.println("==========================CHECKOUT PAGE===========================");
		System.out.println("Do you have VIP membership? Press 'y' for Yes and 'n' for No ");
		char acknowledge = user_input.next().charAt(0);
		
		if(acknowledge=='y') {
			double vip_member_final_bill = cart_price-vip_disc;
			System.out.println("Your total bill after discount is "+vip_member_final_bill);						
		}else if(acknowledge=='n') {
			System.out.println("Would like to purchase the VIP membership? Press 'y' for Yes and 'n' for No");
			char need_membership = user_input.next().charAt(0);
			if(need_membership=='y') {
				double standard_to_vip_member_final_bill = (cart_price-vip_disc)+100;
				System.out.println("Welcome to VIP rewards program, your VIP discount is included");
				System.out.println("Your total bill after discount is "+standard_to_vip_member_final_bill);
			}else if(need_membership=='n') {
				double standard_member_final_bill = cart_price-standard_disc;
				System.out.println("Your total bill after discount is "+standard_member_final_bill);
			}else {
				System.out.println("Invalid option");
			}
		}else {
			System.out.println("Invalid option");
		}
				
	}

}
