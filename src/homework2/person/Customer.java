package homework2.person;

import homework2.Library;
import homework2.publication.*;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class Customer extends Person {

    private static Logger logger = LogManager.getLogger(Library.class.getName());

    private Genre preferences;
    private double bill;

    public Customer(String name, Genre preferences, double bill) {
        super(name);
        this.preferences = preferences;
        this.bill = bill;
    }

    public double getBill() {
        return bill;
    }

    public void increaseBill(Publication publication, int copies) {
        double discount = 1.00;
        if (publication instanceof Book) {
            discount = ((Book) publication).addDiscount();
            bill += ((Book) publication).calculateBuyPrice(copies) * discount;
        } else if (publication instanceof NewsPaper) {
            bill += ((NewsPaper) publication).calculateBuyPrice(copies) * discount;
        } else if (publication instanceof Pamphlet) {
            bill += ((Pamphlet) publication).calculateCopyPrice(copies) * discount;
        }
    }

    public Genre getPreferences() {
        return preferences;
    }

    public void setPreferences(Genre preferences) {
        this.preferences = preferences;
    }


    @Override
    public void greet(Person person) {
        logger.log(Level.getLevel("DIALOG"), "Hello " + person.getName());
    }

    public Publication choosePublication(Publication[] publications) {
        return publications[(int) Math.floor(((Math.random() * (publications.length))))];
    }

}
