package bookapi.domain;

import javax.persistence.*;

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
    private String releaseDate;

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
        private String releaseDate;

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

        public Builder releaseDate(String val) {
            releaseDate = val;
            return this;
        }

        public Book build() {
            return new Book(this);
        }
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public String getDescription() {
        return description;
    }

    public Integer getPageNumber() {
        return pageNumber;
    }

    public String getFormat() {
        return format;
    }

    public String getReleaseDate() {
        return releaseDate;
    }
}
