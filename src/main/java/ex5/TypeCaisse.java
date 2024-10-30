package ex5;

public class TypeCaisse {
    /** Nom du type de caisse */
    private String nom;

    /**
     * Constructeur
     * @param nom
     */
    public TypeCaisse(String nom) {
        this.nom = nom;
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
