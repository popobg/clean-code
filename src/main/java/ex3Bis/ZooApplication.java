package ex3Bis;

public class ZooApplication {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Gazelle", "MAMMIFERE", "HERBIVORE");
        Animal animal2 = new Animal("Zèbre", "MAMIFERE", "HERBIVORE");
        Animal animal3 = new Animal("Lion", "MAMMIFERE", "HERBIVORE");
        Animal animal4 = new Animal("Panthère", "MAMMIFERE", "CARNIVORE");
        Animal animal5 = new Animal("Requin blanc", "POISSON", "HERBIVORE");
        Animal animal6 = new Animal("Truite dorée", "POISSON", "HERBIVORE");
        Animal animal7 = new Animal("Boa constrictor", "SERPENT", "CARNIVORE");
        Animal animal8 = new Animal("Python", "SERPENT", "CARNIVORE");

        Zoo zoo = new Zoo("Thoiry");

        zoo.addAnimals(animal1, animal2, animal3, animal4, animal5, animal6, animal7, animal8);
    }
}
