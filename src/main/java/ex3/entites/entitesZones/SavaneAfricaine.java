package ex3.entites.entitesZones;
import ex3.entites.entitesAnimal.Animal;

public class SavaneAfricaine extends Zone {

	/**
	 * Constructeur
	 * @param animals liste d'objets Animal
	 */
	public SavaneAfricaine(Animal... animals) {
		super();
		this.nom = "Savane africaine";
	}

	/**
	 * Retourne la quantité de nourriture journalière consommée
	 * par les animaux de la savane africaine en kilogrammes.
	 * @return double, kgs de nourriture journaliers
	 */
	public double calculerKgsNourritureParJour() {
		return animals.size() * 10;
	}
}