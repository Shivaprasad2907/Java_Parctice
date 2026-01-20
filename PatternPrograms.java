
public class PatternPrograms {
	public static void main(String[] args) {

		 int rows = 5;
		 System.out.println("Pattern 1:");
		 pattern1(rows);
		 System.out.println("\nPattern 2:");
		 pattern2(rows);

   }

	static void pattern1(int rows) {

		 for (int i = 1; i <= rows; i++) {
		 for (int j = 1; j <= i; j++) {
		 System.out.print(j + " ");

	 }
		System.out.println();
		}
  }

	static void pattern2(int rows) {

	 for (int i = rows; i >=1; i--) {
	 for (int j = 1; j <= i; j++) {
	 System.out.print(j + " ");
	 }
	System.out.println();
    }
  }
}