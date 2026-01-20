package controlStatements;

import java.util.Scanner;

public class SUMofN {
	public static void main(String[] args) {
		
		Scanner str = new Scanner(System.in);
		
		int n, i,sum=0;
		System.out.print("Enter N value =" );
		  n =str.nextInt();
		str.close();
		for(i=1;i<=10;i++) 
		{
			sum = sum+n;
			System.out.println( n + " * "+i + "="+sum);
		}
		
		 
		
		
		
		
	}

}
