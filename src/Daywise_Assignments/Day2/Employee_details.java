package Daywise_Assignments.Day2;

public class Employee_details {
    public static void main(String[] args){
        /* Create variables for employee name, ID, department, salary and active status.
        Print a neat report.*/
        String employee_name = "Vijay";
        short emp_id = 2703;
        String department = "QA";
        int salary = 200000;
        boolean is_active = true;
        String employment_status = is_active?"Active":"Inactive";

        System.out.println("================Employee Details=====================");
        System.out.println("Employee Name: "+employee_name);
        System.out.println("Employee ID: "+emp_id);
        System.out.println("Department: "+department);
        System.out.println("Last WithDrawn Salary: "+salary);
        System.out.println("Employment_Status:"+employment_status);
    }
}
