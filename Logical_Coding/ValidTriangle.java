package Logical_Coding;

public class ValidTriangle {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c = 10;

        if (isValidTriangle(a, b, c)) {
            System.out.println("The lengths " + a + ", " + b + ", and " + c + " can form a valid triangle.");
        } else {
            System.out.println("The lengths " + a + ", " + b + ", and " + c + " cannot form a valid triangle.");
        }
    }

    static boolean isValidTriangle(int a, int b, int c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

}
