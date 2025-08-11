import java.io.*;


public class simple interest {
    public static void main(String[] args) {
        double principal = 1000; // Principal amount
        double rate = 5; // Interest rate
        double time = 2; // Time in years

        // Calculate simple interest
        double interest = (principal * rate * time) / 100;

        // Print the result
        System.out.println("Simple Interest: " + interest);
    }
    
}
