package exercice.poo.model;

public class Car {
    // Attributs publics de la classe Car
    public String brand;
    public String color;
    public int speed;

    // Constructeur : initialise un objet Car avec marque, couleur et vitesse
    public Car(String brand, String color, int speed) {
        this.brand = brand;
        this.color = color;
        this.speed = speed;
    }

    // Getter et Setter pour brand
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Getter et Setter pour color
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    // Getter et Setter pour speed
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
}