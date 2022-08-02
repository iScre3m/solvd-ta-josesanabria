package homework2.person;

import homework2.publication.Genre;
import homework2.publication.Publication;

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
    public void greet(Person person) {
        System.out.println("Hello " + person.getName());
    }

    public Publication choosePublication(Publication[] publications) {
        return publications[(int) Math.floor(((Math.random() * (publications.length))))];
    }
}
