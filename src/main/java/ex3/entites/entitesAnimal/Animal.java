package ex3.entites.entitesAnimal;

public class Animal {
    private String nom;
    private Type type;
    private Comportement comportement;

    /**
     * Constructeur
     * @param nom chaîne de caractères correspondant au nom de l'animal
     * @param comportement chaîne de caractères correspondant au comportement
     *                     de l'animal
     * @param type chaîne de caractères correspondant au type de l'animal
     */
    public Animal(String nom, Comportement comportement, Type type) {
        this.nom = nom;
        this.comportement = comportement;
        this.type = type;
    }

    /**
     * Getter
     * @return comportement
     */
    public Comportement getComportement() {
        return comportement;
    }

    /**
     * Setter
     * @param comportement chaîne de caractères visant à remplacer le comportement
     */
    public void setComportement(Comportement comportement) {
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
    public Type getType() {
        return type;
    }

    /**
     * Setter
     * @param type chaîne de caractères visant à remplacer le type de l'animal
     */
    public void setType(Type type) {
        this.type = type;
    }
}