package fr.epsi;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GameCharacterTest {
    private GameCharacter character;
    private Quest easyQuest;
    private Quest hardQuest;

    @BeforeEach
    public void setUp() {
        character = new GameCharacter("Aragorn", "Guerrier");
        easyQuest = new Quest("Défendre le village", 1, 2);
        hardQuest = new Quest("Bataille contre le roi-sorcier", 5, 5);
    }

    @Test
    public void testCharacterCreation() {
        assertEquals("Aragorn", character.getName());
        assertEquals("Guerrier", character.getClassType());
        assertEquals(1, character.getLevel());
        assertEquals(100, character.getHealth());
    }

    @Test
    public void testCompleteEasyQuest() {
        character.completeQuest(easyQuest);
        assertEquals(3, character.getLevel());
    }

    @Test
    public void testFailHardQuest() {
        character.completeQuest(hardQuest);
        assertEquals(90, character.getHealth());
    }
}
