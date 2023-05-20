package hu.nye.progkor.dndcharacterdatabase.data.repository;

import java.util.List;

/**
 * Interface for the character database
 * @param <T>
 * @param <ID>
 */
public interface Repository<T, ID> {

    T save(T item);

    T getByID(ID id);

    List<T> getAll();

    T update(T item);

    void deleteByID(ID id);
}
