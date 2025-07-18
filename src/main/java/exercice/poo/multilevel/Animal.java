// Déclaration du package
package exercice.poo.multilevel;

// Importation des annotations Lombok
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

// Déclaration de la classe Animal qui hérite de Mammal
// Lombok génère automatiquement les getters, setters et les constructeurs
@Getter
@Setter
@SuperBuilder
public class Animal extends Mammal {

    // Attributs représentant les propriétés d'un animal
    private int age;
    private String species;
    private boolean isWild;
}
