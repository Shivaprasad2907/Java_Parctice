package logical_coding;

// Take two numbers and print the larger one.
public class FindLargestNumber {
    public static void main(String[] args) {
        double num1 = 75480.45;
        double num2 = 875854.25;

        if(num1 > num2) {
            System.out.println( "The Largest Number is; " + num1 );
        }
        else if( num2 > num1 ) {
            System.out.println("The Largest Number is: " + num2);
        }
        else {
            System.out.println("Both numbers are equal: " + num1);
        }

        
    }

}
