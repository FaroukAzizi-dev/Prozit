import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class ZooManagement {

    int nbrCages=20;
    String zooName="zoo";

    public static void main(String[] args) {

        ZooManagement zoo = new ZooManagement();
        Scanner myObj = new Scanner(System.in);

        Zoo myzoo = new Zoo("Green Marine", "New York");

        Animal lion = new Animal("Cats","tiger",24,true);
        Animal lion2 = new Animal("Cats",  "scottish",24,true);
        Animal lion3 = new Animal("Cats",  "siamois",24,true);
        Animal lion4 = new Animal("Cats",  "Abyssin",24,true);
        Animal lion5 = new Animal("fish",  "Abyssin",24,true);


        System.out.println("my "+zoo.zooName+"comporte"+zoo.nbrCages+"cages");

        System.out.println("Entre le nombre de Cages et le Nom de Zoo");

        int nbr = myObj.nextInt();
        myObj.nextLine();  // Consomme la nouvelle ligne restante après nextInt()

        String nom = myObj.nextLine();


        System.out.println("Ancien Nombre de Cage : " + zoo.nbrCages);
        System.out.println("Ancien Nom de zoo : " + zoo.zooName);

        zoo.zooName = nom;
        zoo.nbrCages = nbr;


        System.out.println("Nouveau Nom de zoo : " + nom);
        System.out.println("Nouveau Nombre de Cage : " + nbr);

        myzoo.addAnimal(lion);
        myzoo.addAnimal(lion2);
        myzoo.addAnimal(lion3);
        myzoo.addAnimal(lion4);
        myzoo.addAnimal(lion5);

        myzoo.printAnimals();

        myzoo.removeAnimal(lion3);
        myzoo.printAnimals();




        /*System.out.println(lion); //affichage
        System.out.print(lion.toString()); *///affichage

       /* myZoo.addAnimal(lion);
        myZoo.addAnimal(lion2);
        myZoo.printAnimals();
        myZoo.addAnimal(lion3);
        myZoo.addAnimal(lion4);*/





    }
}
