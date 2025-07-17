package exercice.poo.multilevel;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Dog extends Animal {
    private String breed;
    private boolean isTrained;

    public Dog(String name, double height, double weight, String diet, String habitat,
               int gestationDuration, int numberOfLegs, double bodyTemperature, boolean hasFur,
               int age, String species, boolean isWild,
               String breed, boolean isTrained) {

        super(name, height, weight, diet, habitat, gestationDuration, numberOfLegs, bodyTemperature, hasFur,
                age, species, isWild);
        this.breed = breed;
        this.isTrained = isTrained;
    }

    public void bark() {
        System.out.println(getName() + " aboie !");
    }

    public String getSentenceDog() {
        return String.format(
                " Je suis de race %s, et il est %s que je sois dressé.",
                breed,
                isTrained ? "vrai" : "faux"
        );
    }

}
