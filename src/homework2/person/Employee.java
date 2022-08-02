package homework2.person;

import homework2.publication.Publication;

public final class Employee extends Person {

    @Override
    public void greet(Person person) {
        System.out.println("Hello " + person.getName() + ", welcome to the library");
    }

    public Employee(String name) {
        super(name);
    }

    public Publication[] search(Publication[] publications, Customer customer) {
        int publicationCounter = 0;
        for (Publication publication : publications) {
            if (((publication.getGenre()).compareTo(customer.getPreferences())) == 0) {
                publicationCounter++;
            }
        }
        Publication[] publications2 = new Publication[publicationCounter];
        publicationCounter = 0;
        for (Publication publication : publications) {
            if (((publication.getGenre()).compareTo(customer.getPreferences())) == 0) {
                publications2[publicationCounter] = publication;
                publicationCounter++;
            }
        }
        return publications2;
    }


    public void changeAvailability(Publication publication) {
        if (publication.getAvailable()) {
            publication.setAvailable(!publication.getAvailable());
        }
    }
}
