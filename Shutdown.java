import java.io.IOException;

public class Shutdown {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stu
		try{
			Runtime.getRuntime().exec("shutdown /s /t 1");
		}
		catch( IOException e){
			e.printStackTrace();
			}

	}

}
