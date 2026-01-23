package StringManupulation;

// Print the middle character(s) of a string. 

public class MiddleWord {
    public static void main(String[] args) {
        
        String str = "example";
        int length = str.length();
        String middle;

        if (length % 2 == 0) {
            // Even length: get the two middle characters
            middle = str.substring((length / 2) - 2, (length / 2) + 3);
        } else {
            // Odd length: get the single middle characters
            middle = str.substring(length / 2, (length / 2) + 3);
        }

        System.out.println("Middle character(s): " + middle);
    }

}
