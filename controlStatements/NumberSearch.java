package controlstatements;

import java.util.Scanner;

public class NumberSearch {
	public static String Search(String str) {
		str = str.toLowerCase();
		int num=0;
	    double max = 0;
	    for(int i=0;i<str.length();i++) {
	    	char c= str.charAt(i);
	    	if(c>='0' && c<='9') {
	    		num += Integer.valueOf("" + c);
	    		
	    	}
	    	if(c>='a' && c<='z') {
	    		max++;
	    	}
	    }
	    System.out.println(max);
		double code = num/max;
		return ""+Math.round(code);
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String  str = sc.nextLine();
		
		System.out.println(Search(str));
	}
	
	 
	

}
