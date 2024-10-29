package ex3.entites.entitesZones;
import ex3.entites.entitesAnimal.Animal;

public class Aquarium extends Zone {

	/**
	 * Constructeur
	 * @param animals liste d'objets Animal
	 */
	public Aquarium(Animal... animals) {
		super();
		this.nom = "Aquarium";
	}

	/**
	 * Retourne la quantité de nourriture journalière consommée
	 * par les animaux de l'aquarium en kilogrammes.
	 * @return double, kgs de nourriture journaliers
	 */
	public double calculerKgsNourritureParJour() {
		return animals.size() * 0.2;
	}
}