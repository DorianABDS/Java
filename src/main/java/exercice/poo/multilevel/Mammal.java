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

    // Méthode retournant une phrase descriptive d'un mammifère
    public String getSentence() {
        return String.format(
                "Je m'appelle %s, je mesure %.2f mètres, pèse %.2f kg, et je me nourris principalement de %s. " +
                        "Je vis dans %s, j'ai une gestation de %d jours, %d pattes, une température corporelle de %.1f°C, " +
                        "et il est %s que j'ai de la fourrure.",
                name, height, weight, diet, habitat, gestationDuration, numberOfLegs, bodyTemperature,
                hasFur ? "vrai" : "faux"
        );
    }
}
