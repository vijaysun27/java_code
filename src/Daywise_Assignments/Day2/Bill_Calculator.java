package Daywise_Assignments.Day2;

public class Bill_Calculator {
    //Create a product with price and quantity. Calculate subtotal, 18% tax and final total.
    public static void main(String[] args){
        String product = "iPhone 17 Pro Max";
        short quantity = 2;
        int price = 120500;
        double tax = 0.18;
        double total_cost_without_tax = price * quantity;
        double taxable_amount = total_cost_without_tax*tax;
        double payable_amount = taxable_amount+total_cost_without_tax;
        System.out.println("Congratulations on your purchase!");
        System.out.println("Your Order total: "+payable_amount);
    }
}
