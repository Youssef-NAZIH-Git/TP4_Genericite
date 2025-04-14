import java.util.List;
import java.util.Scanner;

public class AnimalerieUtil {
    static Scanner sc = new Scanner(System.in);
    public static void afficherAnimaux(List<? extends Animal> liste){
        for (Animal a: liste){
            a.parler();
        }
    }


    public static void ajouterChien(List<? super Chien> liste){
        System.out.println("Entrez le nom de chien");
        String nom = sc.nextLine();
        liste.add(new Chien(nom));
    }


    public static void afficherTous(List<?> liste){
        for (Object o: liste){
            System.out.println(o.toString());
        }
    }

    public static void fermerScanner(){
        sc.close();
    }
}
