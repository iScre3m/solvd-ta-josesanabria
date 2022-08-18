package homework2;

import homework2.exceptions.DuplicatedPublicationException;
import homework2.exceptions.InvalidNumberException;
import homework2.exceptions.NoPublicationsFoundException;
import homework2.person.Customer;
import homework2.person.Employee;
import homework2.publication.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Library {

    private static Logger logger = LogManager.getLogger(Library.class.getName());

    public static void main(String[] args) {

        Book book1 = new Book("The Hacienda", "Isabel Cañas", 352, true, Genre.MYSTERY, "The small mind is fully of relativity");
        Book book2 = new Book("Moby-Dick", "Herman Melville", 360, true, Genre.CLASSICS, "The visitor is like the cow");
        NewsPaper newsPaper1 = new NewsPaper("20 of May 2022", "The New York Times", 45, true, Genre.CLASSICS, "Always confidently receive the ancient lord. For today's weather it will be sunny");
        Magazine magazine1 = new Magazine("ALL ABOUT LOVE", "Vogue", 40, true, Genre.ROMANCE, "The pit is full of control. Silence acquires when you praise with parador.");
        Book book3 = new Book("The Hacienda", "Isabel Cañas", 352, true, Genre.MYSTERY, "Thought is the only life, the only guarantee totally");
        Pamphlet pamphlet1 = new Pamphlet("Rehab", 3, true, Genre.RELIGION, "We take your problems seriously, come to our classes");
        ComicBook comicBook1 = new ComicBook("Flash", "DC Comics", 30, true, Genre.FANTASY, "Sorry I am late, th-there is hope, Time to save the world");
        Employee employee1 = new Employee("Olga");
        Customer customer1 = new Customer("Charles", Genre.WAR, 0);

        employee1.greet(customer1);
        customer1.greet(employee1);

        Publication[] publications = {book1, book2, newsPaper1, magazine1, book3, pamphlet1, comicBook1};

        Publication[] publicationsFound;
        try {
            publicationsFound = employee1.search(publications, customer1);
        } catch (NoPublicationsFoundException e) {
            logger.warn(e);
            customer1.setPreferences(Genre.CLASSICS);
            publicationsFound = employee1.search(publications, customer1);
        }

        Publication publicationChosen = customer1.choosePublication(publicationsFound);
        logger.info("Publication chosen = " + publicationChosen);

        employee1.changeAvailability(publicationChosen);
        logger.warn("Publication " + publicationChosen.getTitle() + " is " + ((publicationChosen.getAvailable()) ? "Available" : "Not Available"));


        try {
            customer1.increaseBill(publicationChosen, 3);
        } catch (InvalidNumberException e) {
            logger.error(e);
        }

        logger.info("The current bill of " + customer1.getName() + " is: " + String.format("$ %.2f", customer1.getBill()));

        try {
            employee1.checkSamePublication(book1, book1);
        } catch (DuplicatedPublicationException e) {
            logger.error(e);
            //e.printStackTrace();
        }

    }

}
