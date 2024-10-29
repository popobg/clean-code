package ex3Bis;

import ex3.entites.entitesAnimal.Comportement;
import ex3.entites.entitesAnimal.Type;

public class Animal {
    private String nom;
    private String type;
    private String comportement;

    /**
     * Constructeur
     * @param nom chaîne de caractères correspondant au nom de l'animal
     * @param comportement chaîne de caractères correspondant au comportement
     *                     de l'animal
     * @param type chaîne de caractères correspondant au type de l'animal
     */
    public Animal(String nom, String type, String comportement) {
        this.nom = nom;
        this.comportement = comportement;
        this.type = type;
    }

    /**
     * Getter
     * @return comportement
     */
    public String getComportement() {
        return comportement;
    }

    /**
     * Setter
     * @param comportement chaîne de caractères visant à remplacer le comportement
     */
    public void setComportement(String comportement) {
        this.comportement = comportement;
    }

    /**
     * Getter
     * @return nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * Setter
     * @param nom chaîne de caractères visant à remplacer le nom de l'animal
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Getter
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * Setter
     * @param type chaîne de caractères visant à remplacer le type de l'animal
     */
    public void setType(String type) {
        this.type = type;
    }
}
