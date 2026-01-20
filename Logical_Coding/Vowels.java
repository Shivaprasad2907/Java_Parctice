package Logical_Coding;

// Take a character and check if it’s a vowel or consonant. 
public class Vowels {
    public static void main(String[] args) {
        char ch = 'E';
        if (isVowel(ch)) {
            System.out.println(ch + " is a vowel.");
        } else {
            System.out.println(ch + " is a consonant.");
        }

    }

    static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
    
}
