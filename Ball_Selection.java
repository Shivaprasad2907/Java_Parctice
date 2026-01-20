// public 5. Ball Selection
// Step 1: Understanding the problem
// The task is to randomly select a ball from a set of 1000 unique balls, ensuring that neither the smallest nor the largest numbered ball is selected.
// Step 2: Programmatic Approach
// 1. Assume the balls are numbered from min_num to max_num.
// 2. Generate a random number selected_num within the range (min_num + 1) to (max_num - 1).
// This ensures that the smallest and largest numbers are excluded.
// 3. Select the ball corresponding to selected_num.
// Answer:
// The program should generate a random number within the range of ball numbers, excluding the minimum and maximum values. 
// For example, if the balls are numbered 1 to 1000, the program should randomly select a number between 2 and 999 (inclusive). {
// }
import java.util.Random;
public class Ball_Selection {
    public static void main(String[] args) {
        int minNum = 1; // Minimum ball number
        int maxNum = 1000; // Maximum ball number

        int selectedBall = selectBall(minNum, maxNum);
        System.out.println("Selected ball number: " + selectedBall);

        Random rand = new Random();
        // Generate a random number between minNum + 1 and maxNum - 1
        int selectedNum = rand.nextInt((maxNum - 1) - (minNum + 1) + 1) + (minNum + 1);
        System.out.println("Selected ball number: " + selectedNum);
    }

    public static int selectBall(int minNum, int maxNum) {
        Random rand = new Random();
        // Generate a random number between minNum + 1 and maxNum - 1
        return rand.nextInt((maxNum - 1) - (minNum + 1) + 1) + (minNum + 1);
    }
}
     

