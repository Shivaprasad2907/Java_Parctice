package logical_coding;

import java.util.Scanner;

// Take a number and print whether it’s positive, negative, or zero.

public class NumberChecking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        Double number = scanner.nextDouble();

        if(number > 0) {
            System.out.println("The number is positive.");
        } else if(number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero."    );
        }

        scanner.close();
    }
}
