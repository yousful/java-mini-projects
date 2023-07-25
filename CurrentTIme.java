import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentTIme {
     public static void main(String [] arg){

        Date currDate = new Date();
        SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss");
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        SimpleDateFormat dayOfTheWeekFormat = new SimpleDateFormat("EEEE");
        SimpleDateFormat clockFormat = new SimpleDateFormat("h:mm:ss a");
        System.out.println(dateFormat.format(currDate));
        System.out.println(timeFormat.format(currDate));
        System.out.println(dayOfTheWeekFormat.format(currDate));
        System.out.println(clockFormat.format(currDate));

     }
}
