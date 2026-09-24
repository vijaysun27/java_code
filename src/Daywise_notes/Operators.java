package Daywise_notes;

public class Operators {
    public static void main(String[] args){
        // Arithmetic Operators
        int a = 35;
        int b = 2;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        int y = 12-56/25%5*2+5;
        System.out.println(y);

        // Increment ++ and Decrement --
        // Two types of increment:
        // Pre: ++a and post: a++
        System.out.println(++a); //36
        System.out.println(b++); //3
        System.out.println(b);

       int y1 = a++ + ++b; // 36+4 but a will increment to 37
        int y2 = ++a + ++b; //38+5
        System.out.println(y1); // 40
        System.out.println(y2); // 43

        y1 = a++ + ++b + a; //38+6+39
        System.out.println(y1);

        //Relational Operators
        a = 5;
        b = 23;
        System.out.println(a<b); //True
        System.out.println(a>b); // False
        System.out.println(a<=b); //True
        System.out.println(a>=b);//False
        System.out.println(a==b); //False
        System.out.println(a!=b); //True

        // Assignment Operators
        a = 50;

        a+=5;
        System.out.println(a);
        a-=5;
        System.out.println(a);
        a*=5;
        System.out.println(a);
        a/=5;
        System.out.println(a);
        a%=5;
        System.out.println(a);

        //Logical Operators

        int num=15;

        System.out.println(num%3==0 && num%5==0);
        System.out.println(num%2==0 && num%5==0);
        //System.out.println(num%3==0 && num%5==0);

        boolean is_num_div_3 = num%3==0;
        boolean is_num_div_5 = num%5==0;
        boolean is_num_div_2 = num%2==0;
        boolean is_num_div_4 = num%4==0;
        boolean is_num_div_with_3_and_5 = is_num_div_3 && is_num_div_5;
        boolean is_num_div_with_2_or_5 = is_num_div_2 || is_num_div_5;
        boolean is_num_div_with_2_and_5 = is_num_div_2 && is_num_div_5;
        boolean is_num_div_with_2_or_4 = is_num_div_2 || is_num_div_4;

        System.out.println("num is div by 3 and 5" + " "+is_num_div_with_3_and_5);
        System.out.println("num is div by 2 or 5" + " "+is_num_div_with_2_or_5);
        System.out.println("num is div by 2 and 5" + " "+is_num_div_with_2_and_5);
        System.out.println("num is div by 2 or 4" + " "+is_num_div_with_2_or_4);

        System.out.println(!true);

        //Conditional Operator

        int marks = 72;
        String result = marks>= 40 ? "PASS" : "FAIL";
        System.out.println(result);

        double total = 2500;
        boolean vip = true;
        boolean non_vip = false;
        double discount = non_vip ? total * 0.10 : 0;
        double payable = total - discount;
        System.out.println(payable);

        //Bitwise operator
        a = 5;
        b = 3;
        System.out.println(a & b); //1
        System.out.println(a | b); // 7
        System.out.println(a ^ b);//6
        a = 50;
        System.out.println(a >> 1); // 25
        System.out.println(a << 1); // 100 how

        System.out.println(25 >> 2); // 25,12,6
        System.out.println(25 << 2); // 25 50 100



    }
}
