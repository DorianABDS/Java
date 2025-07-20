package exercice.poo;

import exercice.poo.model.*;
import exercice.poo.multilevel.*;

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
                .isWild(!false)
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
