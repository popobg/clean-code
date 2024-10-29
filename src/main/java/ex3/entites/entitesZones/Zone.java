package ex3.entites.entitesZones;

import ex3.entites.entitesAnimal.Animal;

import java.util.Arrays;
import java.util.List;

public abstract class Zone {
    /** liste d'animaux (objet Animal) */
    protected List<Animal> animals;
    protected String nom;

    /**
     * Constructeur
     * @param animals liste d'objets Animal
     */
    public Zone(Animal... animals) {
        this.animals.addAll(Arrays.asList(animals));
    }

    /**
     * Ajoute un animal à la liste des animaux.
     * @param animal object de la classe Animal
     */
    public void addAnimal(Animal animal) {
        this.animals.add(animal);
    }

    /**
     * Affiche les animaux de la zone dans la console.
     */
    public void afficherListeAnimaux(){
        System.out.println(this.nom + " :");
        animals.forEach(a -> System.out.println(a.getNom() + " "));
    }

    /**
     * Retourne la quantité de nourriture journalière consommée
     * par les animaux en kilogrammes.
     * @return double, kgs de nourriture journaliers
     */
    public abstract double calculerKgsNourritureParJour();


    /**
     * Getter
     * @return nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * Setter
     * @param nom nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Getter
     * @return animals
     */
    public List<Animal> getAnimals() {
        return animals;
    }

    /**
     * Setter
     * @param animals animals
     */
    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }
}
