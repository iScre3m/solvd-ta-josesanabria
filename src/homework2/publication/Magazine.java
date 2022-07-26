package homework2.publication;

import java.util.Objects;

public class Magazine extends Publications{

    private String editorial;

    public Magazine(String title, String editorial, int pages, boolean available, Genre genre) {
        super(title, pages, available, genre);
        this.editorial = editorial;
    }

    public String getEditorial() {
        return editorial;
    }

    @Override
    public int hashCode() {
        return 9 * pages * Integer.parseInt(title) - Integer.parseInt(editorial);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj == null){
            return false;
        }
        if (obj instanceof NewsPaper){
            NewsPaper newsPaper = (NewsPaper) obj;
            if(Objects.equals(newsPaper.getTitle(), this.title) && Objects.equals(newsPaper.getEditorial(), this.editorial) && (newsPaper.getPages()==this.pages) && (newsPaper.getGenre()==this.genre)){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        String available = (this.available)?"Available":"Not Available";
        return "Magazine{" +
                "title='" + title + '\'' +
                ", author='" + editorial + '\'' +
                ", pages=" + pages +
                ", " + available +
                ", genre=" + genre +
                '}';
    }
}
