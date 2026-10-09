package Daywise_Assignments.Day2;

import java.util.Scanner;

// Build a flight booking rule: logged in, seats available, fare > 0, payment successful.

public class flight_booking {
    public static void main(String[] args) {
        int indigo = 20;
        double indigo_fare = 3500.00;

        int spiceJet = 30;
        double spiceJet_fare = 3770.35;

        int airIndia = 25;
        double airIndia_fare = 3600.45;

        Scanner user_input = new Scanner(System.in);

        System.out.println("Enter your username: ");
        String username = user_input.nextLine();

        System.out.println("Enter your password: ");
        String password = user_input.nextLine();

        if (username.equals("vijay@gmail.com") && password.equals("abcd")) {
            System.out.println("======================Login Successful=============================");
            System.out.println("======================Available AirLines===============================");
            System.out.println("AirLine: Indigo | Seats Available: " + indigo + " | Fare: " + indigo_fare);
            System.out.println("AirLine: SpiceJet | Seats Available: " + spiceJet + " | Fare: " + spiceJet_fare);
            System.out.println("AirLine: AirIndia | Seats Available: " + airIndia + " | Fare: " + airIndia_fare);

            System.out.println("Select your flight: ");
            System.out.println("Enter 'i' for Indigo, 's' for SpiceJet, 'a' for AirIndia");

            char choose_flight = user_input.next().charAt(0);

            if (choose_flight == 'i') {
                System.out.println("Available Seats: " + indigo);
                System.out.println("Enter number of Seats: ");

                int number_of_tickets = user_input.nextInt();

                while (number_of_tickets > indigo || number_of_tickets <= 0) {
                    if (number_of_tickets > indigo) {
                        System.out.println("Available seats only " + indigo);
                    } else {
                        System.out.println("Please enter at least 1 seat.");
                    }

                    System.out.println("Enter number of seats: ");
                    number_of_tickets = user_input.nextInt();
                }

                System.out.println("Total Fare: " + (indigo_fare * number_of_tickets));
                System.out.println("Booking Successful. Details sent to your email address/phone number.");

            } else if (choose_flight == 's') {
                System.out.println("Available Seats: " + spiceJet);
                System.out.println("Enter number of Seats: ");

                int number_of_tickets = user_input.nextInt();

                while (number_of_tickets > spiceJet || number_of_tickets <= 0) {
                    if (number_of_tickets > spiceJet) {
                        System.out.println("Available seats only " + spiceJet);
                    } else {
                        System.out.println("Please enter at least 1 seat.");
                    }

                    System.out.println("Enter number of seats: ");
                    number_of_tickets = user_input.nextInt();
                }

                System.out.println("Total Fare: " + (spiceJet_fare * number_of_tickets));
                System.out.println("Booking Successful. Details sent to your email address/phone number.");

            } else if (choose_flight == 'a') {
                System.out.println("Available Seats: " + airIndia);
                System.out.println("Enter number of Seats: ");

                int number_of_tickets = user_input.nextInt();

                while (number_of_tickets > airIndia || number_of_tickets <= 0) {
                    if (number_of_tickets > airIndia) {
                        System.out.println("Available seats only " + airIndia);
                    } else {
                        System.out.println("Please enter at least 1 seat.");
                    }

                    System.out.println("Enter number of seats: ");
                    number_of_tickets = user_input.nextInt();
                }

                System.out.println("Total Fare: " + (airIndia_fare * number_of_tickets));
                System.out.println("Booking Successful. Details sent to your email address/phone number.");

            } else {
                System.out.println("Invalid flight option selected");
            }

        } else {
            System.out.println("Invalid Username or Password");
        }

        user_input.close();
    }
}