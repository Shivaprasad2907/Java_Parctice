package StringManupulation;

// Print the second half of the string in reverse. If the string has an odd length, include the middle character in the second half.

public class HalfReverseString {
    public static void main(String[] args) {
        String input = "abcdefgh";
        String result = halfReverse(input);
        System.out.println(result);  // Output: "abcdhgfe"
        
    }
    public static String halfReverse(String str) {
        int length = str.length();
        int mid = (length + 1) / 2; // Middle index, includes middle character for odd lengths
        
        String firstHalf = str.substring(0, mid);
        String secondHalf = str.substring(mid);
        
        String reversedSecondHalf = new StringBuilder(secondHalf).reverse().toString();
        
        return reversedSecondHalf;
    }

}
