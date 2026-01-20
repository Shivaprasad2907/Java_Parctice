package Logical_Coding;

// Take n numbers and print the largest number using method using array and while loop or if/for loop
public class FindLargestNumUsingMethod {

    public static void main(String[] args){
        int[] numbers = {34, 67, 23, 89, 12, 90, 45};
       int Largest = findLargest(numbers);
       System.out.println("The largest number is: " + Largest);

    // sorting the array using using loop in method and second largest number in through method
        int n = numbers.length;
        int second = findSecondLargest(numbers);
        System.out.println("The second largest number is: " + second);
    
    // sorting is using bubble sort
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (numbers[j] > numbers[j+1]) {
                    // swap numbers[j] and numbers[j+1]
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }
        System.out.println("Sorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i] + " ");
        }

    }

    static int findSecondLargest(int[] numbers) {
        int largest = findLargest(numbers);
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != largest && numbers[i] > secondLargest) {
                secondLargest = numbers[i];
            }
        }
        return secondLargest;
    }

    static int findLargest(int[] numbers) {
        int largest = numbers[0];

        for( int i = 1; i< numbers.length; i++) {
            if(numbers[i] > largest) {
                largest = numbers[i];
            }
         
        }
        return largest;
    }

    
}
