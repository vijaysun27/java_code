package Daywise_Assignments;

public class Assignment1_MiniProject {
    public static void main(String[] args){
        int marks = 78;
        boolean attendanceOK = true;
        String result = (marks>=40 && attendanceOK)? "PASS":"FAIL";

        System.out.println("Score: "+marks);
        System.out.println("Result: "+result);
    }
}
