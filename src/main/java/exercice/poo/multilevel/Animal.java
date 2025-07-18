// Déclaration du package
package exercice.poo.multilevel;

// Importation des annotations Lombok
import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

// Déclaration de la classe Animal qui hérite de Mammal
// Lombok génère automatiquement les getters, setters et les constructeurs
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Animal extends Mammal {

    // Attributs de la classe Animal
    private int age;
    private String species;
    private boolean isWild;

    // Constructeur personnalisé avec héritage du parent Mammal
    public Animal(String name, double height, double weight, String diet, String habitat,
                  int gestationDuration, int numberOfLegs, double bodyTemperature, boolean hasFur,
                  int age, String species, boolean isWild) {

        // Appel au constructeur de la classe Mammal
        super(name, height, weight, diet, habitat, gestationDuration, numberOfLegs, bodyTemperature, hasFur);

        // Initialisation des attributs propres à Animal
        this.age = age;
        this.species = species;
        this.isWild = isWild;
    }

    // Méthode retournant une phrase descriptive propre à Animal
    public String getSentenceAnimal() {
        return String.format(
                " J'ai %d ans, je suis une espèce de %s, et il est %s que je sois sauvage.",
                age,
                species,
                isWild ? "vrai" : "faux"
        );
    }
}
