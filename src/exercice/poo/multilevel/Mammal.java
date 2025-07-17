package exercice.poo.multilevel;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;

@Getter
@Setter
@AllArgsConstructor
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
}
