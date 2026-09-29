package Daywise_notes;
import java.util.Scanner;
public class flow_con {
	static void main(String[] args) {

        // given num is +ve or -ve or 0
        Scanner sc = new Scanner(System.in);//when down djk
        System.out.println("pls enter the num = ");
        int num = sc.nextInt();

        if(num > 0){
            System.out.println("+ve num");
        }
        else if(num == 0){
            System.out.println("num is 0");
        }
        else{
            System.out.println("num is -ve ");
        }

//        Scanner sc = new Scanner(System.in);//when down djk
//        System.out.println("pls enter the pn pin = ");
//        // once ph unlock then u can unlock to wt app
//         int pnpin = sc.nextInt();
//         if(pnpin == 1234){
//             System.out.println("login to ph");
//
//             System.out.println("pls enter the whatapp pin = ");
//             int whatapp = sc.nextInt();
//             if(whatapp == 4567){
//                 System.out.println("login to whatapp");
//             }
//             else{
//                 System.out.println("invalid pin whatapp");
//             }
//         }
//         else{
//             System.out.println("invalid pin");
//         }








//        int num = sc.nextInt();
//
//     // give num is +ve or -ve
//        if(num < 0){
//            System.out.println("-ve num");
//        }
//        else{
//            System.out.println("+ve num");
//        }
//    // take the input from the user un and pwd if user enter the valid data then login
//        // un = 2abc@gmail.com  pwd = abc@123
//        System.out.println("pls enter the un");
//        String un = sc.next();
//
//        System.out.println("pls enter the pwd");
//        String pwd = sc.next();
//
//        System.out.println("pls enter the otp");
//        int otp = sc.nextInt();
//
//        if(un.equals("abc@gmail.com") && pwd.equals("abc@123")){
//            System.out.println("login");
//        }
//        else if(otp == 4567){
//            System.out.println("u can login");
//        }
//        else{
//            System.out.println("error");
//        }



        //imput at run-time  :-->i am using the Scaner class
        // why :--> int :--nextInt() / long:--nextLong()/string :-- next()
        // all method non-staitc
      /*  Scanner sc = new Scanner(System.in);//when down djk
        int num = sc.nextInt();
        System.out.println(num); //?
        String name = sc.next();
        System.out.println("u enter the name = " + name);
*/





//        int num = -89; // i want check give num is +ve or -ve
//        if(num > 0){ // 45 > 0 ;true
//            System.out.println("give num is +ve");
//        }
//      //  num = -89;
//       if(num < 0) { // -89 < 0 T
//           System.out.println("give num is -ve");
//       }
//       if(num == 0){
//           System.out.println("give num is 0");
//       }
//
    }
}
/*
 if condition is true then it i will exc if block otherwise it not exc if block
    Syntax:--
    if(condition){
       //set of line s of coode
    }
 /ex - flow
 if(true){
    // it exg the if block
 }

 if(fasle){
    //it not ex if block
 }
 */

/*
    if else :-->
    if condtion is true then it exg the if block otherwise it will excute the else block
    if(condition){
       //lines
    }
    else{
      //lines
    }
 */
/*
    else if :-->  if condition is False then i want check new Condition then i will use else if

    if(conition){
     // if block
    }
    else if(condition){
     // else if clock
    }
    else if(condition){
    // else if block
    }
    else {
      //else
    }



 */
/*
nested if :-- one if inside anther if
whne :-- when i condition is true then need to check next conition then i will use nested id

if(conition){

  // if block
  if(conition){
     //if block
        if(conditon){
         // if blcok
        }
        else{ //else block}
       else{//else block}
       else{//else block}
  }
}






 */

