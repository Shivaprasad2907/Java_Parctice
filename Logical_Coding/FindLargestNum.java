package Logical_Coding;

// Take three numbers and print the largest

public class FindLargestNum {

    public static void main(String[] args) {
        int num1 = 45;
        int num2 = 78;
        int num3 = 48;

        if(num1 >= num2 && num1 >= num3) {
            System.out.println("The Largest Number is: " + num1);
        }
        else if(num2 >= num1 && num2 >= num3) {
            System.out.println("The Largest Number is: " + num2);
        }
        else {
            System.out.println("The Largest Number is: " + num3);
        }

    }
}