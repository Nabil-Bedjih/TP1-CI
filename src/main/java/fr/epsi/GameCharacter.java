package fr.epsi;

public class GameCharacter {
    private String name;
    private String classType;
    private int level;
    private int health;
    private int experience;
    private Quest currentQuest;  // Ajout de l'attribut pour la quête

    public GameCharacter(String name, String classType) {
        this.name = name;
        this.classType = classType;
        this.level = 1;
        this.health = 100;
        this.experience = 0;
        this.currentQuest = null; // Initialement, pas de quête
    }

    public void completeQuest(Quest quest) {
        this.currentQuest = quest;  // Enregistre la quête actuelle
        System.out.println(this.name + " a complété la quête : " + quest.getQuestName());
        gainExperience(quest.getReward());
        if (quest.getDifficulty() > this.level) {
            this.health -= 10;  // Si la quête est plus difficile que le niveau du personnage, il perd des points de vie
            System.out.println(this.name + " a perdu des points de vie en raison de la difficulté de la quête.");
        }
    }

    private void gainExperience(int reward) {
        this.experience += reward;
        if (this.experience >= 10) {
            levelUp();
            this.experience = 0; // Remettre l'expérience à zéro après une montée de niveau
        }
    }

    private void levelUp() {
        this.level += 1;
        System.out.println(this.name + " monte au niveau " + this.level + " !");
    }

    // Getter et setter pour la quête actuelle
    public Quest getQuest() {
        return currentQuest;
    }

    public void setQuest(Quest quest) {
        this.currentQuest = quest;  // Associe une nouvelle quête au personnage
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
        return "GameCharacter{" +
                "name='" + name + '\'' +
                ", classType='" + classType + '\'' +
                ", level=" + level +
                ", health=" + health +
                ", experience=" + experience +
                ", currentQuest=" + (currentQuest != null ? currentQuest.getQuestName() : "Aucune") +
                '}';
    }
}
