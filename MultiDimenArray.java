public class MultiDimenArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] a = { {2,3,4},
					  {5,6,7}, 
					  {8,9,10}
					};
		
//		length of an array
		System.out.println("Length of an array " + a.length);
		System.out.println("length of an array coloumn " + a[0].length );
		
//		each value of an array
		System.out.println("first row  " + a[0][0] + " " + a[0][1] + " "+ a[0][2]);
		System.out.println("Second row " +a[1][0] + " " + a[1][1] + " "+ a[1][2]);
		System.out.println("Third row  " +a[2][0] + " " + a[2][1] + " "+ a[2][2]);

//		read all values of an array
		System.out.println();
		
		
	}

}
