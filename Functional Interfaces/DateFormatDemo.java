import java.text.SimpleDateFormat;
import java.util.Date;

interface DateUtils {
    static String format(Date date, String pattern) {
        return new SimpleDateFormat(pattern).format(date);
    }
}

public class DateFormatDemo {
    public static void main(String[] args) {
        System.out.println(DateUtils.format(new Date(), "dd-MM-yyyy"));
    }
}
