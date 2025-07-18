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
}
