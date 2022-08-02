package homework2.publication;

public class ComicBook extends Publication {

    private final String editorial;

    public ComicBook(String title, String editorial, int pages, boolean available, Genre genre) {
        super(title, pages, available, genre);
        this.editorial = editorial;
    }

    public String getEditorial() {
        return editorial;
    }
}
