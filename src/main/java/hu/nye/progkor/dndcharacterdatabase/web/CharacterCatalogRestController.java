package hu.nye.progkor.dndcharacterdatabase.web;

import hu.nye.progkor.dndcharacterdatabase.data.model.Character;
import hu.nye.progkor.dndcharacterdatabase.service.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/character")
public class CharacterCatalogRestController {

    private final CharacterService characterService;

    @Autowired
    public CharacterCatalogRestController(CharacterService characterService) {
        this.characterService = characterService;
    }

    //CRUD

    @GetMapping("/{id}")
    public Character getCharacterByID (@PathVariable Long id){
        return characterService.retrieveCharacterByID(id);
    }

    @GetMapping
    public List<Character> getAllCharacters(){
        return characterService.retrieveAllCharacters();
    }

    @PostMapping
    public Character createCharacter(@RequestBody Character character){
        return characterService.createCharacter(character);
    }

    @PutMapping
    public Character updateCharacter(@RequestBody Character character){
        return characterService.updateCharacter(character);
    }

    @DeleteMapping("/{id}")
    public void deleteCharacterByID(@PathVariable Long id){
        characterService.deleteCharacterByID(id);
    }
}
