package bookapi.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Set;

public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String author;
    private Set<String> genres;
    private String description;
    private Integer pageNumber;
    private String format;
    private Set<String> countriesAvailable;

    public Book() {
    }

    private Book(Builder builder) {
        id = builder.id;
        name = builder.name;
        author = builder.author;
        genres = builder.genres;
        description = builder.description;
        pageNumber = builder.pageNumber;
        format = builder.format;
        countriesAvailable = builder.countriesAvailable;
    }

    public static final class Builder {
        private Long id;
        private String name;
        private String author;
        private Set<String> genres;
        private String description;
        private Integer pageNumber;
        private String format;
        private Set<String> countriesAvailable;

        public Builder() {
        }

        public Builder id(Long val) {
            id = val;
            return this;
        }

        public Builder name(String val) {
            name = val;
            return this;
        }

        public Builder author(String val) {
            author = val;
            return this;
        }

        public Builder genres(Set<String> val) {
            genres = val;
            return this;
        }

        public Builder description(String val) {
            description = val;
            return this;
        }

        public Builder pageNumber(Integer val) {
            pageNumber = val;
            return this;
        }

        public Builder format(String val) {
            format = val;
            return this;
        }

        public Builder countriesAvailable(Set<String> val) {
            countriesAvailable = val;
            return this;
        }

        public Book build() {
            return new Book(this);
        }
    }
}