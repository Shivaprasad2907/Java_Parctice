package Logical_Coding;

// Check whether a year is leap year or not using method
public class LeapYear {
    public static void main(String[] args) {
        int year = 2019;
        if(isLeapyear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }

    static boolean isLeapyear(int year) {
        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }
}
