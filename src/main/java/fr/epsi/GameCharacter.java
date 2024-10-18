package fr.epsi;

public class GameCharacter {
    private String name;
    private String classType;
    private int level;

    // Constructeur
    public GameCharacter(String name, String classType) {
        this.name = name;
        this.classType = classType;
        this.level = 1; // Niveau de départ
    }

    // Méthode pour augmenter le niveau
    public void levelUp() {
        this.level++;
    }

    // Méthode pour afficher les informations du personnage
    @Override
    public String toString() {
        return "Nom: " + this.name + ", Classe: " + this.classType + ", Niveau: " + this.level;
    }

    // Getters pour les tests
    public int getLevel() {
        return this.level;
    }
}
