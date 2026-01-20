//define a logic for generating logic for displaying positive and negative separately 
public class PositiveandNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= { 1,2,3,4,5,6,-7,8,9};
		for( int i = 1;i<a.length;i++) {
			 if(i% 2 == 0) {
//					System.out.println("Positive numbers:");
					System.out.println(i);
				}
				
				
				else { 
					System.out.println("negative numbers");
					System.out.println(i);
				
			}
		}

	}

}
