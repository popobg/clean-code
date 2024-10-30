package ex2;

public class LivretA extends CompteBancaire {

	/** tauxRemuneration : taux de rémunération dans le cas d'un livret A */
	private double tauxRemuneration;

	/**
	 * Constructeur
	 * @param solde représente le solde du compte
	 * @param tauxRemuneration  représente le taux de rémunération du livret A
	 */
	public LivretA(double solde, double tauxRemuneration) {
		super(solde, 0);
		this.type = "LA";
		this.tauxRemuneration = tauxRemuneration;
	}

	/**
	 * Calcule la rémunération du livret A.
	 */
	public void appliquerRemuAnnuelle() {
		this.solde += (solde * tauxRemuneration) / 100;
	}

	/** Getter
	 * @return tauxRemuneration
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}

	/** Setter
	 * @param tauxRemuneration nombre décimal représentant le nouveau taux
	 *                         de rémunération
	 */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}
}
