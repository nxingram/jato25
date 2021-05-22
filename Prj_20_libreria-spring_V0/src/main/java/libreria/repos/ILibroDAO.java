package libreria.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import libreria.entities.Libro;

/**
 * JpaRepository<Libro, Integer>
 * Entity: Libro
 * PrimaryKey: Integer 
 * 
 * Interface ->> Extends ->> Interface
 */
public interface ILibroDAO extends JpaRepository<Libro, Integer> {

}
