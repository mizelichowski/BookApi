package bookapi.services;

import bookapi.domain.Book;

import java.util.List;

public interface BookService {
    List<Book> getAllBooks();
    List<Book> findByAuthorName(String name);
    List<Book> findByGenre(String genre);
    List<Book> findByName(String name);
}
