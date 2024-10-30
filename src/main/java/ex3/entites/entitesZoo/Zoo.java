package ex3.entites.entitesZoo;

import ex3.entites.entitesAnimal.Animal;
import ex3.entites.entitesZones.Aquarium;
import ex3.entites.entitesZones.FermeReptile;
import ex3.entites.entitesZones.SavaneAfricaine;
import ex3.entites.entitesZones.ZoneCarnivore;

import java.util.ArrayList;

public class Zoo {

	/** Chaîne de caractères représentant le nom du zoo */
	private String nom;
	/** Savane africaine du zoo */
	private SavaneAfricaine savaneAfricaine;
	/** Zone carnivore du zoo */
	private ZoneCarnivore zoneCarnivore;
	/** Ferme reptile du zoo */
	private FermeReptile fermeReptile;
	/** Aquarium du zoo */
	private Aquarium aquarium;

	/**
	 * Constructeur
	 * @param nom chaîne de caractères représentant le nom du zoo
	 */
	public Zoo(String nom){
		this.nom = nom;
		this.zoneCarnivore = new ZoneCarnivore();
		this.savaneAfricaine = new SavaneAfricaine();
		this.fermeReptile = new FermeReptile();
		this.aquarium = new Aquarium();
	}

	/**
	 * Ajoute le ou les animaux dans la bonne zone du zoo,
	 * selon son type et son comportement.
	 * @param animals tableau d'objet Animal (paramètres multiples)
	 */
	public void addAnimals(Animal... animals) {
		for (Animal animal : animals) {
            switch (animal.getType().getNom()) {
                case "MAMMIFERE":
                    if (animal.getComportement().getDescription().equals("CARNIVORE")) {
                        this.zoneCarnivore.addAnimal(animal);
                    } else if (animal.getComportement().getDescription().equals("HERBIVORE")) {
                        this.savaneAfricaine.addAnimal(animal);
                    }
					else {
						System.out.println("Le comportement de ce mammifère " + animal.getNom() + " n'est pas connu.");
					}
                    break;
                case "REPTILE":
                    this.fermeReptile.addAnimal(animal);
                    break;
                case "POISSON":
                    this.aquarium.addAnimal(animal);
                    break;
				default:
					System.out.println("Le type de cet animal " + animal.getNom() + " n'est pas connu.");
            }
		}
	}

	/**
	 * Affiche la liste de tous les animaux du zoo.
	 */
	public void afficherListeAnimaux() {
		savaneAfricaine.afficherListeAnimaux();
		zoneCarnivore.afficherListeAnimaux();
		fermeReptile.afficherListeAnimaux();
		aquarium.afficherListeAnimaux();
	}

	/** Getter
	 * @return nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter
	 * @param nom nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
}