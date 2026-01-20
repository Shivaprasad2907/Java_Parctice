import java.util.ArrayList;

public class ObjectArray {
	public static void main(String[] args) {
		
		int[] a = new int[10];
		
		int b[] = new int[5];
		int c[] = {45,8,6,89,9};
		System.out.println(b[3]);
		System.out.println(c[4]);
		
		b[3] = 123;
		System.out.println(b[3]);
		a[0] = 10;
		a[1] = 106;
		a[2] = 107;
		a[3] = 108;
		a[4] = 109;
		a[5] = 110;
//		a[6] = (String)"string";
		System.out.println(c);
		
		System.out.println(a[6]);
		System.out.println("length of array" + a.length);
		System.out.println("\n foeach start \n");
		for (Object i : a) {
			System.out.println(i);
		}
		System.out.println("\n for each end \n");
		System.out.println("\n for loop start \n");
		for ( int j = 0; j<a.length;j++) {
			System.out.println(a[j]);
		}
		System.out.println("\n for loop end \n");
		
		System.out.println("\n while loop strat \n");
		
		int i = 0;
		Object d;
		while(i == 0 || i < a.length) {
		d =  a[i++];
			System.out.println(d);
		}
		
		System.out.println("\n while loop ends \n");
//iNDEXOUTOFBOUNDEXCEPTION		
//		b[6] = 5687;
//		System.out.println(b[6]);	
		
		 
		ArrayList<Object> ex = new ArrayList<>();
			ex.add("strring");
			ex.add(1234);	
				
			System.out.println(ex.get(0));
			System.out.println(ex.get(1));
	}

}
