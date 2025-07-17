package exercice.poo.multilevel;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Animal extends Mammal {
    private int age;
    private String species;
    private boolean isWild;

    public Animal(String name, double height, double weight, String diet, String habitat,
                  int gestationDuration, int numberOfLegs, double bodyTemperature, boolean hasFur,
                  int age, String species, boolean isWild) {
        super(name, height, weight, diet, habitat, gestationDuration, numberOfLegs, bodyTemperature, hasFur);
        this.age = age;
        this.species = species;
        this.isWild = isWild;
    }

    public String getSentenceAnimal() {
        return String.format(
                " J'ai %d ans, je suis une espèce de %s, et il est %s que je sois sauvage.",
                age,
                species,
                isWild ? "vrai" : "faux"
        );
    }

}
