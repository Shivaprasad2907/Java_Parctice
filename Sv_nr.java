
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Sv_nr {

	public static void main(String[] args) throws FileNotFoundException,IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis = new FileInputStream("test.txt");
		
		int i;
		while((i = fis.read())  != -1) {
			System.out.println(i + "...");
			System.out.println((char)i);
		}

	}

}
