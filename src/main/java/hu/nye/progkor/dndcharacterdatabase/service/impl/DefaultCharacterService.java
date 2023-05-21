package hu.nye.progkor.dndcharacterdatabase.service.impl;

import hu.nye.progkor.dndcharacterdatabase.data.model.Character;
import hu.nye.progkor.dndcharacterdatabase.data.repository.Repository;
import hu.nye.progkor.dndcharacterdatabase.service.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultCharacterService implements CharacterService {

    private final Repository<Character, Long> characterRepository;

    @Autowired
    public DefaultCharacterService(Repository<Character, Long> characterRepository) {
        this.characterRepository = characterRepository;
    }

    @Override
    public Character createCharacter(Character character) {
        return characterRepository.save(character);
    }

    @Override
    public Character retrieveCharacterByID(Long id) {
        return characterRepository.getByID(id);
    }

    @Override
    public List<Character> retrieveAllCharacters() {
        return characterRepository.getAll();
    }

    @Override
    public Character updateCharacter(Character character) {
        return characterRepository.update(character);
    }

    @Override
    public void deleteCharacterByID(Long id) {
        characterRepository.deleteByID(id);
    }
}
