package StringManupulation;

import java.util.Calendar;
import java.util.Date;


public class StringSB {
     public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello, World!");
        System.out.println(sb);
        System.out.println(sb.reverse());


        Date date = new Date();
        // SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        // String dateStr = sdf.format(date);
        System.out.println(date);

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());
        System.out.println(calendar.JANUARY);



    }
}

                                                                           

