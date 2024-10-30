package ex3Bis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zoo {

    /** Chaîne de caractères représentant le nom du zoo */
    private String nom;
    /** Liste d'objet Animal */
    private List<Animal> animals;

    /**
     * Constructeur
     * @param nom chaîne de caractères représentant le nom du zoo
     */
    public Zoo(String nom) {
        this.nom = nom;
        this.animals = new ArrayList<>();
    }

    /**
     * Ajoute le ou les animaux à la liste des animaux du zoo.
     * @param animals tableau d'objet Animal (paramètres multiples)
     */
    public void addAnimals(Animal... animals) {
        this.animals.addAll(Arrays.asList(animals));
    }

    /**
     * Affiche la liste de tous les animaux du zoo.
     */
    public void afficherListeAnimaux() {
        animals.forEach(System.out::println);
    }

    /**
     * Retourne le nombre d'animaux dans le zoo.
     * @return int, nombre d'animaux
     */
    public int taille() {
        return animals.size();
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
