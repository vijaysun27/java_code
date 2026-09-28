package Daywise_Assignments.Day2;
// Assignment from topics Datatypes,TypeCasing, Operators,Variables

public class Assignment_1 {
    public static void main(String[] args){
        // Question 1
        System.out.println("Question 1");
        int a, b;
        a = 10;
        b = 3;
        int div_ans = a/b;
        int mod_ans = a%b;
        System.out.println("Division of a by b: "+div_ans);
        System.out.println("Modulus operation on a and b: "+ mod_ans);
        System.out.println(); // Linespace

        //Question 2
        System.out.println("Question 2");
        int x = 5;
        int y = x++; //Post-increment
        int z = ++x; //Pre_increment
        System.out.println("Value of y: "+y);
        System.out.println("Value of z: "+z);
        System.out.println("Updated Value of x: "+x);
        System.out.println(); // Linespace

        //Question 3
        System.out.println("Question 3");
        double d = 10/4;
        System.out.println("Value of d: "+d);
        System.out.println(); // Linespace

        //Question 4
        System.out.println("Question 4");
        /* Below code will produce incompatible error
        incompatible types: possible lossy conversion from double to float */
        //float price = 99.99;
        float price =99.99f; // Fixed code
        System.out.println("Price: "+price);
        System.out.println(); // Linespace

        //Question 5
        System.out.println("Question 5");
        int q =10;
        System.out.println("Updated value of q: "+(q++ + ++q));
        System.out.println(); // Linespace

        //Question 6 Write a program using ?: to print PASS/FAIL.
        System.out.println("Question 6");
        boolean vip = true;
        double bill = 2200.75;
        double discount = 0.10;
        double with_disc = vip? bill*discount:0;
        double total_bill = bill - with_disc;
        System.out.printf("Total bill: %.2f",total_bill);
        System.out.println(); // Linespace
        System.out.println(); // Linespace

        //Question 7 Build a salary calculator:
        System.out.println("Question 7");
        double basic = 50000;
        double bonus = 5000;
        double tax_percent = 0.10;
        double gross_salary = basic+bonus;
        double tax_amount = gross_salary*tax_percent;
        double net_salary = gross_salary-tax_amount;
        System.out.printf("Your Gross Salary: %.2f%n",gross_salary);
        System.out.printf("Tax Deductions: %.2f%n",tax_amount);
        System.out.printf("Your NetSalary: %.2f%n",net_salary);
    }
}
