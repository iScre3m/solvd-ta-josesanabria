package homework2.person;

import homework2.publication.Genre;
import homework2.publication.Publications;

import java.util.ArrayList;

public final class Customer extends Person {

    private Genre preferences;

    public Customer(String name, Genre preferences) {
        super(name);
        this.preferences = preferences;
    }


    public Genre getPreferences() {
        return preferences;
    }

    public void setPreferences(Genre preferences) {
        this.preferences = preferences;
    }


    @Override
    public void search(ArrayList<Publications> publicationList) {
        for (Publications publication : publicationList) {
            if (((publication.getGenre()).compareTo(preferences)) == 0) {
                System.out.println(publication);
            }
        }
    }
}
