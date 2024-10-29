package ex3;

import ex3.entites.entitesAnimal.*;
import ex3.entites.entitesZoo.Zoo;

public class ZooApplication {

	public static void main(String[] args) {
		Type mammifere = new Type("MAMMIFERE");
		Type poisson = new Type("POISSON");
		Type serpent = new Type("SERPENT");

		// On ne crée pas de comportement omnivore mais ce serait très adapté
		Comportement herbivore = new Comportement("HERBIVORE");
		Comportement carnivore = new Comportement("CARNIVORE");

		// Correction des erreurs de comportement rapportés dans le code de base -
		// Ce serait quand même dommage que notre gazelle se fasse dévorer par un lion
		// pour une erreur de comportement rapporté...
		Animal gazelle = new Animal("Gazelle", herbivore, mammifere);
		Animal zebre = new Animal("Zèbre", herbivore, mammifere);
		Animal panthere = new Animal("Panthère", carnivore, mammifere);
		Animal lion = new Animal("Lion", carnivore, mammifere);
		Animal requinBlanc = new Animal("Requin blanc", carnivore, poisson);
		Animal truiteDoree = new Animal("Truite dorée", carnivore, poisson);
		Animal boaConstrictor = new Animal("Boa constrictor", carnivore, serpent);
		Animal python = new Animal("Python", carnivore, serpent);

		Zoo zoo = new Zoo("Thoiry");

		zoo.addAnimals(gazelle, zebre, panthere, lion, requinBlanc, truiteDoree, boaConstrictor, python);
	}

}