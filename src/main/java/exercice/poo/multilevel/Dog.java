// Déclaration du package
package exercice.poo.multilevel;

// Importation des annotations Lombok
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

// Déclaration de la classe Dog qui hérite de Animal
// Lombok génère automatiquement les getters, setters et les constructeurs
@Getter
@Setter
@SuperBuilder
public class Dog extends Animal {

    // Attributs représentant les propriétés d'un chien
    private String breed;
    private boolean isTrained;

    // Méthode retournant une phrase descriptive d'un chien
    @Override
    public String getSentence() {
        return super.getSentence() + "\n" + String.format(
                " Je suis de race %s, et il est %s que je sois dressé.",
                breed,
                isTrained ? "vrai" : "faux"
        );
    }
}
