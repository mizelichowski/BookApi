package bookapi.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String author;
    private String genre;
    private String description;
    private Integer pageNumber;
    private String format;
    private Date releaseDate;

    public Book() {
    }

    private Book(Builder builder) {
        id = builder.id;
        name = builder.name;
        author = builder.author;
        genre = builder.genre;
        description = builder.description;
        pageNumber = builder.pageNumber;
        format = builder.format;
        releaseDate = builder.releaseDate;
    }


    public static final class Builder {
        private Long id;
        private String name;
        private String author;
        private String genre;
        private String description;
        private Integer pageNumber;
        private String format;
        private Date releaseDate;

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

        public Builder genre(String val) {
            genre = val;
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

        public Builder releaseDate(Date val) {
            releaseDate = val;
            return this;
        }

        public Book build() {
            return new Book(this);
        }
    }
}
