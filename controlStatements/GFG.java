package controlStatements;

import java.io.*;

@SuppressWarnings("unused")
public class GFG {
 
    // Function to calculate sum of all
    //divisors of a given number
   public static int SmithNumber(int n) {
	   int sum=0,v=0;
	   
	   
	   while(n!=0) {
		   
		   v=n%10;
		   
		   sum=sum+v;
		   
		   n=n/10;
	   }
//	   System.out.println("sum" + sum);
	      	
	  String prime="";
	    for(int i=2;i<=n;i += 2) {
	    	while(n%i==0) {
	     prime = prime +i;
	     n=n/i;
	    		}
	    }
	    
	      
	   if(n>2) {
	    	prime = prime + n; 
	      }
	   int trim=0;
	   for(int i=0;i<prime.length();i++) {
		   trim= trim + (int)prime.charAt(i)-48;
	   }
	  
		if(trim==sum){
	    	return trim;
	    }
	   
	   else {
		   return -1;
	   }
	   
	   

	   
   }
     
    // Driver program to run the case
    public static void main(String[] args)
    {
        int n = 666;
        System.out.println(SmithNumber(n));
    }
}