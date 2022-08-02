package homework2.publication;


import java.util.Objects;

public class Book extends Publication {

    private final String author;

    public Book(String title, String author, int pages, boolean available, Genre genre) {
        super(title, pages, available, genre);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        String available = (this.available) ? "Available" : "Not Available";
        return "Book " + title + '\'' +
                ", author: '" + author + '\'' +
                ", pages: " + pages +
                ", " + available +
                ", genre: " + genre;
    }

    @Override
    public int hashCode() {
        return 7 + pages + Integer.parseInt(title) * Integer.parseInt(author);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (obj instanceof Book) {
            Book book = (Book) obj;
            if (Objects.equals(book.getTitle(), this.title) && Objects.equals(book.getAuthor(), this.author) && (book.getPages() == this.pages) && (book.getGenre() == this.genre)) {
                return true;
            }
        }
        return false;
    }


}
