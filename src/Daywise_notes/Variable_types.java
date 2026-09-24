package Daywise_notes;

public class Variable_types {
    public static void main(String[] args){
        /*
            local var :-->
            static var :-->
            non static var :-->

         */
        /*
          local var:--> any var  dec in side a block we can call it local var
          {   block:-- if,else,while,do,while,for,method,main method,static block's
          }
         */

            int local_var = 9869;
            System.out.println(local_var);


            {
                int b = 895;

            }
//        System.out.println(b);

        }
    }


/*
       static var:-->which var dec inside a class out-side a method
       how to do:-->
       static int var_name = init;
       static int var_name;
 */
    class vartype_2{
        //    static var
        static int a = 89;
        static void main(String[] args) {
            System.out.println(a);//89
            System.out.println(b);// 0
        }
        static int b;//
        //static var
    }

//non static
// static and non-static in diff class
//keywords

