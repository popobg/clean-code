package ex5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Caisse {

	/** Nom de la caisse */
	private String nom;

	/** Poids minimum autorisé en kgs pour un item de la caisse */
	private int poidsItemMin;

	/** Poids maximum autorisé en kgs pour un item de la caisse */
	private int poidsItemMax;

	/** Liste des objets Item contenus dans la caisse */
	private List<Item> items;

	public Caisse(String nom, int poidsItemMin, int poidsItemMax) {
		this.nom = nom;
		this.poidsItemMin = poidsItemMin;
		this.poidsItemMax = poidsItemMax;
		this.items = new ArrayList<>();
	}

	public boolean isItemAccepte(Item item) {
		return item.getPoids() >= poidsItemMin
				&& item.getPoids() < poidsItemMax;
	}

	/**
	 * Ajouter un ou plusieurs objets Item dans la caisse.
	 * @param items
	 */
	public void ajouterItems(Item... items) {
		this.items.addAll(Arrays.asList(items));
	}

	/** Getter pour l'attribut items
	 * @return the items
	 */
	public List<Item> getItems() {
		return items;
	}

	/**
	 * Getter
	 *
	 * @return nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter
	 *
	 * @param nom nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Getter
	 *
	 * @return poidsItemMin
	 */
	public int getPoidsItemMin() {
		return poidsItemMin;
	}

	/**
	 * Setter
	 *
	 * @param poidsItemMin poidsItemMin
	 */
	public void setPoidsItemMin(int poidsItemMin) {
		this.poidsItemMin = poidsItemMin;
	}

	/**
	 * Getter
	 *
	 * @return poidsItemMax
	 */
	public int getPoidsItemMax() {
		return poidsItemMax;
	}

	/**
	 * Setter
	 *
	 * @param poidsItemMax poidsItemMax
	 */
	public void setPoidsItemMax(int poidsItemMax) {
		this.poidsItemMax = poidsItemMax;
	}

	/**
	 * Setter
	 *
	 * @param items items
	 */
	public void setItems(List<Item> items) {
		this.items = items;
	}
}
