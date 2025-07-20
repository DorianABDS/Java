package exercice.poo;

import exercice.poo.model.*;
import exercice.poo.multilevel.*;

public class Main {
    // Point d'entrée du programme
    public static void main(String[] args) {

        // Instance de Car
        Car myCar = new Car("BMW", "Red", 500);
        // Affichage des informations de la voiture
        System.out.println("Information de la voiture:\n" +
                "Marque: " + myCar.getBrand() + "\n" +
                "Couleur: " + myCar.getColor() + "\n" +
                "Vitesse: " + myCar.getSpeed() + "km/h" + "\n" +
                "-------------------------------------");

        // Deuxième instance de Car
        Car myCar1 = new Car("Audi", "Jaune", 1000);
        // Affichage des informations de la voiture
        System.out.println("Information de la voiture:\n" +
                "Marque: " + myCar1.getBrand() + "\n" +
                "Couleur: " + myCar1.getColor() + "\n" +
                "Vitesse: " + myCar1.getSpeed() + "km/h" + "\n" +
                "-------------------------------------");

        // Instance de Phone
        Phone myPhone = new Phone("Pixel", "Android", "Blanc");
        // Affichage des informations du téléphone
        System.out.println("Information du téléphone:\n" +
                "Marque: " + myPhone.getBrand() + "\n" +
                "Système d'exploitation: " + myPhone.getOs() + "\n" +
                "Couleur: " + myPhone.getColor() + "\n" +
                "-------------------------------------");

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
                .isWild(false)
                // Dog
                .breed("Labrador")
                .isTrained(true)
                .build();

        // Instance de SentenceFormatter
        SentenceFormatter formatter = new SentenceFormatter();
        // Affichage des informations de l'héritage multilevel des class Mammal, Animal et dog
        System.out.println(formatter.sentence(dog) + "\n" +
                "-------------------------------------");
    }
}
