package ex5;

import java.util.ArrayList;
import java.util.List;

public class Inventaire {

	private List<Caisse> caisses;

	public Inventaire() {
		caisses = new ArrayList<>();
		caisses.add(new Caisse("PETITE CAISSE", 5, 10));
		caisses.add(new Caisse("CAISSE MOYENNE", 10, 25));
		caisses.add(new Caisse("GROSSE CAISSE", 25, 50));
	}

	public void ajouterItem(Item item) {
		for (Caisse c : this.caisses) {
			if (c.isItemAccepte(item)) {
				c.ajouterItems(item);
			}
		}
	}

	public int taille() {
		int taille = 0;
		for (Caisse caisse : this.caisses) {
			taille += caisse.getItems().size();
		}

		return taille;
	}
}
