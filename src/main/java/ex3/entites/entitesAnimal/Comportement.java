package ex3.entites.entitesAnimal;

public class Comportement {
    /** chaîne de caractères représentant le comportement */
    private String description;

    /**
     * Constructeur
     * @param comportement chaîne de caractères caractérisant
     *                     le comportement de l'animal
     */
    public Comportement(String comportement) {
        this.description = comportement;
    }

    /**
     * Getter
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Setter
     * @param description description
     */
    public void setDescription(String description) {
        this.description = description;
    }
}
