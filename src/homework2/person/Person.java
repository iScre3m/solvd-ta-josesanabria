package homework2.person;

import homework2.Library;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

abstract public class Person {

    private static Logger logger = LogManager.getLogger(Library.class.getName());

    protected String name;

    public Person() {
        personEnters();
    }

    public Person(String name) {
        this();
        this.name = name;
    }

    public static void personEnters() {
        logger.info("Cling cling, a person enters the library");
    }

    public abstract void greet(Person person);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
