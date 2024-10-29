package ex3.entites.entitesAnimal;

public class Type {
    private String nom;

    /**
     * Constructeur
     * @param type chaîne de caractères représentant le type d'animal
     */
    public Type(String type) {
        this.nom = type;
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
     * @param nom nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }
}
