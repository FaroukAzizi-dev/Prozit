import java.util.Scanner;

public class ZooManagement {

    int nbrCages=20;
    String zooName="zoo";

    public static void main(String[] args) {

        ZooManagement zoo = new ZooManagement();
        Scanner myObj = new Scanner(System.in);

        Animal lion = new Animal("Cats","tiger",24,true);
        Zoo myZoo = new Zoo("bilveder","tunis",30);

        System.out.println("my "+zoo.zooName+"comporte"+zoo.nbrCages+"cages");

        System.out.println("Entre le nombre de Cages et le Nom de Zoo");

        int nbr = myObj.nextInt();

        String nom = myObj.nextLine();

        System.out.println("Ancien Nombre de Cage : " + zoo.nbrCages);
        System.out.println("Nouveau Nombre de Cage : " + nbr);


        System.out.println("Ancien Nom de zoo : " + zoo.zooName);
        System.out.println("Nouveau Nom de zoo : " + nom);

        System.out.println(lion); //affichage
        System.out.print(lion.toString()); //affichage

    }
}
