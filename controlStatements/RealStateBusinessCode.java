package controlstatements;

public class RealStateBusinessCode {
	
	//Real Estate Business
	int n, m;
	
	static int maxBipartiteMatching(int n, int m, int[][] clients, int[][] houses) {
	boolean[][] matrix = new boolean[n][m];
	  for(int i = 0; i < n; i ++) {
	   int m;
	   for(int j = 0; j < m; j++) {
	    int[][] clients;
		int[][] houses;
		if(clients[i][0]<= houses[j][0] && clients[i][1] >= houses[j][1] )
	     matrix[i][j] = true;
	   }
	  }
	  
	  int [] matchR = new int [m];
	  Arrays.fill(matchR, -1);
	  
	  int result = 0;

	  
	  for(int u = 0 ; u< n; u++) {
	   boolean[] isSeen = new boolean[m];
	   if(findHouse(matrix, u, isSeen, matchR)) {
	       result++; 
	   }
	  }
	  return result;
	 }	
	
	static boolean findHouse(boolean[][] matrix, int clientU, boolean[] isSeen, int[] matchR ) {
	  int length = isSeen.length;
	  for(int v = 0; v < length; v ++) {
	   if(matrix[clientU][v] == true && !isSeen[v]) {
	    isSeen[v] = true;
	    
	    if(matchR[v] < 0 || findHouse(matrix, matchR[v], isSeen, matchR)) {
	     matchR[v] = clientU;
	     return true;
	    }
	   }
	  }
	  
	  return false;
	 }

	public int maxMatch(int n, int m, int[][] clients, int[][] houses) {
		clients = new int[n][2];
		houses = new int[m][2];
		return 0;
	}


	public static void main(String[] args) {
		RealStateBusinessCode rsbc = new RealStateBusinessCode();
		int n = 3;
		int m = 3;
		int[][] clients = {{1000, 2000}, {2000, 3000}, {1500, 2500}};
		int[][] houses = {{1200, 1800}, {2200, 2800}, {1600, 2400}};
		int result = rsbc.maxMatch(n, m, clients, houses);
		System.out.println("Maximum number of matches: " + result);
	}
}


