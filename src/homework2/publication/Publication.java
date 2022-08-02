package homework2.publication;


public abstract class Publication {

    protected String title;
    protected int pages;
    protected boolean available;
    protected Genre genre;

    public Publication(String title, int pages, boolean available, Genre genre) {
        this.title = title;
        this.pages = pages;
        this.available = available;
        this.genre = genre;
    }


    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }

    public boolean getAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public Genre getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "Publications{" +
                "title='" + title + '\'' +
                ", pages=" + pages +
                ", available=" + available +
                ", genre=" + genre +
                '}';
    }

    public final void isSamePublication(Publication publication) {

        if (this.equals(publication)) {
            System.out.println(this.title + " and " + publication.getTitle() + " are the same");
        } else
            System.out.println(this.title + " and " + publication.getTitle() + " are different");
    }

}
