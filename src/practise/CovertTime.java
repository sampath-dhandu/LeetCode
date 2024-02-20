package practise;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CovertTime {

    public static void main(String[] args) {
         Long time =1653008995669L;
        System.out.println(time.toString());
        Date date = new Date(time);
        Format format = new SimpleDateFormat("yyyy MM dd HH:mm:ss");
      System.out.println(format.format(date));
    }
}
