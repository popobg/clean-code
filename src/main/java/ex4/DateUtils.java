package ex4;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 */
public class DateUtils {
    /** pattern de formatage */
    private SimpleDateFormat formateur;

    /**
     * Constructeur
     * @return
     */
    public DateUtils() {
        this.formateur = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");;
    }

    /**
     * Constructeur
     * @param pattern chaîne de caractères correspondant au pattern
     *               de formatage de la date
     * @return
     */
    public DateUtils(String pattern) {
        this.formateur = new SimpleDateFormat(pattern);
    }


    public String format(Date date) {
        return this.formateur.format(date);
    }

    /**
     * Getter
     * @return formateur
     */
    public SimpleDateFormat getFormateur() {
        return formateur;
    }

    /**
     * Setter
     * @param formateur formateur
     */
    public void setFormateur(SimpleDateFormat formateur) {
        this.formateur = formateur;
    }
}
