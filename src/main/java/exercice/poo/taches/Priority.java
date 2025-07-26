package exercice.poo.taches;

import lombok.Getter;

@Getter
public enum Priority {
    BASSE("Peu urgente", 1),
    MOYENNE("Importante", 2),
    HAUTE("Critique", 3);

    private final String description;
    private final int level;

    Priority(String description, int level) {
        this.description = description;
        this.level = level;
    }

    public static Priority fromLevel(int level) {
        for (Priority priority : values()) {
            if (priority.level == level)
                return priority;
        }
        throw new IllegalArgumentException("Niveau inconnu : " + level);
    }

    public boolean isUrgent() {
        return this.level >= 2;
    }


    public boolean isCritical() {
        return this == HAUTE;
    }
}
