package bookapi.repositories;

import bookapi.domain.Book;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {

    @Query(nativeQuery = true,
            value = "SELECT * FROM bookapi.book WHERE author LIKE %:name%")
    List<Book> findByAuthorName(@Param("name") String name);

    @Query(nativeQuery = true,
            value = "SELECT * FROM bookapi.book WHERE genre LIKE %:genre%")
    List<Book> findByGenre(@Param("genre") String genre);

    @Query(nativeQuery = true,
            value = "SELECT * FROM bookapi.book WHERE name LIKE %:name%")
    List<Book> findByName(@Param("name") String name);

}
