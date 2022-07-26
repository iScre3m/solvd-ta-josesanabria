package homework2.publication;


public class Paper extends Publications{

    private String author;

    public Paper(String title, String author, int pages, boolean available, Genre genre) {
        super(title, pages, available, genre);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
}
