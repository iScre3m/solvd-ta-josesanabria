package homework2.person;

import homework2.Library;
import homework2.exceptions.NoPublicationsFoundException;
import homework2.publication.Publication;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class Employee extends Person {

    private static Logger logger = LogManager.getLogger(Library.class.getName());

    static {
        logger.info("Employee arrives and opens the library");
    }


    @Override
    public void greet(Person person) {
        logger.log(Level.getLevel("DIALOG"), "Hello " + person.getName() + ", welcome to the library");
    }

    public Employee(String name) {
        super(name);
    }

    public Publication[] search(Publication[] publications, Customer customer) throws NoPublicationsFoundException {
        int publicationCounter = 0;
        for (Publication publication : publications) {
            if (((publication.getGenre()).compareTo(customer.getPreferences())) == 0) {
                publicationCounter++;
            }
        }
        if (publicationCounter == 0) {
            throw new NoPublicationsFoundException("Couldn't find any publication with the preferences of the customer");
        }
        Publication[] publicationsFound = new Publication[publicationCounter];
        publicationCounter = 0;
        for (Publication publication : publications) {
            if (((publication.getGenre()).compareTo(customer.getPreferences())) == 0) {
                publicationsFound[publicationCounter] = publication;
                publicationCounter++;
            }
        }
        return publicationsFound;
    }

    public void changeAvailability(Publication publication) {
        if (publication.getAvailable()) {
            publication.setAvailable(!publication.getAvailable());
        }
    }

    public void checkSamePublication(Publication publication, Publication publication2) {
        publication.isSamePublication(publication2);
    }

}
