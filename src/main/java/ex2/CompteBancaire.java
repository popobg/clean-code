package ex2;

/** Représente un compte bancaire de type compte courante (type=CC) ou livret A (type=LA)
 * @author DIGINAMIC
 */
public class CompteBancaire {

	/** Solde du compte */
	protected double solde;
	
	/** Montant du découvert autorisé (seulement pour les comptes courants) */
	protected double decouvert;
	
	/** Le type vaut soit CC = Compte courant, ou soit LA = Livret A */
	protected String type;
	
	/**
	 * Constructeur
	 * @param solde représente le solde du compte
	 * @param decouvert  représente le découvert autorisé
	 */
	public CompteBancaire(double solde, double decouvert) {
		super();
		this.type = "CC";
		this.solde = solde;
		this.decouvert = decouvert;
	}
	
	/**
	 * Ajoute un montant au solde.
	 * @param montant nombre décimal à ajouter
	 */
	public void ajouterMontant(double montant) {
		this.solde += montant;
	}
	
	/**
	 * Soustrait un montant au solde, si le résultat n'est pas inférieur
	 * au montant autorisé de découvert.
	 * @param montant nombre décimal à soustraire
	 */
	public void debiterMontant(double montant) {
		if (this.solde - montant > decouvert) {
			this.solde -= montant;
		}
	}
	
	/** Getter for solde
	 * @return solde
	 */
	public double getSolde() {
		return solde;
	}
	
	/** Setter
	 * @param solde the solde to set
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}

	/** Getter for decouvert
	 * @return decouvert
	 */
	public double getDecouvert() {
		return decouvert;
	}

	/** Setter
	 * @param decouvert le nombre décimal remplaçant le découvert autorisé
	 */
	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}

	/** Getter
	 * @return type de compte
	 */
	public String getType() {
		return type;
	}
}
