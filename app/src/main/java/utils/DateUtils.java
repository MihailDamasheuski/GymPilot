package utils;

import android.icu.text.SimpleDateFormat;
import android.os.Build;
import android.support.annotation.RequiresApi;

import java.util.Calendar;

public class DateUtils {

    private static final String DATE_PATTERN = "HH:mm:ss";

    @RequiresApi(api = Build.VERSION_CODES.N)
    public static String getCurrentDate(){
        Calendar c = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat(DATE_PATTERN);
        return sdf.format(c.getTime());
    }
}
