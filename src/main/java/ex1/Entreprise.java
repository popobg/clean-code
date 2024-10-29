package ex1;

import java.util.Date;

public class Entreprise {

	/** Entier représentant le numéro siret de l'entreprise */
	private int siret;

	/** Chaîne de caractères représentant le nom de l'entreprise */
	private String nom;

	/** Chaîne de caractères représentant l'adresse de l'entreprise */
	private String adresse;

	/** Date représentant la date de création de l'entreprise */
	private Date dateCreation;

	/**
	 * Constante représentant le capital maximal que peut
	 * avoir une entreprise.
	 */
	public static final int CAPITAL_MAX = 3000000;

	/** Méthode affichant le statut de l'entreprise */
	public void afficherStatut() {
		System.out.println("Nom : " + this.nom + "\nSiret : " + this.siret + "\nDate de création : " + this.dateCreation.toString() + "\nAdresse : " + this.adresse);
	}

	/**
	 * Getter
	 * @return String, nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter
	 * @param nom chaîne de caractères visant à remplacer le nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Getter
	 * @return int, siret
	 */
	public int getSiret() {
		return siret;
	}

	/**
	 * Setter
	 * @param siret entier visant à remplacer le numéro siret
	 */
	public void setSiret(int siret) {
		this.siret = siret;
	}

	/**
	 * Getter
	 * @return String, adresse
	 */
	public String getAdresse() {
		return adresse;
	}

	/**
	 * Setter
	 * @param adresse chaîne de caractères visant à remplacer l'adresse
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	/**
	 * Getter
	 * @return Date, la date de création de l'entreprise
	 */
	public Date getDateCreation() {
		return dateCreation;
	}

	/**
	 * Setter
	 * @param dateCreation la date de création de l'entreprise
	 */
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
}
