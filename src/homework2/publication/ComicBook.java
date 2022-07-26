package homework2.publication;

public class ComicBook extends Publications{

    private String editorial;

    public ComicBook(String title,String editorial, int pages, boolean available, Genre genre) {
        super(title, pages, available, genre);
        this.editorial = editorial;
    }

    public String getEditorial() {
        return editorial;
    }
}
