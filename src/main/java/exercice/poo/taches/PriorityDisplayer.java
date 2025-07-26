package exercice.poo.taches;

public class PriorityDisplayer {
    public static void display(String titre, Priority priority) {
        System.out.println("--> " + titre + "\n" +
                "Niveau      : " + priority.getLevel() + "\n" +
                "Description : " + priority.getDescription() + "\n" +
                "Critique    : " + priority.isCritical() + "\n" +
                "Urgent      : " + priority.isUrgent() + "\n" +
                "-----------------------------------");
    }
}
