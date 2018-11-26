package bookapi.controllers;

import bookapi.domain.Book;
import bookapi.repositories.BookRepository;
import bookapi.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class BookController {

    @Autowired
    private BookService bookService;

    @Autowired
    private BookRepository bookRepository;

    @GetMapping(path = "/total", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public Long totalAmount() {
        return bookRepository.count();
    }

    @GetMapping(path = "/all", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @GetMapping(path = "/a", params = {"name"})
    @ResponseBody
    public List<Book> getBooksByAuthorName(@RequestParam("name") String name) {
        return bookService.findByAuthorName(name);
    }
}