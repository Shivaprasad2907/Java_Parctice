package StringManupulation;

// Write a Java program to remove the first and last character of a string. AND PRINT REMAINING STRING.

public class RemoveFirstandLastChar {
    public static void main(String[] args) {
        String str = "HelloWorld";
        if (str.length() > 2) {
            String result = str.substring(1, str.length() - 1);
            System.out.println("Original String: " + str);
            System.out.println("String after removing first and last character: " + result);
        } else {
            System.out.println("String is too short to remove characters.");
        }

    }

}
