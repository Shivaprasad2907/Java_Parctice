// 3. Find Kth Largest Element in an Array
// Step 1: Understanding the problem
// The goal is to find the k-th largest element in a given array. This can be achieved by sorting the array and then accessing the element at the appropriate index.
// Step 2: Algorithm
// 1. Sort the input array nums in descending order.
// 2. The k-th largest element will be at index k-1 in the sorted array (since arrays are 0-indexed).
// Answer:
// For nums = [3, 2, 1, 5, 6, 4] and k = 2:
// 1. Sorting nums in descending order gives [6, 5, 4, 3, 2, 1].
// 2. The 2nd largest element (at index 2-1 = 1) is 5.
import java.util.Arrays;
public class find_secondlargest_number {

    public static void main( String args[]){
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;
        for(int i=0; i<nums.length;i++){
            for(int j=i+2;j<nums.length;j++){

                if(nums[i]>nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    i++;
                    j--;
                }
            }   
        }
        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.println("The " + k + "th largest element is: " + nums[nums.length - k]);
        System.out.println();
    }
}

