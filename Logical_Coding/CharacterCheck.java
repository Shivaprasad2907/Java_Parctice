package logical_coding;

import java.util.Scanner;

// Take a character and check whether it’s uppercase, lowercase, a digit, or a special character.
public class CharacterCheck {

    public static void main(String[] args) {

        // character no. of inputs using array from user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number Char want to: ");
        int numChars = scanner.nextInt();
        char[] chars = new char[numChars];
        System.out.println("Enter " + numChars + " characters: ");
        for (int i = 0; i < numChars; i++) {
            chars[i] = scanner.next().charAt(0);
        }   
        System.out.println(chars);
        for (char ch : chars) {
            checkCharacterType(ch);
        }

        scanner.close();
    }

    static void checkCharacterType(char ch) {
        if (isUppercase(ch)) {
            System.out.println(ch + " is an uppercase letter.");
        } else if (isLowercase(ch)) {
            System.out.println(ch + " is a lowercase letter.");
        } else if (isDigit(ch)) {
            System.out.println(ch + " is a digit.");
        } else {
            System.out.println(ch + " is a special character.");
        }
    }

    static boolean isUppercase(char ch) {
        return ch >= 'A' && ch <= 'Z';
    }

    static boolean isLowercase(char ch) {
        return ch >= 'a' && ch <= 'z';
    }
    static boolean isDigit(char ch) {
        return ch >= '0' && ch <= '9';
    }
}
