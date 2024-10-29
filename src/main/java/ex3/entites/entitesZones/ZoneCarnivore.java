package ex3.entites.entitesZones;
import ex3.entites.entitesAnimal.Animal;

public class ZoneCarnivore extends Zone {

	/**
	 * Constructeur
	 * @param animals liste d'objets Animal
	 */
	public ZoneCarnivore(Animal... animals) {
		super();
		this.nom = "Zone carnivore";
	}

	/**
	 * Retourne la quantité de nourriture journalière consommée
	 * par les animaux en kilogrammes.
	 * @return double, kgs de nourriture journaliers
	 */
	public double calculerKgsNourritureParJour(){
		return animals.size() * 10;
	}
}