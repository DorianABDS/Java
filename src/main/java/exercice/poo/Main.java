package exercice.poo;

import exercice.poo.database.*;
import exercice.poo.model.*;
import exercice.poo.multilevel.*;
import exercice.poo.taches.*;

public class Main {
    // Point d'entrée du programme
    public static void main(String[] args) {

        // Instance de Car
        Car myCar = new Car("BMW", "Red", 500);
        // Appel de la methode de Car
        myCar.carInfo();

        // Deuxième instance de Car
        Car myCar1 = new Car("Audi", "Jaune", 1000);
        // Appel de la methode de Car
        myCar1.carInfo();

        // Instance de Phone
        Phone myPhone = new Phone("Pixel", "Android", "Blanc");
        // Appel de la methode de Car
        myPhone.phoneInfo();

        // Affichage des informations en multilevel des class Mammal, Animal et Dog
        Dog dog = Dog.builder()
                // Mammal
                .name("WoufooUUU")
                .height(0.6)
                .weight(10.0)
                .diet("omnivore")
                .habitat("maison")
                .gestationDuration(60)
                .numberOfLegs(4)
                .bodyTemperature(38.5)
                .hasFur(true)
                // Animal
                .age(5)
                .species("chien")
                .isWild(true)
                // Dog
                .breed("Labrador")
                .isTrained(true)
                .build();

        // Instance de SentenceFormatter
        SentenceFormatter formatter = new SentenceFormatter();

        // Affichage des informations de l'héritage multilevel des class Mammal, Animal et dog
        System.out.println(formatter.sentence(dog) + "\n" +
                "-------------------------------------");

        // Création d'une tâche (BASSE, MOYENNE, HAUTE)
        Tache tache = new Tache("Faire les courses", Priority.HAUTE);

        // Affiche les infos de la tâche
        System.out.println(tache);

        // Affiche la description de la priorité et si elle est urgente
        System.out.println("Description : " + tache.getPriority().getDescription() + "\n" +
                "Urgent : " + tache.getPriority().isUrgent() + "\n" +
                "-------------------------------------");

        PriorityDisplayer.display("Direct - HAUTE", Priority.HAUTE);
        PriorityDisplayer.display("Direct - MOYENNE", Priority.MOYENNE);
        PriorityDisplayer.display("Direct - BASSE", Priority.BASSE);

        try {
            Priority priority = Priority.fromLevel(4);
            PriorityDisplayer.display("Trié par niveau de priorité", priority);
        } catch (IllegalArgumentException e) {
            System.out.println("Erreur : " + e.getMessage());
        }

        MySQLDatabase db = MySQLDatabase.builder()
                .url("DB_URL")
                .user("DB_USER")
                .password("DB_PASSWORD")
                .build();

        db.connect();
        db.printDatabaseInfo();
        db.disconnect();
    }
}
