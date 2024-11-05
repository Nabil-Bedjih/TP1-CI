package fr.epsi;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class GameCharacterIntegrationTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void testCreateCharacter() {
        GameCharacter character = new GameCharacter("Aragorn", "Guerrier");
        ResponseEntity<GameCharacter> response = restTemplate.postForEntity("/characters", character, GameCharacter.class);

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals("Aragorn", response.getBody().getName());
    }

    @Test
    public void testAddQuestToCharacter() {
        Quest quest = new Quest("Sauver le village", 1, 100);
        restTemplate.postForEntity("/characters", new GameCharacter("Aragorn", "Guerrier"), GameCharacter.class);
        ResponseEntity<GameCharacter> response = restTemplate.postForEntity("/characters/Aragorn/quest", quest, GameCharacter.class);

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertNotNull(response.getBody().getQuest());
        assertEquals("Sauver le village", response.getBody().getQuest().getQuestName());
    }
}
