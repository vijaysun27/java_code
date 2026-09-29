package Daywise_notes;

public class Var_type_static {
	static int a = 58;
    static void main(String[] args) {
        System.out.println(a);//58
        System.out.println(b);
        System.out.println(static_var_exp2.c);//static_var_exp2c
        System.out.println(static_var_exp2.d);
        int a = 96;
        System.out.println(a);//96
        System.out.println(Var_type_static.a);//58
        //System.out.println(vartype_2.f);
    }
    static double b;//
}
class static_var_exp2{
    static String c = "hello";
    static int d = 89;

}
