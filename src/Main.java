import java.util.ArrayList;
import java.util.List;


public class Main {



    public static void main(String[] args){
        List<Chien> listchiens = new ArrayList<>();
        List<Animal> listAnimals = new ArrayList<>();
        List<Object> listObjets = new ArrayList<>();

        listchiens.add(new Chien("Chien 1"));
        listchiens.add(new Chien("Chien 2"));

        listAnimals.add(new Animal("Animal 1"));
        listAnimals.add(new Animal("Animal 2"));

        listObjets.add(new Object());
        listObjets.add(new Object());




        System.out.println("\n\n++++++++++++Chien++++++++++++");

        System.out.println("======afficherAnimaux======");
        AnimalerieUtil.afficherAnimaux(listchiens);
        System.out.println("==================\n");

        System.out.println("\n======ajouterChien======");
        AnimalerieUtil.ajouterChien(listchiens);
        System.out.println("==================\n");

        System.out.println("\n======afficherTous======");
        AnimalerieUtil.afficherTous(listchiens);
        System.out.println("==================");

        System.out.println("++++++++++++Fin de chien++++++++++++");

        //

        System.out.println("\n\n++++++++++++Animal++++++++++++");

        System.out.println("======afficherAnimaux======");
        AnimalerieUtil.afficherAnimaux(listAnimals);
        System.out.println("==================\n");

        System.out.println("\n======ajouterChien======");
        AnimalerieUtil.ajouterChien(listAnimals);
        System.out.println("==================\n");

        System.out.println("\n======afficherTous======");
        AnimalerieUtil.afficherTous(listAnimals);
        System.out.println("==================");

        System.out.println("++++++++++++Fin de Animal++++++++++++");

        //

        System.out.println("\n\n++++++++++++Object++++++++++++");

        System.out.println("======afficherAnimaux======");
        // AnimalerieUtil.afficherAnimaux(listObjets);
        System.out.println("==================\n");

        System.out.println("\n======ajouterChien======");
        AnimalerieUtil.ajouterChien(listObjets);
        System.out.println("==================\n");

        System.out.println("\n======afficherTous======");
        AnimalerieUtil.afficherTous(listObjets);
        System.out.println("==================");

        System.out.println("++++++++++++Fin de Animal++++++++++++");


        AnimalerieUtil.fermerScanner();
    }
}
