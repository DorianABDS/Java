package exercice.poo.model;

public class Phone {
    public String brand;
    public String os;
    public String color;

    public Phone(String brand, String os, String color) {
        this.brand = brand;
        this.os = os;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
