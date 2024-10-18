package fr.epsi;
public class Main {
    public static void main(String[] args) {
        Character mage = new Character("Gandalf", "Mage");
        Character archer = new Character("Legolas", "Archer");

        System.out.println(mage);
        System.out.println(archer);

        mage.levelUp();
        System.out.println("Après level up: " + mage);
    }
}
