package ex4;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Classe utilitaire contenant des méthodes de formattage de date
 */
public final class DateUtils {

    /** Pattern de formattage par défaut */
    public static final String PATTERN_DEFAUT = "dd/MM/yyyy HH:mm:ss";

    /**
     * Méthode retournant un formattage de la date selon le pattern donné.
     * @param pattern chaîne de caractères représentant le pattern de formattage
     * @param date date
     * @return
     */
    public static String format(String pattern, Date date) {
        SimpleDateFormat formateur = new SimpleDateFormat(pattern);
        return formateur.format(date);
    }

    /**
     * Méthode retournant un formattage de la date selon le pattern par défaut
     * (dd/MM/yyyy HH:mm:ss).
     * @param date date
     * @return
     */
    public static String formatDefaut(Date date) {
        return format(PATTERN_DEFAUT, date);
    }
}
