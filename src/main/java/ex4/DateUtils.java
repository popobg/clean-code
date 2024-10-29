package ex4;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 */
public class DateUtils {

    public static String format(String pattern, Date date) {
        SimpleDateFormat formateur = new SimpleDateFormat(pattern);
        return formateur.format(date);
    }

    public static String formatDefaut(Date date) {
        return format("dd/MM/yyyy HH:mm:ss", date);
    }
}
