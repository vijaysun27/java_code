package Daywise_notes;

public class Non_static_var {
	int a = 89; //non-static var
    int b; //non-static var
    static int a1 = 45; //static var

    public static void main(String[] args) {
//        System.out.println(a1);
//        System.out.println(new Non_static_var().a); // non-static variable a cannot be referenced from a static context
//        System.out.println(new Non_static_var().a);
//        System.out.println(new Non_static_var().a);

        // Syntax :-->
        // Class_name obj_name = new Class_name() :this is for creatign the object using this object u can call non static var's
            Non_static_var  non_static_op = new Non_static_var();
            System.out.println(non_static_op.a);
            System.out.println(non_static_op.a);
            non_static_op.b = 96;
            System.out.println(non_static_op.b);
            System.out.println(non_static_op.b);

        Demo_non_static obj = new Demo_non_static();
        System.out.println(obj.s);
        System.out.println(obj.s + a1);

    }

}
class Demo_non_static{
    String s = "hello";
}

