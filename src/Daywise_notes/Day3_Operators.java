package Daywise_notes;

public class Day3_Operators {
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



    }
}
