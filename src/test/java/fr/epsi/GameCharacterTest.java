package fr.epsi;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameCharacterTest {
    @Test
    public void testCharacterCreation() {
        GameCharacter mage = new GameCharacter("Gandalf", "Mage");
        assertEquals(1, mage.getLevel());
    }

    @Test
    public void testLevelUp() {
        GameCharacter mage = new GameCharacter("Gandalf", "Mage");
        mage.levelUp();
        assertEquals(2, mage.getLevel());
    }
}
