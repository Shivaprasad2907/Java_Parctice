package logical_coding;

// Check if one of two given numbers is a multiple of the other. 

public class Multipler {
    public static void main(String[] args) {
        int num1 = 15;
        int num2 = 5;

        if (num1 % num2 == 0 || num2 % num1 == 0) {
            System.out.println("One of the numbers is a multiple of the other.");
        } else {
            System.out.println("Neither number is a multiple of the other.");
        }
    }

}
