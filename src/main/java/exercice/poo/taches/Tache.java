package exercice.poo.taches;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public class Tache {
    private String nom;
    private Priority priority;
}
