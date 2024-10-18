package fr.epsi;
public class Main {
    public static void main(String[] args) {
        GameCharacter mage = new GameCharacter("Gandalf", "Mage");
        GameCharacter archer = new GameCharacter("Legolas", "Archer");

        System.out.println(mage);
        System.out.println(archer);

        mage.levelUp();
        System.out.println("Après level up: " + mage);
    }
}
