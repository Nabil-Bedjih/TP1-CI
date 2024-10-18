package fr.epsi;

public class Quest {
    private String questName;
    private int difficulty;
    private int reward;

    public Quest(String questName, int difficulty, int reward) {
        this.questName = questName;
        this.difficulty = difficulty;
        this.reward = reward;
    }

    public String getQuestName() {
        return questName;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public int getReward() {
        return reward;
    }
}
