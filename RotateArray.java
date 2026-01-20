// public 6. Rotate Array
// Step 1: Understanding the problem
// The goal is to rotate a given array to the right by k steps. This means the last k elements move to the beginning, and the remaining elements shift accordingly.
// Step 2: Algorithm
// 1. Handle the case where k is greater than the array length by taking k = k % len(nums).
// 2. Split the array into two parts: the last k elements and the first len(nums) - k elements.
// 3. Concatenate the last k elements with the first len(nums) - k elements.
// Answer:
// For nums = [1, 2, 3, 4, 5, 6, 7] and k = 3:
// 1. The last k=3 elements are [5, 6, 7].
// 2. The first len(nums) - k = 7 - 3 = 4 elements are [1, 2, 3, 4].
// 3. Concatenating them gives [5, 6, 7, 1, 2, 3, 4].
// The rotated array is . {
    
// }
import java.util.Arrays;
public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        rotate(nums, k);
        System.out.println("Rotated array: " + Arrays.toString(nums));
    }

    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // Handle cases where k is greater than the array length

        // Reverse the entire array
        reverse(nums, 0, n - 1);
        // Reverse the first k elements
        reverse(nums, 0, k - 1);
        // Reverse the remaining n-k elements
        reverse(nums, k, n - 1);
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}