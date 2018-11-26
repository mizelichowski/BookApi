package bookapi.services;

import bookapi.domain.Book;
import bookapi.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public List<Book> getAllBooks() {
        List<Book> books = (List<Book>) bookRepository.findAll();
        return books;
    }

    @Override
    public List<Book> findByAuthorName(String name) {
        return bookRepository.findByAuthorName(name);
    }

    @Override
    public List<Book> findByGenre(String genre) {
        return bookRepository.findByGenre(genre);
    }

    @Override
    public List<Book> findByName(String name) {
        return bookRepository.findByName(name);
    }
}
