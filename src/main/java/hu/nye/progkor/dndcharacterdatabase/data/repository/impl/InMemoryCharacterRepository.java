package hu.nye.progkor.dndcharacterdatabase.data.repository.impl;

import hu.nye.progkor.dndcharacterdatabase.data.repository.Repository;
import hu.nye.progkor.dndcharacterdatabase.data.model.Character;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 */
@org.springframework.stereotype.Repository
public class InMemoryCharacterRepository implements Repository<Character, Long>{
    private static final Map<Long, Character> storage = new HashMap<>();
    @Override
    public Character save(Character character) {
        Long id = storage.size() + 1L;
        character.setID(id);
        storage.put(id, character);
        return storage.get(id);
    }

    @Override
    public Character getByID(Long id) {
        return storage.get(id);
    }

    @Override
    public List<Character> getAll() {
        return storage.values().stream().toList();
    }

    @Override
    public Character update(Character item) {
        Long id = item.getID();
        storage.put(id, item);
        return storage.get(id);
    }

    @Override
    public void deleteByID(Long id) {
        storage.remove(id);
    }
}
