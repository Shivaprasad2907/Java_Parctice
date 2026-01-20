// public 4. Minimum Number of Jumps to Reach the End
// Step 1: Understanding the problem
// This is a dynamic programming or greedy problem where we need to find the minimum number of jumps to reach the end of an array, given that each element represents the maximum jump length from that position.
// Step 2: Algorithm (Greedy Approach)
// 1. Initialize jumps = 0, current_reach = 0, max_reach = 0.
// Iterate through the array.
// .
// For each element i:
// 3. If the end of the array is reached, return jumps.
// Answer:
// For arr = [2, 3, 1, 1, 4]:
// 1. jumps = 0, current_reach = 0, max_reach = 0.
// 2. i = 0, arr[0] = 2: max_reach = max(0, 0+2) = 2. i == current_reach (0==0), so jumps = 1, current_reach = 2.
// 3. i = 1, arr[1] = 3: max_reach = max(2, 1+3) = 4.
// 4. i = 2, arr[2] = 1: max_reach = max(4, 2+1) = 4. i == current_reach (2==2), so jumps = 2, current_reach = 4.
// 5. i = 3, arr[3] = 1: max_reach = max(4, 3+1) = 4.
// 6. i = 4, arr[4] = 4: max_reach = max(4, 4+4) = 8.
// Since we reached the end of the array, the minimum number of jumps is 2. {
    
// }
public class Minimum_No_of_Jumps {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 1, 4};
        System.out.println("Minimum number of jumps to reach the end: " + minJumps(arr));
    }

    public static int minJumps(int[] arr) {
        if (arr.length <= 1) return 0; // No jumps needed if array length is 1 or less
        if (arr[0] == 0) return -1; // Cannot move anywhere if the first element is 0

        int jumps = 0; // Number of jumps made
        int currentReach = 0; // The farthest point that can be reached with the current number of jumps
        int maxReach = 0; // The farthest point that can be reached with one more jump

        for (int i = 0; i < arr.length - 1; i++) {
            maxReach = Math.max(maxReach, i + arr[i]); // Update the maximum reach

            if (i == currentReach) { // If we have come to the end of the current reach
                jumps++; // We need to make a jump
                currentReach = maxReach; // Update the current reach to the maximum reach

                if (currentReach >= arr.length - 1) { // If we can reach or exceed the end
                    break;
                }
            }
        }

        return jumps;
    }
}
