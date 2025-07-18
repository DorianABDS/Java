// Déclaration du package
package exercice.poo.multilevel;

// Importation des annotations Lombok
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

// Déclaration de la classe Mammal avec annotations Lombok
// Lombok génère automatiquement les getters, setters et les constructeurs
@Getter
@Setter
@SuperBuilder
public class Mammal {

    // Attributs représentant les propriétés d'un mammifère
    private String name;
    private double height;
    private double weight;
    private String diet;
    private String habitat;
    private int gestationDuration;
    private int numberOfLegs;
    private double bodyTemperature;
    private boolean hasFur;
}
