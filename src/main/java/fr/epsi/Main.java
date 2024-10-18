package fr.epsi;

public class Main {
    public static void main(String[] args) {
        GameCharacter mage = new GameCharacter("Gandalf", "Mage");
        GameCharacter archer = new GameCharacter("Legolas", "Archer");

        Quest easyQuest = new Quest("Sauver le village", 1, 2);
        Quest hardQuest = new Quest("Tuer le dragon", 5, 5);

        System.out.println(mage);
        System.out.println(archer);

        mage.completeQuest(easyQuest);
        archer.completeQuest(hardQuest);

        System.out.println("Après les quêtes : ");
        System.out.println(mage);
        System.out.println(archer);
    }
}
