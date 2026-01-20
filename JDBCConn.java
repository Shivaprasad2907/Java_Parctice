
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Properties;

public class JDBCConn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		PrintStream reader = null;
		try {
			reader = new PrintStream("db.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
	      
		    Properties p=new Properties();  
		    p.list(reader);  
		      
		    System.out.println(p.getProperty("user"));  
		    System.out.println(p.getProperty("password")); 

	}

}
