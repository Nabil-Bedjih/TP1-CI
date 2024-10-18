package fr.epsi;

public class GameCharacter {
    private String name;
    private String classType;
    private int level;
    private int health;

    public GameCharacter(String name, String classType) {
        this.name = name;
        this.classType = classType;
        this.level = 1;
        this.health = 100;
    }

    public void completeQuest(Quest quest) {
        if (quest.getDifficulty() <= this.level) {
            this.level += quest.getReward();
            System.out.println(this.name + " a complété la quête : " + quest.getQuestName());
        } else {
            this.health -= 10;
            System.out.println(this.name + " a échoué la quête : " + quest.getQuestName());
        }
    }

    public void levelUp() {
        this.level++;
    }

    public String getName() {
        return name;
    }

    public String getClassType() {
        return classType;
    }

    public int getLevel() {
        return level;
    }

    public int getHealth() {
        return health;
    }

    @Override
    public String toString() {
        return "Personnage: " + name + ", Classe: " + classType + ", Niveau: " + level + ", Santé: " + health;
    }
}
