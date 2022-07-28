package homework2.person;

import homework2.publication.Publications;

import java.util.ArrayList;

public final class Employee extends Person {

    public Employee(String name) {
        super(name);
    }

    @Override
    public void search(ArrayList<Publications> publicationList) {
        for (Publications publication : publicationList) {
            System.out.println(publication);
        }
    }

    public void changeAvailability(Publications publication) {
        if (publication.getAvailable()) {
            publication.setAvailable(!publication.getAvailable());
        }
    }
}
