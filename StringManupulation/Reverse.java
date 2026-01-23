package StringManupulation;

//  Check if two strings are the reverse of each other.
public class Reverse {

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "olleh";

        int lent = str2.length();
        for (int i = 0; i < lent; i++) {
           System.out.println(str2.charAt(lent - 1 - i));
        }

        if (isReverse(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are reverses of each other.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not reverses of each other.");
        }
    }

    public static boolean isReverse(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        int len = str1.length();
        for (int i = 0; i < len; i++) {
            if (str1.charAt(i) != str2.charAt(len - 1 - i)) {
                return false;
            }
        }
        return true;
    }

}
