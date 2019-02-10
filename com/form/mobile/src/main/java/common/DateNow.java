package common;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateNow {
    public  String dateOf() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Date date = new Date();
        return (dateFormat.format(date));

    }
}

