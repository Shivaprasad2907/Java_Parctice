package controlStatements;

import java.util.Scanner;

public class ExtendedString {
	public static String findIndex(String s, int k) {
		String extendedString = " ";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='0' && ch<='9') {
				for(int j=0;j<Integer.parseInt(String.valueOf(ch))-1;j++) {
					extendedString += extendedString;
				}
			}
			if((ch>='A' && ch <= 'Z')||(ch>='a' && ch<='z')) {
				extendedString += String.valueOf(ch);
			}
		}return String.valueOf(extendedString.charAt(k-1));
				
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String  s = sc.nextLine();
		int k=sc.nextInt();
		System.out.println(ExtendedString.findIndex(s, k));
	}
            
}
