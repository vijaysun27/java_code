package Daywise_Assignments.Day2;

import java.util.Scanner;

// Build a banking withdrawal validator using balance, withdrawal amount, accountActive and pinValid.

public class banking_app {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        int attempt = 0;
        boolean accountStatus = true;
        String account_holder = "Vijay";
        double balance = 55667.34;

        while (attempt < 3) {
            System.out.println("Enter your PIN:");
            int pin = user_input.nextInt();

            if (pin == 1234) {
                System.out.println("User authentication successful");
                break;
            } else {
                System.out.println("Invalid pin. Please try again");
                attempt++;
            }
        }

        if (attempt == 3) {
            System.out.println("Account locked due to 3 invalid attempts");
        } else {
            if (accountStatus) {
                System.out.println("Welcome " + account_holder + ", ");
                System.out.println("Choose 'w' for Withdrawal or 'b' to check your Account Balance");

                char choose_option = user_input.next().charAt(0);

                if (choose_option == 'w') {
                    System.out.println("Enter withdrawal amount:");
                    double withdraw_amount = user_input.nextDouble();

                    if (withdraw_amount <= 0) {
                        System.out.println("Invalid withdrawal amount.");
                    } else if (withdraw_amount <= balance) {
                        System.out.println("You've withdrawn " + withdraw_amount);
                        balance = balance - withdraw_amount;
                        System.out.println("Account Balance: " + balance);
                    } else {
                        System.out.println("Insufficient balance.");
                        System.out.println("Account Balance: " + balance);
                    }
                } else if (choose_option == 'b') {
                    System.out.println("Account Balance: " + balance);
                } else {
                    System.out.println("Invalid option selected");
                }
            } else {
                System.out.println("Welcome " + account_holder + ", ");
                System.out.println("Your account is not active. Please contact your bank");
            }
        }

        user_input.close();
    }
}