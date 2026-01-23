public class BinarySearch {
	
	 public int search(int[] nums, int target) {
		 
		 int left = 0;
		 int right = nums.length - 1;
		 
	
		 
	        while (left <= right) {
	            int mid = left + (right - left) / 2;
	            System.out.println("mid" + mid);
	            
	            if (nums[mid] == target) { 
	                return mid;
	            }
	            else if (nums[mid] < target) {
	                left = mid + 1;
	            } 
	            else {
	                right = mid - 1;
	            }
	        }
	        return -1;
	    }
 
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int[] nums = {-1,0,1,5,7,8,9,10,11,13,15,19};
		int target = 1;
		
				;
		
		BinarySearch index  = new BinarySearch();
		
		int result = index.search(nums, target);
		
		System.out.println(result);
		
		

	}

}

/*
 * for(int i=0;i<nums.length; i++) { if(nums[i] == target) { return i; } }
 * return -1;
 */