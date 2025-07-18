// Déclaration du package
package exercice.poo.multilevel;

// Importation des annotations Lombok
import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

// Déclaration de la classe Dog qui hérite de Animal
// Lombok génère automatiquement les getters, setters et les constructeurs
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Dog extends Animal {

    // Attributs spécifiques à la classe Dog
    private String breed;
    private boolean isTrained;

    // Constructeur personnalisé appelant le constructeur de la classe parente (Animal)
    public Dog(String name, double height, double weight, String diet, String habitat,
               int gestationDuration, int numberOfLegs, double bodyTemperature, boolean hasFur,
               int age, String species, boolean isWild,
               String breed, boolean isTrained) {

        // Appel au constructeur de la classe parente Animal
        super(name, height, weight, diet, habitat, gestationDuration, numberOfLegs, bodyTemperature, hasFur,
                age, species, isWild);

        // Initialisation des attributs propres à Dog
        this.breed = breed;
        this.isTrained = isTrained;
    }

    // Méthode retournant une phrase descriptive propre au chien
    public String getSentenceDog() {
        return String.format(
                " Je suis de race %s, et il est %s que je sois dressé.",
                breed,
                isTrained ? "vrai" : "faux"
        );
    }
}
