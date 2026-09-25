package Daywise_notes;

public class practice {
    static int a=58;
    public static void main(String[] args) {
        System.out.println(a);//58
        System.out.println(b);
        System.out.println(static_var_exp2.c);//static_var_exp2c
        System.out.println(static_var_exp2.d);
        int a = 96;
        System.out.println(a);//96
        System.out.println(practice.a++);//5
        System.out.println(practice.a);
    }
    static double b;//
}

class static_var_exp2{
    static String c = "hello";
    static int d = 89;
}