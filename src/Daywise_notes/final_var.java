package Daywise_notes;

final public class final_var {
    final int a = 45;
    final static  int b = 89;
    int d;// type is int it will def value is 0
    final int d1 = 45 ; //why ? because it has a def values

    static void main(String[] args) {
        final double pi; //no def values
        pi = 22/7;
//        pi = 89; //variable pi might already have been assigned
        final_var obj = new final_var();
        obj.d ++;//ince then assign same var
        //int o = obj.d1 ++;
        int b = obj.d1 + 5 ;
    }
}

//Abstract methods
// interface we can't make final {
	
