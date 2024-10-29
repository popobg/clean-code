package ex3.entites.entitesZones;
import ex3.entites.entitesAnimal.Animal;

public class FermeReptile extends Zone {

	/**
	 * Constructeur
	 * @param animals liste d'objets Animal
	 */
	public FermeReptile(Animal... animals) {
		super();
		this.nom = "Ferme reptile";
	}

	/**
	 * Retourne la quantité de nourriture journalière consommée
	 * par les animaux de la ferme à reptile en kilogrammes.
	 * @return double, kgs de nourriture journaliers
	 */
	public double calculerKgsNourritureParJour() {
		return animals.size() * 0.1;
	}
}