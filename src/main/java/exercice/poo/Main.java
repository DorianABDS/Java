package exercice.poo;

import exercice.poo.model.*;
import exercice.poo.multilevel.*;

public class Main {
    // Point d'entrée du programme
    public static void main(String[] args) {

        Car myCar = new Car("BMW", "Red", 500);
        // Affichage des informations de la voiture
        System.out.println("Information de la voiture:");
        System.out.println("Marque: " + myCar.getBrand());
        System.out.println("Couleur: " + myCar.getColor());
        System.out.println("Vitesse: " + myCar.getSpeed() + "km/h");
        System.out.println("-------------------------------------");

        Car myCar1 = new Car("Audi", "Jaune", 1000);
        // Affichage des informations de la voiture
        System.out.println("Information de la voiture:");
        System.out.println("Marque: " + myCar1.getBrand());
        System.out.println("Couleur: " + myCar1.getColor());
        System.out.println("Vitesse: " + myCar1.getSpeed() + "km/h");
        System.out.println("-------------------------------------");

        Phone myPhone = new Phone("Pixel", "Android", "Blanc");
        // Affichage des informations du téléphone
        System.out.println("Information du téléphone:");
        System.out.println("Marque: " + myPhone.getBrand());
        System.out.println("Système d'exploitation: " + myPhone.getOs());
        System.out.println("Couleur: " + myPhone.getColor());
        System.out.println("-------------------------------------");

        // Affichage des informations en multilevel des class Mammal, Animal et Dog
        Dog dog = new Dog("WoufooUUU", 0.6, 10.0, "omnivore", "maison", 60, 4, 38.5, true, 5, "chien", false, "Labrador", true);
        String history = dog.getSentenceIntro() + "\n" + dog.getSentenceAnimal() + "\n" + dog.getSentenceDog();
        System.out.println(history);
        System.out.println("-------------------------------------");
    }
}
