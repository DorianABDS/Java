package exercice.poo;

import exercice.poo.model.Car;
import exercice.poo.model.Phone;

public class Main {
    // Point d'entrée du programme
    public static void main(String[] args) {
        // Création d'une instance de Car
        Car myCar = new Car("BMW", "Red", 500);
        Car myCar1 = new Car("Audi", "Jaune", 1000);
        Phone myPhone = new Phone("Pixel", "Android", "Blanc");

        // Affichage des informations de la voiture
        System.out.println("Information de la voiture:");
        System.out.println("Marque: " + myCar.getBrand());
        System.out.println("Couleur: " + myCar.getColor());
        System.out.println("Vitesse: " + myCar.getSpeed() + "km/h");// Affichage des informations de la voiture
        System.out.println("-------------------------------------");
        System.out.println("Information de la voiture:");
        System.out.println("Marque: " + myCar1.getBrand());
        System.out.println("Couleur: " + myCar1.getColor());
        System.out.println("Vitesse: " + myCar1.getSpeed() + "km/h");
        System.out.println("-------------------------------------");
        // Affichage des informations du téléphone
        System.out.println("Information du téléphone:");
        System.out.println("Marque: " + myPhone.getBrand());
        System.out.println("Système d'exploitation: " + myPhone.getOs());
        System.out.println("Couleur: " + myPhone.getColor());
    }
}
