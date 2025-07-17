package exercice.poo.multilevel;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Mammal {
    private String name;
    private double height;
    private double weight;
    private String diet;
    private String habitat;
    private int gestationDuration;
    private int numberOfLegs;
    private double bodyTemperature;
    private boolean hasFur;

    public String getSentenceIntro() {
        return String.format(
                "Je m'appelle %s, je mesure %.2f mètres, pèse %.2f kg, et je me nourris principalement de %s. " +
                        "Je vis dans %s, j'ai une gestation de %d jours, %d pattes, une température corporelle de %.1f°C, " +
                        "et il est %s que j'ai de la fourrure.",
                name, height, weight, diet, habitat, gestationDuration, numberOfLegs, bodyTemperature,
                hasFur ? "vrai" : "faux"
        );
    }

}
