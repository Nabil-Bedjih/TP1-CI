package fr.epsi;

import static fr.epsi.GameCharacterController.characters;

@org.springframework.stereotype.Service
public class Service {
    public void additem(){
        characters.add(new GameCharacter("Gandalfs", "Mage"));
        characters.add(new GameCharacter("Legolas", "Archer"));
        characters.add(new GameCharacter("Aragorn", "Guerrier"));
        characters.add(new GameCharacter("Frodon", "Hobbit"));
    }
}
