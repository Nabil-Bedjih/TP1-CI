package fr.epsi;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/characters")
public class GameCharacterController {
    static List<GameCharacter> characters = new ArrayList<>();
    @Autowired
    Service service;

    @PostConstruct
    public void initCharacters() {

        service.additem();
    }

    @PostMapping
    public GameCharacter createCharacter(@RequestBody GameCharacter character) {
        characters.add(character);
        return character;
    }

    @GetMapping
    public List<GameCharacter> getAllCharacters() {
        return characters;
    }

    @PostMapping("/{name}/quest")
    public GameCharacter addQuestToCharacter(@PathVariable String name, @RequestBody Quest quest) {
        for (GameCharacter character : characters) {
            if (character.getName().equals(name)) {
                character.setQuest(quest);
                return character;
            }
        }
        return null;
    }
}
