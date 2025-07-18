package exercice.poo.multilevel;

public class SentenceFormatter {

    public String sentence(Mammal mammal) {
        return String.format(
                "Je m'appelle %s, je mesure %.2f mètres, pèse %.2f kg, " +
                        "et je me nourris principalement de %s. " +
                        "Je vis dans %s, j'ai une gestation de %d jours, " +
                        "j'ai %d pattes, une température corporelle de %.1f°C, " +
                        "et il est %s que j'ai de la fourrure.",
                mammal.getName(),
                mammal.getHeight(),
                mammal.getWeight(),
                mammal.getDiet(),
                mammal.getHabitat(),
                mammal.getGestationDuration(),
                mammal.getNumberOfLegs(),
                mammal.getBodyTemperature(),
                mammal.isHasFur() ? "vrai" : "faux"
        );
    }

    public String sentence(Animal animal) {
        String base = sentence((Mammal) animal);
        return base + String.format(
                "\nJ'ai %d ans, je suis une espèce de %s, et il est %s que je sois sauvage.",
                animal.getAge(),
                animal.getSpecies(),
                animal.isWild() ? "vrai" : "faux"
        );
    }

    public String sentence(Dog dog) {
        String base = sentence((Animal) dog);
        return base + String.format(
                "\nJe suis de race %s, et il est %s que je sois dressé.",
                dog.getBreed(),
                dog.isTrained() ? "vrai" : "faux"
        );
    }
}
