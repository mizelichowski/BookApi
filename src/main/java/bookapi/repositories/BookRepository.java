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
            value = "SELECT * FROM bookapi.book WHERE author = :authorName")
    List<Book> findByAuthorName(@Param("authorName") String authorName);

}
