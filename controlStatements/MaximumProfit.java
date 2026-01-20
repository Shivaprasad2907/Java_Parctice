package controlStatements;

public class MaximumProfit {


		// Function to find maximum
		// possible advertising value
		static int max_value(int array[][], int M,
		     int K, int N)
		{
		 
		 // To store advertising
		 // value at i-th minute
		 int[] time = new int[M];

		 for(int i = 0; i < N; i++)
		 {
		  time[array[i][0]] = array[i][1];
		 }

		 int[][] dp = new int[M][2];
		 
		 // Base Case
		 dp[0][0] = 0;
		 dp[0][1] = time[0];

		 for(int i = 1; i < M; i++)
		 {
		  
		  // If no advertisement is
		  // taken on ith minute
		  dp[i][0] = Math.max(dp[i - 1][0],
		       dp[i - 1][1]);

		  // If advertisement is taken
		  // on i-th minute
		  dp[i][1] = time[i];

		  if (i - K >= 0)
		  {
		   dp[i][1] += Math.max(dp[i - K][0],
		        dp[i - K][1]);
		  }
		 }
		 return Math.max(dp[M - 1][0], dp[M - 1][1]);
		}

		// Driver code
		public static void main(String[] args)
		{
		 
		 // array[][0] start time
		 // array[][1] advertising value
		 int array[][] = { { 0, 10 },
		     { 4, 110 },
		     { 5, 30 } };
		 
		 int N = 3;
		 int K = 4;
		 int M = 6;
		 
		 System.out.println(max_value(array, M, K, N));
		}
		}

