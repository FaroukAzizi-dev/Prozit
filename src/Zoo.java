public class Zoo {

    private final int nbrCages = 25;
    Animal[] animals;
    String name;
    String city;

    public Zoo(String name, String city) {
        this.name = name;
        this.city = city;
        this.animals = new Animal[nbrCages];  // Tableau avec un maximum de 25 animaux
    }

    public boolean addAnimal(Animal animal) {
        if (searchAnimal(animal) == -1 && countAnimals() < nbrCages) {
            for (int i = 0; i < animals.length; i++) {
                if (animals[i] == null) {
                    animals[i] = animal;
                    System.out.println("Ajout effectué");
                    return true;
                }
            }
        }
        System.out.println("Ajout non effectué (zoo plein ou animal déjà présent)");
        return false;
    }

    public void printAnimals() {
        System.out.println("Animaux dans le zoo:");
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null) {
                System.out.println(animals[i].toString());
            } else {
                System.out.println("Cage vide");
            }
        }
    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null && animals[i].name.equals(animal.name)) {
                return i;
            }
        }
        return -1;
    }

    public int countAnimals() {
        int count = 0;
        for (Animal animal : animals) {
            if (animal != null) {
                count++;
            }
        }
        return count;
    }

    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);
        if (index != -1) {
            animals[index] = null;
            System.out.println("Animal supprimé.");
            return true;
        }
        System.out.println("Animal non trouvé, suppression échouée.");
        return false;
    }

    public boolean isZooFull() {
        return countAnimals() >= nbrCages;
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2) {

        if (z1.countAnimals() > z2.countAnimals()) {
            return z1;
        } else if (z2.countAnimals() > z1.countAnimals()) {
            return z2;
        } else {
            System.out.println("Les deux zoos ont le même nombre d'animaux.");
            return z1;
        }
    }



}
