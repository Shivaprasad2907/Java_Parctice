
public class TwoDimensionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int arr[][] = {};
		
		int arr[][] = {	{11, 22 ,33},
						{222, 333, 444},
						{555, 666, 777}
					  };
		
//		 PrintMatrix(arr);
//		 
//		 int target = 666;
//		 
//		 int result = SearchElment(arr, target);
//		 System.out.println(result);
//		 
//		 int maxelement = MaxElement(arr);
//		 System.out.println(maxelement);
		 
		 int accounts = accounts(new AccountsParameter(arr));
		 System.out.println(accounts);
		
		
		}
	
	
	  static int accounts(AccountsParameter parameterObject) {
		// TODO Auto-generated method stub
		  
//			for (int[] i : arr) {
//				for(int j: i) {
//					System.out.print(j + " " );
//				}
//				System.out.println(" ");
//			}
//		  int rowsum = 0;
		  int max = Integer.MIN_VALUE;
		  
		  for(int person = 0; person<parameterObject.arrs.length; person++) {
			  int rowsum = 0;
				 for(int account=0; account<parameterObject.arrs[person].length; account++) {
					 rowsum += parameterObject.arrs[person][account];
					
				 }
				 if(rowsum > max ) {
					 max = rowsum;
				 }
			 }
		  
		
		  
		  
		return max;
	}


	/**
	 * @param arr
	 * @param target
	 * @return
	 */
	static int SearchElment(int[][] arr, int target) {
		// TODO Auto-generated method stub
		 if(arr.length == 0) {
			 return -1;
		 }
		 
		 for(int i = 0; i<arr.length; i++) {
			 for(int j=0; j<arr[i].length; j++) {
				 if(arr[i][j] == target) {
					 return arr[i][j];
				 }
			 }
			 
		 }return -1;
		
	}


	static int MaxElement(int[][] arr) {
		
		
		 
		 int max = Integer.MIN_VALUE;
		
//		 for(int i = 0; i<arr.length; i++) {
//			 for(int j=0; j<arr[i].length; j++) {
//				 if(arr[i][j] > max) {
//					  max = arr[i][j];
//				 }
//			 }
//			 
//		 }
//		 
			for (int[] ints : arr) {
				for(int elemnt: ints) {
					if(max > elemnt) {
						return elemnt;
				
					}
					
					
				}
			
			}
		 
		 return max;
		
		
	}
	
		static  void PrintMatrix(int[][] arr) {
			
			for(int i=0; i<arr.length;i++) {
				for(int j = 0; j < arr[i].length; j++) {
					
					System.out.print(arr[i][j] + " ");

				}
				System.out.println(" ");
			}
//			System.out.println("[");
			for (int[] i : arr) {
				for(int j: i) {
					System.out.print(j + " " );
				}
				System.out.println(" ");
			}
//			System.out.println("]");
			
			if(arr.length == 0) System.out.println(-1);		 		
			
		}
	

	}


