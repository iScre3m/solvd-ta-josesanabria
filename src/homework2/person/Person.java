package homework2.person;

import homework2.publication.Publications;

import java.util.ArrayList;

abstract public class Person {

    protected String name;

    public Person() {
    }

    public final void greet(Person person) {
        System.out.println("Hello " + person.getName());
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void search(ArrayList<Publications> publicationList);
}
