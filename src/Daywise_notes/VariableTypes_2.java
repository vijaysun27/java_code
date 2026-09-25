package Daywise_notes;

public class VariableTypes_2 {

    String passengerName; // instance variable
    static int bookingCount = 0; // static variable

    void createBooking() {
        String pnr = "PNR101"; // local variable

        bookingCount++;
        passengerName = "Anu";

        System.out.println(pnr);
        System.out.println(passengerName);
        System.out.println(bookingCount);
    }

    public static void main(String[] args) {

        VariableTypes_2 obj = new VariableTypes_2();

        obj.createBooking();
    }
}
