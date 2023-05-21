package hu.nye.progkor.dndcharacterdatabase.service;

import hu.nye.progkor.dndcharacterdatabase.data.model.Character;

import java.util.List;

/**
 *
 */
public interface CharacterService {
    /**
     *
     * @param character
     * @return
     */
    Character createCharacter(Character character);

    Character retrieveCharacterByID(Long id);

    List<Character> retrieveAllCharacters();

    Character updateCharacter(Character character);

    void deleteCharacterByID(Long id);
}
