package controlStatements;

import java.io.Serializable;
import java.util.Scanner;

public class Equaldifference {

	
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
			
		int N = 0;
		System.out.println("enetr n value:");
		N=sc.nextInt();
		System.out.println("eneter A values");
		int  A= sc.nextInt();
		Serializable s= new int[A];
		for(int i=0;i<N;i++) {
				s=sc.nextInt();
		}
			
		long result = countPairs(A,N);
		System.out.println(result);
		sc.close();
	}
	
	
 


	static long countPairs(int s, int n)  throws java.lang.Exception {
		int c = s.length;
		int  v=0;
               for(int i=0;i<c;i++) {
            	   for(int j=i+1;j<c;j++) {
            		   if(A[i]<A[j]) {
            			   int x= c[j]-A[i];
            			   int y = j-i;
            			   if(x==y) {
            				   v++;
            			   }
            			   
            		   }
            	   }
               }

		return c;
	}

}
