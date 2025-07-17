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

        Mammal myMammal = new Mammal(
                "Moumout",
                120.0,
                80.5,
                "Herbivore",
                "Forêt",
                180,
                4,
                38.5,
                true
        );

        System.out.println("Nom: " + myMammal.getName());
        System.out.println("Taille: " + myMammal.getHeight());
        System.out.println("Poids: " + myMammal.getWeight());
        System.out.println("Régime: " + myMammal.getDiet());
        System.out.println("Habitat: " + myMammal.getHabitat());
        System.out.println("Gestation: " + myMammal.getGestationDuration() + " jours");
        System.out.println("Nombre de pattes: " + myMammal.getNumberOfLegs());
        System.out.println("Température corporelle: " + myMammal.getBodyTemperature() + "°C");
        System.out.println("A des poils ? " + (myMammal.isHasFur() ? "Oui" : "Non"));
    }
}
