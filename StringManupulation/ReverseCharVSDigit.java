import java.util.logging.Logger;

public class ReverseCharVSDigit {
    private static final Logger logger = Logger.getLogger(ReverseCharVSDigit.class.getName());
    
    public static void main(String[] args) {
        String input = "a1b2c3d4";
        String result = reverseCharsAndDigits(input);
        logger.info(result); // Output: d4c3b2a1
    }

    static String reverseCharsAndDigits(String str) {
        char[] chars = str.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            if (!Character.isLetter(chars[left])) {
                left++;
            } else if (!Character.isDigit(chars[right])) {
                right--;
            } else {
                // Swap characters
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
        }
        return new String(chars);
    }

}
