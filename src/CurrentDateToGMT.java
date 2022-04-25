import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentDateToGMT {
	
	Date localTime = new Date();

    //create DateFormat to perform conversion from local timezone to GMT


            DateFormat convert = new SimpleDateFormat("dd/MM/yyyy:HH:mm:ss");


    //get GMT timezone and you can get any timezone like below e.g. UTC


         //convert.setTimeZone(TimeZone.getTimeZone("GMT"));

        // System.out.println("local time : " + localTime);

       // System.out.println("time in GMT : " + convert.format(localTime));


}
